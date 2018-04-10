package com.jackson.daggertest.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;

import com.jackson.daggertest.BaseActivity;
import com.jackson.daggertest.R;
import com.jackson.daggertest.fragment.Fragment01;
import com.jackson.daggertest.fragment.Fragment02;
import com.jackson.daggertest.fragment.Fragment03;
import com.jackson.daggertest.fragment.Fragment04;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class DaggerFragmentActivity extends BaseActivity implements HasSupportFragmentInjector{

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    ViewPager viewPager;
    ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_fragment);
        init();

    }

    private void init() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        // 初始化ViewPager对象中所需要的数据
        list = new ArrayList<Fragment>();
        list.add(new Fragment01());
        list.add(new Fragment02());
        list.add(new Fragment03());
        list.add(new Fragment04());

        viewPager.setAdapter(new MyAdapterState(getSupportFragmentManager()));
    }



    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
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
