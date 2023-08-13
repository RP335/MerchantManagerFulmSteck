package com.pinelabs.controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import com.pinelabs.IntegerPropertyEditor;

@ControllerAdvice
public class ControllerAdviceConfig {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //System.out.println("InitBinder invoked");
        String fieldName = binder.getObjectName();
        //System.out.println("Field name: " + fieldName);
        if ("merchantDTO".equals(fieldName)) {
            //System.out.println("Applying custom editor to merchantId");
            binder.registerCustomEditor(Integer.class, new IntegerPropertyEditor());
        }
    }

}
