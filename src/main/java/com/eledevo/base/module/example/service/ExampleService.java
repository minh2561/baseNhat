/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.service;

import com.eledevo.base.module.example.entity.ExampleEntity;
import com.eledevo.base.module.example.entity.ExampleRequestEntity;
import com.eledevo.base.service.BaseService;

/**
 *
 * @author nhat.lai
 */

public interface ExampleService extends BaseService{
    public ExampleEntity exampleGetData(ExampleRequestEntity request);
}
