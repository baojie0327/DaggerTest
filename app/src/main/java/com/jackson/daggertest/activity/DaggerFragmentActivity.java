package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.jackson.daggertest.R;
import com.jackson.daggertest.fragment.Fragment01;
import com.jackson.daggertest.fragment.Fragment02;
import com.jackson.daggertest.fragment.Fragment03;
import com.jackson.daggertest.fragment.Fragment04;

import java.util.ArrayList;

public class DaggerFragmentActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Fragment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_fragment);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
// 初始化ViewPager对象中所需要的数据
        list = new ArrayList<Fragment>();
        list.add(new Fragment01());
        list.add(new Fragment02());
        list.add(new Fragment03());
        list.add(new Fragment04());

        viewPager.setAdapter(new MyAdapterState(getSupportFragmentManager()));
    }



    class MyAdapterState extends FragmentStatePagerAdapter {

        public MyAdapterState(FragmentManager fm) {
            super(fm);
// TODO Auto-generated constructor stub
        }

        @Override
        public Fragment getItem(int arg0) {
// TODO Auto-generated method stub
            return list.get(arg0);
        }

        @Override
        public int getCount() {
// TODO Auto-generated method stub
            return list.size();
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
// TODO Auto-generated method stub
            super.destroyItem(container, position, object);
        }
        @Override
        public Object instantiateItem(ViewGroup arg0, int arg1) {
// TODO Auto-generated method stub
            return super.instantiateItem(arg0, arg1);
        }

    }

}
