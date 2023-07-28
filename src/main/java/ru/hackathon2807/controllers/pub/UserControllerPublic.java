package ru.hackathon2807.controllers.pub;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.UserCreateDto;
import ru.hackathon2807.dto.UserReplyDto;
import ru.hackathon2807.services.UserService;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserControllerPublic {

    private final UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserReplyDto createUser(@Valid @RequestBody UserCreateDto dto) {

        log.info("Received a request to create a user " + dto);

        return service.createUser(dto);
    }
}
