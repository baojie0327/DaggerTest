package com.jackson.daggertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jackson.daggertest.activity.DaggerAndroid2Activity;
import com.jackson.daggertest.activity.DaggerAndroidActivity;
import com.jackson.daggertest.activity.DaggerFragmentActivity;
import com.jackson.daggertest.activity.DaggerTest2Activity;
import com.jackson.daggertest.activity.Daggertest1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Daggertest1Activity.class));
            }
        });

        findViewById(R.id.test2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DaggerTest2Activity.class));
            }
        });

        findViewById(R.id.test3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DaggerAndroidActivity.class));
            }
        });

        findViewById(R.id.test4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DaggerAndroid2Activity.class));
            }
        });

        findViewById(R.id.test5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DaggerFragmentActivity.class));
            }
        });
    }
}
