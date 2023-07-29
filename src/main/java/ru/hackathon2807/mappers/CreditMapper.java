package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.CreditDto;
import ru.hackathon2807.models.Credit;

@Service
public class CreditMapper {

    public static CreditDto objectToDto(Credit credit) {

        return CreditDto.builder()
                .name(credit.getName())
                .minAmount(credit.getMinAmount())
                .maxAmount(credit.getMaxAmount())
                .minTern(credit.getMinTern())
                .maxTern(credit.getMaxTern())
                .interestRate(credit.getInterestRate())
                .bank(credit.getBank().getName())
                .logo(credit.getBank().getLogo())
                .build();
    }
    }
