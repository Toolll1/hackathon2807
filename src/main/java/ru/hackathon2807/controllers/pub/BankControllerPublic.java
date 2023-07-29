package ru.hackathon2807.controllers.pub;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.BankCreateDto;
import ru.hackathon2807.dto.CreditDto;
import ru.hackathon2807.services.BankService;

import javax.validation.constraints.Min;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bank")
public class BankControllerPublic {

    private final BankService service;

    @GetMapping("/credits")
    public List<CreditDto> getCredits(@RequestParam(value = "from", defaultValue = "0") @Min(0) Integer from,
                                      @RequestParam(value = "size", defaultValue = "10") @Min(1) Integer size) {

        log.info("Received a request to search credits");

        return service.getCredits(from, size);
    }

    @GetMapping
    public List<BankCreateDto> getBanks(@RequestParam(value = "from", defaultValue = "0") @Min(0) Integer from,
                                        @RequestParam(value = "size", defaultValue = "10") @Min(1) Integer size) {

        log.info("Received a request to search all banks}");

        return service.getBanks(from, size);
    }
}
