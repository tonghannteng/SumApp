package com.tengtonghann.android.mvpcalculate;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tonghannteng on 3/27/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResource());
        init(savedInstanceState);
    }

    protected abstract void init(Bundle savedInstanceState);

    @LayoutRes
    protected abstract int getContentResource();

}
