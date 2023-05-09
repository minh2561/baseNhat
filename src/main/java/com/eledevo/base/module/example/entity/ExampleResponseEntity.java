/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.module.example.entity;

import com.eledevo.base.controller.entity.BaseResponseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nhat.lai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleResponseEntity extends BaseResponseEntity {
    @JsonProperty("response_value2")
    String valueOutput2;
}
