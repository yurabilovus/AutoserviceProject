package com.auto;

import com.auto.model.Check;
import com.auto.service.impl.CheckServiceImpl;

public class App {
    public static void main(String[] args){
        CheckServiceImpl checkService = new CheckServiceImpl();
        for (Check check: checkService.findAll()
             ) {
            System.out.println(check);
        }
    }
}
