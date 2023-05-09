/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.entity;

import com.eledevo.base.ultils.ObjectMapperUtils;

/**
 *
 * @author nhat.lai
 */
public class BaseEntity {
    
     public <T> T castToResponseEntity(Class<T> responseEntityClazz){
         System.out.println("this: "+ this);
        return ObjectMapperUtils.convertObject(this, responseEntityClazz);
    }
}
