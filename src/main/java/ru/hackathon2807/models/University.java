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
    @Column(name = "description", nullable = false, length = 1000)
    private final String description;
    @Column(name = "logo")
    private String logo;

/*    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Faculty.class, fetch = FetchType.LAZY)
    @JoinTable(name = "university_faculties",
            joinColumns = @JoinColumn(name = "university_id", referencedColumnName = "university_id"))
    private List<Faculty> faculties = new ArrayList<>();*/
/*    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private List<Faculty> faculties;*/
@ToString.Exclude
@ManyToMany(cascade = CascadeType.ALL, targetEntity = Faculty.class)
@JoinTable(name = "university_faculties",
        joinColumns = @JoinColumn(name = "university_id", referencedColumnName = "university_id"),
        inverseJoinColumns = @JoinColumn(name = "faculty_id", referencedColumnName = "faculty_id"))
private List<Faculty> faculties;
}
