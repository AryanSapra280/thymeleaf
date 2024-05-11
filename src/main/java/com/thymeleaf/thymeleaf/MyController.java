package com.thymeleaf.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.*;



@Controller
public class MyController {

    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("name", "aryan");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }

    @GetMapping("bucket")
    public String getMethodName(Model model) {
        List<String>items = new ArrayList<>();
        items.add("aaloo");
        items.add("Gobi");
        items.add("Bhindi");
        model.addAttribute("items", items);
        return "bucket";
    }
    
}
