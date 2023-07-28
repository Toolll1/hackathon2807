package ru.hackathon2807.services;

import ru.hackathon2807.dto.UserCreateDto;
import ru.hackathon2807.dto.UserReplyDto;

public interface UserService {

    UserReplyDto createUser(UserCreateDto dto);

    void deleteUser(Long userId);

    UserReplyDto getUser(Long userId);

    UserReplyDto updateUser(UserCreateDto dto, Long userId);
}
