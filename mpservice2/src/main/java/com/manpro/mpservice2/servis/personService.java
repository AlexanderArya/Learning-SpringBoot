/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manpro.mpservice2.servis;

import com.manpro.mpservice2.entities.person;
import com.manpro.mpservice2.repo.PersonRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class personService {
    @Autowired
    private PersonRepo personRepo;
    public String sace(person p){
     try {
         personRepo.save(p);
     } catch (Exception e) {   
         return "fail";
    }
     return "succes";
    
}
    public List<person> finds(){
        return personRepo.findAll();
    }
}