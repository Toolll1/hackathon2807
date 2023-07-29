package ru.hackathon2807.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hackathon2807.dto.UniversityCreateDto;
import ru.hackathon2807.exceptions.ConflictException;
import ru.hackathon2807.exceptions.ObjectNotFoundException;
import ru.hackathon2807.mappers.UniversityMapper;
import ru.hackathon2807.models.University;
import ru.hackathon2807.repositories.UniversityRepository;
import ru.hackathon2807.services.UniversityService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;
    private final UniversityMapper universityMapper;

    @Override
    public UniversityCreateDto createUniversity(UniversityCreateDto dto) {

        University university = universityRepository.save(universityMapper.dtoToObject(dto));

        return UniversityMapper.objectToDto(university);
    }

    @Override
    public UniversityCreateDto updateUniversity(UniversityCreateDto dto, Long universityId) {

        University university = findUniversityById(universityId);

        if (dto.getName() != null && !dto.getName().isEmpty() && !dto.getName().isBlank()) {
            if (dto.getName().length() < 2 || dto.getName().length() > 320) {
                throw new ConflictException("incorrect name");
            }
            university.setName(dto.getName());
        }

        return UniversityMapper.objectToDto(university);
    }

    @Override
    public void deleteUniversity(Long universityId) {

        universityRepository.delete(findUniversityById(universityId));
    }

    @Override
    public UniversityCreateDto getUniversity(Long universityId) {

        return UniversityMapper.objectToDto(findUniversityById(universityId));
    }

    @Override
    public List<UniversityCreateDto> getUniversitys(Integer from, Integer size) {

        return universityRepository.findAll(PageRequest.of(from / size, size)).stream().map(UniversityMapper::objectToDto).collect(Collectors.toList());
    }

    private University findUniversityById(Long universityId) {

        return universityRepository.findById(universityId).orElseThrow(() -> new ObjectNotFoundException("There is no university with this id"));
    }
}
