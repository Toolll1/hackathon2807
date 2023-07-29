package ru.hackathon2807.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Entity
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private final Long id;
    @Column(name = "university_name", nullable = false, length = 320)
    private  String name;
    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Faculty.class, fetch = FetchType.LAZY)
    @JoinTable(name = "university_faculties",
            joinColumns = @JoinColumn(name = "university_id", referencedColumnName = "university_id"))
    private List<Faculty> faculties = new ArrayList<>();
}
