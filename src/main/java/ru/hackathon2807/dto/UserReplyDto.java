package ru.hackathon2807.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserReplyDto {

    private final String fullName;
    private final String email;
    private final String passport;
}
