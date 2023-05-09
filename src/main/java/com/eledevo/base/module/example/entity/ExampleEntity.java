/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.entity;

import com.eledevo.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author nhat.lai
 */
@Data
@AllArgsConstructor
public class ExampleEntity extends BaseEntity{
    
    String valueOutput1;
    
    String valueOutput2;
}
