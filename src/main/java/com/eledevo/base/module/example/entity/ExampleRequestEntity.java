/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.entity;

import com.eledevo.base.controller.entity.BaseRequestEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author nhat.lai
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExampleRequestEntity extends BaseRequestEntity{
    
    @JsonProperty("this_value1")
    String value1;
    
    @JsonProperty("this_value2")
    String value2;
}
