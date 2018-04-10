package com.jackson.daggertest.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jackson.daggertest.BaseFragment;
import com.jackson.daggertest.R;
import com.jackson.daggertest.utils.Master;

import javax.inject.Inject;


public class Fragment02 extends BaseFragment {

    @Inject
    Master mMaster;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("hbj--mMaster",mMaster.toString());
        return inflater.inflate(R.layout.fragment_fragment02, container, false);
    }

}
