package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
