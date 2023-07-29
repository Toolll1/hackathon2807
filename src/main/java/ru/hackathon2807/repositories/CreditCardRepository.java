package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.CreditCard;

public interface CreditCardRepository  extends JpaRepository<CreditCard, Long> {
    CreditCard findByBankName(String bank);
}
