package ru.muhamedshin.diplom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.muhamedshin.diplom.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByTitle(String title);
}
