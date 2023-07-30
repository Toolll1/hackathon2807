package ru.hackathon2807.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")
    private final Long id;
    @Column(name = "faculty_name", nullable = false, length = 320)
    private final String name;
    @Column(name = "programs", nullable = false, length = 320)
    private final String programs;
    @Column(name = "tuition_fees", nullable = false)
    private final String tuitionFees;
}
