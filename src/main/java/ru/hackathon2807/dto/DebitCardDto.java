package ru.hackathon2807.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class DebitCardDto {

    private final String name;
    private static final Float discount = 0.5F;
    private final String description;
    private String bank;
}
