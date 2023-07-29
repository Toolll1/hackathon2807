package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.DebitCardDto;
import ru.hackathon2807.models.DebitCard;

@Service
public class DebitCardMapper {

    public static DebitCardDto objectToDto(DebitCard debitCard) {

        return DebitCardDto.builder()
                .name(debitCard.getName())
                .description(debitCard.getDescription())
                .bank(debitCard.getBank().getName())
                .build();
    }
}
