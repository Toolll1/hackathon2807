package ru.hackathon2807.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon2807.dto.BankCreateDto;
import ru.hackathon2807.dto.CreditCardDto;
import ru.hackathon2807.dto.CreditDto;
import ru.hackathon2807.exceptions.ConflictException;
import ru.hackathon2807.exceptions.ObjectNotFoundException;
import ru.hackathon2807.mappers.*;
import ru.hackathon2807.models.Bank;
import ru.hackathon2807.repositories.*;
import ru.hackathon2807.services.BankService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    private final CreditRepository creditRepository;
    private final CreditCardRepository creditCardRepository;
    private final DebitCardRepository debitCardRepository;
    private final InsuranceRepository insuranceRepository;
    private final BankMapper bankMapper;

    @Override
    public Map<CreditDto, List<Object>> getCreditsApplication() {

        Map<CreditDto, List<Object>> result = new HashMap<>();

        for (CreditDto credit : getCredits(0, 10)) {
            List<Object> cross = new ArrayList<>();
            cross.add(CreditCardMapper.objectToDto(creditCardRepository.findByBankName(credit.getBank())));
            cross.add(DebitCardMapper.objectToDto(debitCardRepository.findByBankName(credit.getBank())));
            cross.add(InsuranceMapper.objectToDto(insuranceRepository.findByBankName(credit.getBank())));
            result.put(credit, cross);
        }

        return result;
    }

    @Override
    public List<CreditDto> getCredits(Integer from, Integer size) {

        return creditRepository.findAll(PageRequest.of(from / size, size, Sort.by("interestRate")))
                .stream()
                .map(CreditMapper::objectToDto)
                .collect(Collectors.toList());
    }

    @Override
    public BankCreateDto createBank(BankCreateDto dto) {

        Bank bank = bankRepository.save(bankMapper.dtoToObject(dto));

        return BankMapper.objectToDto(bank);
    }

    @Override
    public BankCreateDto updateBank(BankCreateDto dto, Long bankId) {

        Bank bank = findBankById(bankId);

        if (dto.getName() != null && !dto.getName().isEmpty() && !dto.getName().isBlank()){
            if (dto.getName().length() < 2 || dto.getName().length() > 320){
                throw new ConflictException("incorrect name");
            }
            bank.setName(dto.getName());
        }

        return BankMapper.objectToDto(bank);
    }

    @Override
    public void deleteBank(Long bankId) {

        bankRepository.delete(findBankById(bankId));
    }

    @Override
    public BankCreateDto getBank(Long bankId) {

        return BankMapper.objectToDto(findBankById(bankId));
    }

    @Override
    public List<BankCreateDto> getBanks(Integer from, Integer size) {

        return bankRepository.findAll(PageRequest.of(from / size, size)).stream().map(BankMapper::objectToDto).collect(Collectors.toList());
    }

    public Bank findBankById(Long bankId) {

        return bankRepository.findById(bankId).orElseThrow(() -> new ObjectNotFoundException("There is no bank with this id"));
    }
}
