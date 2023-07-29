package ru.hackathon2807.controllers.priv;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hackathon2807.dto.CreditDto;
import ru.hackathon2807.services.BankService;

import java.util.List;
import java.util.Map;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bank")
public class BankControllerPrivate {

    private final BankService service;

    @GetMapping("/credits/application")
    public Map<CreditDto, List <Object>> getCreditsApplication() {

        log.info("Received a request to search credits");

        return service.getCreditsApplication();
    }

}
