/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manpro.mpservice2.rest;

import com.manpro.mpservice2.entities.person;
import com.manpro.mpservice2.servis.personServis;
import java.util.List;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person")

public class PersonRest {
    
    @Autowired
    private personServis personServis;
    
    @PostMapping(value="/insert")
    public String insert(@RequestBody String row){
        String result = "";
        String[] newData = row.split(";");
        
        person p = new person();
        p.setCode(newData[0]);    
        p.setName(newData[1]);
        p.setPhone(newData[2]);
        p.setAddress(newData[3]);

        result=personServis.save(p);
        return result;
    }
    
    @GetMapping(value = "/finds")
    public List<person> finds() {
        return null;
    }
}
