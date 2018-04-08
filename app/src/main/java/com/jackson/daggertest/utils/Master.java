package com.jackson.daggertest.utils; /**
 * Student  2018-03-21
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 03 21
 */
public class Master {

    private String mess="Master的实例是注解方式注入的";

    public Master(){

    }

    public String showMessage(){
        return mess;
    }

}

