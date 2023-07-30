package ru.hackathon2807.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hackathon2807.models.Faculty;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class UniversityCreateDto {

    private  String name;
    private  String description;
    private String logo;
    private List<Faculty> faculties;
}
