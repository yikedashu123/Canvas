package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class CilcleColor extends BaseView {
    public CilcleColor(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
       DrawCircle drawCircle=new DrawCircle(mContext);
        Log.i("PPPPPPPPPPPPPPPPPP", "initViewddd: "+drawCircle);
       return drawCircle;
    }
}
