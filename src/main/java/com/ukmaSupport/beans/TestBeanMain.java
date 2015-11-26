package com.ukmaSupport.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanMain {

    @Autowired
    private TestBeanRole roleTest;

    public void test(){
       roleTest.test();
    }
}
