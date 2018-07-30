package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class BaseView {
    protected Context mContext;
    protected View mView;

    public BaseView(Context mContext) {
        this.mContext = mContext;
        initView();
    }
    protected  View initView()
    {
        mView=View.inflate(mContext, R.layout.base_layout,null);

        return mView;
    }
    public View getRootView()
    {
        return mView;
    }
}
