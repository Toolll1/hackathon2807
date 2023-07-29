package ru.hackathon2807.controllers.admin;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.TelephoneDto;
import ru.hackathon2807.dto.UserReplyDto;
import ru.hackathon2807.services.UserService;

import javax.validation.constraints.Min;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users/admin")
public class UserControllerAdmin {

    private final UserService service;

    @GetMapping("/telephone")
    public UserReplyDto getUserByTelephone (@RequestBody TelephoneDto dto) {

        log.info("Received a request to search user for telephone {}", dto.getTelephone());

        return service.getUserByTelephone(dto.getTelephone());
    }

    @GetMapping("/{userId}")
    public UserReplyDto getUser(@PathVariable Long userId) {

        log.info("Received a request to search user for id {}", userId);

        return service.getUser(userId);
    }

    @GetMapping
    public List<UserReplyDto> getUsers(@RequestParam(value = "from", defaultValue = "0") @Min(0) Integer from,
                                       @RequestParam(value = "size", defaultValue = "10") @Min(1) Integer size) {

        log.info("Received a request to search all users}");

        return service.getUsers(from, size);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long userId) {

        log.info("Received a request to delete a user with an id " + userId);

        service.deleteUser(userId);
    }
}
