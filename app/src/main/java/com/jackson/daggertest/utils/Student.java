package com.jackson.daggertest.utils; /**
 * Student  2018-03-21
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import javax.inject.Inject;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 03 21
 */
public class Student {

    private String mess="Student的实例是注解方式注入的";

   @Inject
    public Student(){

    }

    public String showMessage(){
        return mess;
    }

}

