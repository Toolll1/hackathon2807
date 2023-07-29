package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
    Insurance findByBankName(String bank);
}
