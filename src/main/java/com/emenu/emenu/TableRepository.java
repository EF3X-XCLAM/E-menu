package com.emenu.emenu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TableRepository extends JpaRepository<Tab, Integer> {
    @Override
    Optional<Tab> findById(Integer integer);
}
