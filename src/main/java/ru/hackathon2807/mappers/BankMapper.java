package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.BankCreateDto;
import ru.hackathon2807.models.Bank;

@Service
public class BankMapper {

    public static BankCreateDto objectToDto(Bank bank) {

        return BankCreateDto.builder()
                .name(bank.getName())
                .logo(bank.getLogo())
                .build();
    }

    public Bank dtoToObject(BankCreateDto dto) {

        return Bank.builder()
                .name(dto.getName())
                .logo(dto.getLogo())
                .build();
    }
}
