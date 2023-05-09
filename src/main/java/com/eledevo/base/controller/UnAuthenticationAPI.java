/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.controller;

import com.eledevo.base.controller.entity.BaseRequestEntity;

/**
 *
 * @author nhat.lai
 */
public abstract class UnAuthenticationAPI extends BaseAPI {

    @Override
    protected boolean handleAuthentication(BaseRequestEntity request) {
        return true;
    }
    
}
