package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ItemService implements ItemSerInter{
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryService categoryService;

    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    public Iterable<Item> menu(){

        List<Item> newlist = (List<Item>) itemRepository.findAll();
        List<Optional<Category>> cat = null;

        /*for(int i =0; i < cat.size(); i++){


            if(cat.get(i).getCtID() == newlist.get(i).){

            }
            System.out.println(cat.get(i));
        }*/


        for(int i =0; i < newlist.size(); i++){

            cat.add(categoryService.findById( newlist.get(i).getCategory().getCtID()));
            System.out.println(cat);
        }
        Set<Optional<Category>> set = new HashSet<Optional<Category>>(cat);
        cat.clear();
        cat.addAll(set);
        System.out.println("-------------");
        System.out.println(cat);

        return itemRepository.findAll();
    }

}
