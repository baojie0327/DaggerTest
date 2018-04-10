package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.jackson.daggertest.R;
import com.jackson.daggertest.component.DaggerMainComponent;
import com.jackson.daggertest.module.MainModule;
import com.jackson.daggertest.qualifiers.FemaleTeacher;
import com.jackson.daggertest.qualifiers.MaleTeacher;
import com.jackson.daggertest.utils.Student;
import com.jackson.daggertest.utils.Teacher;
import com.jackson.daggertest.utils.User1;

import javax.inject.Inject;

/**
 * Dagger2的基本用法
 */
public class Daggertest1Activity extends AppCompatActivity {

    @Inject
    Student mStudent;  // 注入Studnet的实例

    @Inject
    @MaleTeacher
    Teacher maleTeacher;

    @Inject
    @FemaleTeacher
    Teacher femaleTeacher;

    private TextView tv_mess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daggertest1);
        tv_mess =  findViewById(R.id.text);

        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);

        tv_mess.setText(mStudent.showMessage());

        Log.d("hbj--",mStudent.toString());

        Log.d("maleTeacher",maleTeacher.getSex());
        Log.d("maleTeacher",femaleTeacher.getSex());

        User1 user1=new User1.Builder(5,"shuang").setScore(90).setAddress("shandong").build();
        Log.d("hbj--",user1.getId()+"--"+user1.getName()+"--"+user1.getScore()+"--"+user1.getAddress());
    }
}
