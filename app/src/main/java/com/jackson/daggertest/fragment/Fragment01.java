package com.jackson.daggertest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jackson.daggertest.R;
import com.jackson.daggertest.utils.Student;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;


public class Fragment01 extends Fragment {

    private View mView;

    private TextView tv;

    @Inject
    Student mStudent;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView=inflater.inflate(R.layout.fragment_fragment01, container, false);
        Log.d("hbj--",mStudent.toString());
        tv=(TextView)mView.findViewById(R.id.frg_text);
        tv.setText(mStudent.showMessage());
        return mView;
    }


}
