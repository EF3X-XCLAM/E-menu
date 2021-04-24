package com.emenu.emenu;

import java.util.Optional;

public interface CategorySerInter {
    public Iterable<Category> findAll();
    Optional<Category> findById(Integer id);
}
