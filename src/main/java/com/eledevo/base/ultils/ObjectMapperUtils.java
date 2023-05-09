/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.ultils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author nhat.lai
 */
public class ObjectMapperUtils {

    private static final boolean DISABLE_USE_ANOTATION = false;
    
    private static final ObjectMapper MAPPER = new ObjectMapper()
                                                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                                                    .configure(MapperFeature.USE_ANNOTATIONS, DISABLE_USE_ANOTATION);
    
    private static final ObjectMapper MAPPER_USE_ANOTATION = new ObjectMapper()
                                                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    

    public static <T> T parseRequestByAnotation(String json, T target) throws JsonProcessingException {
        target = (T) MAPPER_USE_ANOTATION.readValue(json, target.getClass());
        return target;
    }
    
    public static <T> T parseStringToObject(String json, T target) throws JsonProcessingException {
        target = (T) MAPPER.readValue(json, target.getClass());
        return target;
    }

    public static <T> T convertObject(Object o, Class<T> convertClazz) {
        T result = MAPPER.convertValue(o, convertClazz);
        return result;
    }
    
}
