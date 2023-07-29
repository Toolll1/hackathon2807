package ru.hackathon2807.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class CreditDto {

    private final String name;
    private final Integer minAmount;
    private final Integer maxAmount;
    private final Integer minTern;
    private final Integer maxTern;
    private final Float interestRate;
    private String bank;
}
