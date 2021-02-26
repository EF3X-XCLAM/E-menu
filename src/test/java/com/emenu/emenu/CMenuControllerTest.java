package com.emenu.emenu;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static
        org.hamcrest.Matchers.containsString;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(CMenuController.class)
public class CMenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCMenuPage() throws Exception{
        mockMvc.perform(get("/")).andExpect(status().isOk())
                .andExpect(view().name("cmenu"))
                .andExpect(content().string(containsString("Menu")));
    }

}
