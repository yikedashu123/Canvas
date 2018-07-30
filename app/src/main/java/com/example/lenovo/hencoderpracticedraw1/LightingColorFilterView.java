package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class LightingColorFilterView extends BaseView {
    public LightingColorFilterView(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawLightingColorFilter(mContext);
    }
}
