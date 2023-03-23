package ru.muhamedshin.diplom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.muhamedshin.diplom.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
