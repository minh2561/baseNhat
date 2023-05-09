/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.controller;

import com.eledevo.base.controller.exception.AuthenRequestException;
import com.eledevo.base.controller.exception.ParseRequestException;
import com.eledevo.base.controller.enumEntity.Methods;
import com.eledevo.base.ultils.ObjectMapperUtils;
import com.eledevo.base.controller.entity.BaseRequestEntity;
import com.eledevo.base.controller.entity.BaseResponseEntity;
import com.eledevo.base.controller.exception.UnsuportedMethodsException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author nhat.lai
 * @param <R1>
 * @param <R2>
 */
@Controller
public abstract class BaseAPI<R1 extends BaseRequestEntity, R2 extends BaseResponseEntity> {

    private Class<R1> requestType;
    private Class<R2> responseType;

    public BaseAPI()  {
        try{
            Type type = getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = (ParameterizedType) type;
            requestType = (Class<R1>) parameterizedType.getActualTypeArguments()[0];
            responseType = (Class<R2>) parameterizedType.getActualTypeArguments()[1];
            this.request = requestType.getConstructor().newInstance();
            this.response = responseType.getConstructor().newInstance();
        }catch(Exception ex){
            System.out.println(ex);
        }
    } 
    
    protected R1 request;

    protected R2 response;
    

    protected void parseRequest(String requestJson) throws JsonProcessingException {
        request = ObjectMapperUtils.parseRequestByAnotation(requestJson, request);
    }

    @GetMapping("")
    public ResponseEntity handleGETRequest(@RequestBody String jsonRequest) throws Exception {
        return handleRequestAction(jsonRequest, Methods.GET);
    }

    @PostMapping("")
    public ResponseEntity handlePOSTRequest(@RequestBody String jsonRequest) throws Exception {
        return handleRequestAction(jsonRequest, Methods.POST);
    }

    @PutMapping("")
    public ResponseEntity handlePUTRequest(@RequestBody String jsonRequest) throws Exception {
        return handleRequestAction(jsonRequest, Methods.PUT);
    }

    @DeleteMapping("")
    public ResponseEntity handleDELETERequest(@RequestBody String jsonRequest) throws Exception {
        return handleRequestAction(jsonRequest, Methods.DELETE);
    }

    protected ResponseEntity handleRequestAction(String jsonRequest, Methods method) throws Exception {
        parseRequest(jsonRequest);
        boolean authenResult = handleAuthentication(request);
        if (!authenResult) {
            throw new AuthenRequestException();
        }

        handleMethods(method);
        if (response == null) {
            throw new UnsuportedMethodsException();
        }
        
        ResponseEntity responseEntity = new ResponseEntity(response, HttpStatus.OK);
        return responseEntity;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleException(
            Exception exception
    ) {
       ResponseEntity errorResponseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.OK);
       return errorResponseEntity;
    }

    protected abstract void validRequest(R1 request) throws Exception;

    protected abstract void handleMethods(Methods method);

    protected abstract boolean handleAuthentication(R1 request);
}
