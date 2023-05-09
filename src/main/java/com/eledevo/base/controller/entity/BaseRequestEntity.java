/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.controller.entity;

import com.eledevo.base.ultils.ObjectMapperUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nhat.lai
 */
@Data
public class BaseRequestEntity {
    @JsonProperty("token")
    String token;

    public <T> T castToEntity(Class<T> entityClazz){
        return ObjectMapperUtils.convertObject(this, entityClazz);
    }
    
}
