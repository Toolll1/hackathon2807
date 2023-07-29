package ru.hackathon2807.controllers.admin;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hackathon2807.dto.UniversityCreateDto;
import ru.hackathon2807.services.UniversityService;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/university/admin")
public class UniversityControllerAdmin {

    private final UniversityService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UniversityCreateDto createUniversity(@Valid @RequestBody UniversityCreateDto dto) {

        log.info("Received a request to create a university " + dto);

        return service.createUniversity(dto);
    }

    @PatchMapping("/{universityId}")
    public UniversityCreateDto updateUniversity(@RequestBody UniversityCreateDto dto,
                                                @PathVariable Long universityId) {

        log.info("Received a request to update a university {}. universityId = {}", dto, universityId);

        return service.updateUniversity(dto, universityId);
    }

    @DeleteMapping("/{universityId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUniversity(@PathVariable Long universityId) {


        log.info("Received a request to delete a university with an id " + universityId);

        service.deleteUniversity(universityId);
    }

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
