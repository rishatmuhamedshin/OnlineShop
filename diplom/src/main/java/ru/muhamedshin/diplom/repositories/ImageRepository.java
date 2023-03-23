package ru.muhamedshin.diplom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.muhamedshin.diplom.model.Image;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
