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
@Table(name = "debit_cards")
public class DebitCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "debit_card_id")
    private final Long id;
    @Column(name = "debit_card_name", nullable = false, length = 320)
    private final String name;
    @Column(name = "description", nullable = false, length = 1000)
    private final String description;
}
