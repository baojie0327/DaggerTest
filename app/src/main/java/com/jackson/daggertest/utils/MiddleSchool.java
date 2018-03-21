package com.jackson.daggertest.utils; /**
 * MiddleSchool  2018-03-21
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 03 21
 */
public class MiddleSchool implements School {

    private Student mStudent;

    @Override
    public void setStudent(Student student) {
        mStudent=student;
    }
}

