package com.emenu.emenu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {
    List<Category> findAll();

    @Override
    Optional<Category> findById(Integer integer);
}