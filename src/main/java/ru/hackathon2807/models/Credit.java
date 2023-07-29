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
@Table(name = "credits")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private final Long id;
    @Column(name = "credit_name", nullable = false, length = 320)
    private final String name;
    @Column(name = "min_amount", nullable = false)
    private final Integer minAmount;
    @Column(name = "max_amount", nullable = false)
    private final Integer maxAmount;
    @Column(name = "min_tern", nullable = false)
    private final Integer minTern;
    @Column(name = "max_tern", nullable = false)
    private final Integer maxTern;
    @Column(name = "interest_rate", nullable = false)
    private final Float interestRate;
    @OneToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
}
