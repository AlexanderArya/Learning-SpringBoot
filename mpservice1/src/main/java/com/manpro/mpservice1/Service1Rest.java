/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manpro.mpservice1;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sevice1")

public class Service1Rest {
    
    @GetMapping(value = "/hello")
    public String getHelloWorld(){
        return "Hello" + new Date();
    }

    @PostMapping(value = "/countText")
    public String countText(@RequestBody String text) {
        String result = "Number of Character: ";
        int length = text.length();
        return result + length;
    }

}
