package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class BingDraw extends BaseView {
    public BingDraw(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawBing(mContext);
    }
}
