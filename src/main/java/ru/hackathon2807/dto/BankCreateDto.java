package ru.hackathon2807.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class BankCreateDto {

    @NotBlank
    @Size(min = 2, max = 320)
    private final String name;
}
