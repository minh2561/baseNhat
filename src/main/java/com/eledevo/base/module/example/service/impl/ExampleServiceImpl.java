/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.service.impl;

import com.eledevo.base.module.example.entity.ExampleEntity;
import com.eledevo.base.module.example.entity.ExampleRequestEntity;
import com.eledevo.base.module.example.repository.ExampleRepository;
import com.eledevo.base.module.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author nhat.lai
 */
@Service
public class ExampleServiceImpl implements ExampleService{

    @Autowired
    ExampleRepository exampleRepository;
    
    @Override
    public ExampleEntity exampleGetData(ExampleRequestEntity request) {
        System.out.println("Request value 1: "+request.getValue1());
        System.out.println("Request value 2: "+request.getValue2());
        ExampleEntity example = exampleRepository.get();
        return example;
    }

    
}
