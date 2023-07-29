package ru.hackathon2807.mappers;

import org.springframework.stereotype.Service;
import ru.hackathon2807.dto.UniversityCreateDto;
import ru.hackathon2807.models.University;

@Service
public class UniversityMapper {

    public static UniversityCreateDto objectToDto(University university) {

        return UniversityCreateDto.builder()
                .name(university.getName())
                .faculties(university.getFaculties())
                .build();
    }

    public University dtoToObject(UniversityCreateDto dto) {

        return University.builder()
                .name(dto.getName())
                .faculties(dto.getFaculties())
                .build();
    }
}
