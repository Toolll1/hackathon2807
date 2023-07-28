package ru.hackathon2807.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserCreateDto {

    private final Long id;
    @NotBlank
    @Size(min = 2, max = 100)
    private final String lastName;
    @NotBlank
    @Size(min = 2, max = 100)
    private final String firstName;
    @Size(min = 2, max = 100)
    private final String patronymic;
    @Email
    @NotBlank
    @Size(min = 6, max = 320)
    private final String email;
    @NotBlank
    @Size(min = 4, max = 4)
    private final String passportSeries;
    @NotBlank
    @Size(min = 6, max = 6)
    private final String passportNumber;
    @NotBlank
    @Size(min = 2, max = 1000)
    private final String passportIssued; //кем выдан
    @NotBlank
    @Size(min = 10, max = 10)
    private final String passportDate;
    @NotBlank
    @Size(min = 6, max = 6)
    private final String passportKp;  //код подразделения
}
