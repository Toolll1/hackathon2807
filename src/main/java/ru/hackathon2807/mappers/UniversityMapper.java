package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.UniversityCreateDto;
import ru.hackathon2807.models.University;

@Service
public class UniversityMapper {

    public static UniversityCreateDto objectToDto(University university) {

        return UniversityCreateDto.builder()
                .name(university.getName())
                .description(university.getDescription())
                .logo(university.getLogo())
                .faculties(university.getFaculties())
                .build();
    }

    public University dtoToObject(UniversityCreateDto dto) {

        return University.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .logo(dto.getLogo())
                .faculties(dto.getFaculties())
                .build();
    }
}
