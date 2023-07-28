package ru.hackathon2807.controllers.priv;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.UserCreateDto;
import ru.hackathon2807.dto.UserReplyDto;
import ru.hackathon2807.exceptions.BadRequestException;
import ru.hackathon2807.services.UserService;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserControllerPrivate {

    private final UserService service;

    @GetMapping("/{userId}")
    public UserReplyDto getUser(@PathVariable Long userId,
                                @RequestHeader("X-Sharer-Owner-Id") Long ownerId) {


        checkingRights(userId, ownerId, "You cannot request another user's data");


        log.info("Received a request to search user for id {}", userId);

        return service.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long userId,
                           @RequestHeader("X-Sharer-Owner-Id") Long ownerId) {

        checkingRights(userId, ownerId, "You cannot delete another user");

        log.info("Received a request to delete a user with an id " + userId);

        service.deleteUser(userId);
    }

    @PatchMapping("/{userId}")
    public UserReplyDto updateUser(@RequestBody UserCreateDto dto,
                                    @PathVariable Long userId,
                                    @RequestHeader("X-Sharer-Owner-Id") Long ownerId) {

        checkingRights(userId, ownerId, "You cannot update another user's data");

        log.info("Received a request to Private update a user {}. userId = {}", dto, userId);

        return service.updateUser(dto, userId);
    }

    private void checkingRights(Long userId, Long ownerId, String text) {

        if (!userId.equals(ownerId)) {
            throw new BadRequestException(text);
        }
    }
}
