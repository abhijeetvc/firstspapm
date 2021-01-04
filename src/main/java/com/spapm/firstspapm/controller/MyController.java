package com.spapm.firstspapm.controller;

import com.spapm.firstspapm.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   // @Autowired     // Use spring's dependency injection facilities
    private MyImpl myImpl;  // field based dependency injection

//    public MyController(MyImpl myImpl){  // Constructor based DI
//        this.myImpl=myImpl;
//    }

   @Autowired
    public void setMyImpl(MyImpl myImpl) {  //Setter method based DI
        this.myImpl = myImpl;
    }

    @GetMapping("/check")
    public String check(){
        return myImpl.getData();
    }
}
