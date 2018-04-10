package com.jackson.daggertest; /**
 * BaseFragment  2018-04-09
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 09
 */
public class BaseFragment extends Fragment{

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

}

