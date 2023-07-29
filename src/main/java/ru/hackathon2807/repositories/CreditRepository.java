package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
