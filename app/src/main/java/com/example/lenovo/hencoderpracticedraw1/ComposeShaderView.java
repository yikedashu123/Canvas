package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class ComposeShaderView extends BaseView {
    public ComposeShaderView(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawComposeShader(mContext);
    }
}
