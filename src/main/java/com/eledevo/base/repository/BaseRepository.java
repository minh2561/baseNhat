/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eledevo.base.repository;

import com.eledevo.base.module.example.entity.ExampleEntity;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nhat.lai
 */

//Uncomment when use JPA REPO
//@Repository
//public interface BaseRepository extends JpaRepository{
//    //REPO COMMON FUNCTION HERE
//}

//USE FOR DEMO

public interface BaseRepository {
    //REPO COMMON FUNCTION HERE
    public ExampleEntity get();
}