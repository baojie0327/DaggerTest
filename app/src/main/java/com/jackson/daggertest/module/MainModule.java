package com.jackson.daggertest.module; /**
 * MainModule  2018-03-21
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */


import com.jackson.daggertest.qualifiers.FemaleTeacher;
import com.jackson.daggertest.qualifiers.MaleTeacher;
import com.jackson.daggertest.scopes.ActivitySingleton;
import com.jackson.daggertest.utils.Student;
import com.jackson.daggertest.utils.Teacher;

import dagger.Module;
import dagger.Provides;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 03 21
 */
@Module
public class MainModule {

    public MainModule(){

    }

    @Provides
    @ActivitySingleton
    Student provideStudent(){
        return new Student();
    }

    @Provides
    @MaleTeacher
    Teacher provideMaleTeacher(){
        return new Teacher("maleTeacher");
    }

    @Provides
    @FemaleTeacher
    Teacher provideFemaleTeacher(){
        return new Teacher("femaleTeacher");
    }

}

