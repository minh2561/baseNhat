/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.repository.impl;

import com.eledevo.base.module.example.entity.ExampleEntity;
import com.eledevo.base.module.example.repository.ExampleRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nhat.lai
 */
@Repository
public class ExampleRepositoryImpl implements ExampleRepository{

    @Override
    public ExampleEntity get() {
        return new ExampleEntity("String 1", "String 2");
    }
    
}
