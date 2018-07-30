package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class DrawSweepGradient extends BaseView {
    public DrawSweepGradient(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new SweepGradientView(mContext);
    }
}
