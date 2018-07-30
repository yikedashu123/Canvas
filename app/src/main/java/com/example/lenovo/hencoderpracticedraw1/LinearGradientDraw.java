package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class LinearGradientDraw extends BaseView {
    public LinearGradientDraw(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawLinearGradient(mContext);
    }
}
