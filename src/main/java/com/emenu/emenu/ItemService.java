package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    public String getImgData(byte[] byteData) {
        return Base64.getMimeEncoder().encodeToString(byteData);
    }

    public Iterable<Category> menu(){

        List<Item> newlist = (List<Item>) itemRepository.findAll();
        List<Category> cat = new ArrayList<Category>();
        Optional<Category> temp;

        if(newlist.isEmpty() == false){

            temp = categoryService.findById( newlist.get(0).getCategory().getCtID());
            cat.add(temp.get());

            for(int i =0; i < newlist.size(); i++){
                if(!(cat.get(cat.size() -1).getCtID() == newlist.get(i).getCategory().getCtID())){
                    temp = categoryService.findById( newlist.get(i).getCategory().getCtID());
                    cat.add(temp.get());
                }
            }
        }
       //System.out.println(cat.get(0).getCt_name());
        return cat;
    }

}