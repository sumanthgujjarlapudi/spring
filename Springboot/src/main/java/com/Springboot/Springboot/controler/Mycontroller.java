package com.Springboot.Springboot.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {



    @GetMapping("/")
    public String Mymsg(){
        return "Welcome to my first spring web";
    }

}
