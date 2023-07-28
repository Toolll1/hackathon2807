package ru.hackathon2807.controllers.admin;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.UserReplyDto;
import ru.hackathon2807.services.UserService;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users/admin")
public class UserControllerAdmin {

    private final UserService service;

    @GetMapping("/{userId}")
    public UserReplyDto getUser(@PathVariable Long userId) {

        log.info("Received a request to search user for id {}", userId);

        return service.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long userId) {

        log.info("Received a request to delete a user with an id " + userId);

        service.deleteUser(userId);
    }
}
