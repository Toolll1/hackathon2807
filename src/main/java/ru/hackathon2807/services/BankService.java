package ru.hackathon2807.services;

import ru.hackathon2807.dto.BankCreateDto;
import ru.hackathon2807.dto.CreditDto;

import java.util.List;
import java.util.Map;

public interface BankService {
    BankCreateDto createBank(BankCreateDto dto);

    BankCreateDto updateBank(BankCreateDto dto, Long bankId);

    void deleteBank(Long bankId);

    BankCreateDto getBank(Long bankId);

    List<BankCreateDto> getBanks(Integer from, Integer size);

    List<CreditDto> getCredits(Integer from, Integer size);

    Map<CreditDto, List<Object>> getCreditsApplication();
}
