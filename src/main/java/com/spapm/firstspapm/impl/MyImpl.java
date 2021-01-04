package com.spapm.firstspapm.impl;

import com.spapm.firstspapm.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {

    @Override
    public String getData() {
        return "Hello Spring";
    }
}
