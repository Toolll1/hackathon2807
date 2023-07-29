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
@Table(name = "credit_cards")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_card_id")
    private final Long id;
    @Column(name = "credit_card_name", nullable = false, length = 320)
    private final String name;
    @Column(name = "description", nullable = false, length = 1000)
    private final String description;
    @OneToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
}
