package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.InsuranceDto;
import ru.hackathon2807.models.Insurance;

@Service
public class InsuranceMapper {

    public static InsuranceDto objectToDto(Insurance insurance) {

        return InsuranceDto.builder()
                .name(insurance.getName())
                .description(insurance.getDescription())
                .bank(insurance.getBank().getName())
                .build();
    }
}
