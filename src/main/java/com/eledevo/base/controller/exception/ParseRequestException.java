/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.controller.exception;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 *
 * @author nhat.lai
 */
public class ParseRequestException extends JsonProcessingException{
    public ParseRequestException(){
        super("Parse Request Exception: JSON Format Error");
    }
}
