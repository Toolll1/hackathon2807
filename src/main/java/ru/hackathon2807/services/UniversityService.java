package ru.hackathon2807.services;

import ru.hackathon2807.dto.UniversityCreateDto;

import java.util.List;

public interface UniversityService {
    UniversityCreateDto createUniversity(UniversityCreateDto dto);

    UniversityCreateDto updateUniversity(UniversityCreateDto dto, Long universityId);

    void deleteUniversity(Long universityId);

    UniversityCreateDto getUniversity(Long universityId);

    List<UniversityCreateDto> getUniversitys(Integer from, Integer size);
}
