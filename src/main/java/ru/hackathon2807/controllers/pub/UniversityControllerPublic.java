package ru.hackathon2807.controllers.pub;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.UniversityCreateDto;
import ru.hackathon2807.services.UniversityService;

import javax.validation.constraints.Min;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/university")
public class UniversityControllerPublic {

    private final UniversityService service;

    @GetMapping("/{universityId}")
    public UniversityCreateDto getUniversity(@PathVariable Long universityId) {

        log.info("Received a request to search university for id {}", universityId);

        return service.getUniversity(universityId);
    }

    @GetMapping
    public List<UniversityCreateDto> getUniversitys(@RequestParam(value = "from", defaultValue = "0") @Min(0) Integer from,
                                                    @RequestParam(value = "size", defaultValue = "10") @Min(1) Integer size) {

        log.info("Received a request to search all university}");

        return service.getUniversitys(from, size);
    }
}
