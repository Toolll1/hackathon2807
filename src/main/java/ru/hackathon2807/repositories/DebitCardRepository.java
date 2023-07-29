package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.DebitCard;

public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
    DebitCard findByBankName(String bank);
}
