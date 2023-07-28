package ru.hackathon2807.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon2807.models.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
