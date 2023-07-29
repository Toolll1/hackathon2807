package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional <User> findByTelephone(String telephone);
}
