package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.CreditCardDto;
import ru.hackathon2807.models.CreditCard;

@Service
public class CreditCardMapper {

    public static CreditCardDto objectToDto(CreditCard creditCard) {

        return CreditCardDto.builder()
                .name(creditCard.getName())
                .description(creditCard.getDescription())
                .bank(creditCard.getBank().getName())
                .build();
    }
}
