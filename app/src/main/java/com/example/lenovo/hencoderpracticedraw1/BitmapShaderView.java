package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class BitmapShaderView extends BaseView {
    public BitmapShaderView(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawBitmapShader(mContext);
    }
}
