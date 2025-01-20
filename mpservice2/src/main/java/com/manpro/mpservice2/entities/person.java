/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manpro.mpservice2.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tperson")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class person implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String code;       
    private String name;    
    private String phone;    
    private String address;    
    
}
