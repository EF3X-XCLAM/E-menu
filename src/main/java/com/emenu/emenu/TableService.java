package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TableService implements TableSerInter{

    @Autowired
    private TableRepository tableRepository;

    @Override
    public Optional<Tab> findById(Integer id) {
        return tableRepository.findById(id);
    }

    public Tab getTable(Integer id){
        Optional<Tab> tab;
        Tab number;

        tab = tableRepository.findById(id);
        number = tab.get();

        return number;
    }
}
