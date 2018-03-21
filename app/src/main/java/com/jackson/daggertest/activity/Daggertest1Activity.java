package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jackson.daggertest.R;
import com.jackson.daggertest.component.DaggerMainComponent;
import com.jackson.daggertest.module.MainModule;
import com.jackson.daggertest.utils.Student;

import javax.inject.Inject;

public class Daggertest1Activity extends AppCompatActivity {

    @Inject
    Student mStudent;  // 注入Studnet的实例

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
    }
}
