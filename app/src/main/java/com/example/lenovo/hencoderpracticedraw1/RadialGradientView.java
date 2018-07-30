package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class RadialGradientView extends BaseView {
    public RadialGradientView(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        return new DrawRadialGradient(mContext);
    }
}
