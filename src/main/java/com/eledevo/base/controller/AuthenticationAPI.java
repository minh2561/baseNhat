/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.controller;

import com.eledevo.base.controller.entity.BaseRequestEntity;
import com.eledevo.base.controller.entity.BaseResponseEntity;

/**
 *
 * @author nhat.lai
 * @param <R1>
 * @param <R2>
 */

public abstract class AuthenticationAPI<R1 extends BaseRequestEntity, R2 extends BaseResponseEntity> extends BaseAPI<R1, R2> {

    private static final String TOKEN_EXAMPLE = "12345";

    @Override
    protected boolean handleAuthentication(R1 request) {
         //handle code check token here
        return TOKEN_EXAMPLE.equals(request.getToken());
    } 
    
}