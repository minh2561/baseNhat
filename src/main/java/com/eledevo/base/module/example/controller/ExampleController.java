/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.controller;

import com.eledevo.base.controller.AuthenticationAPI;
import com.eledevo.base.controller.enumEntity.Methods;
import com.eledevo.base.module.example.entity.ExampleEntity;
import com.eledevo.base.module.example.entity.ExampleRequestEntity;
import com.eledevo.base.module.example.entity.ExampleResponseEntity;
import com.eledevo.base.module.example.exception.Value1ErrorException;
import com.eledevo.base.module.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nhat.lai
 */
@Controller
@RequestMapping("/example")
public class ExampleController extends AuthenticationAPI<ExampleRequestEntity, ExampleResponseEntity> {
    
    @Autowired
    ExampleService exampleService;
    
    @Override
    protected void validRequest(ExampleRequestEntity request) throws Exception {
        if(request.getValue1() == null){
            throw new Value1ErrorException();
        }
    }

    @Override
    protected void handleMethods(Methods method) {
        switch(method){
            case GET: {
                exampleGETAPI();
                break;
            }
        }
    }
    
    private void exampleGETAPI(){
        ExampleEntity entity = exampleService.exampleGetData(request);
        System.out.println("output entity " +entity);
        response = entity.castToResponseEntity(ExampleResponseEntity.class);
    }
    
}
