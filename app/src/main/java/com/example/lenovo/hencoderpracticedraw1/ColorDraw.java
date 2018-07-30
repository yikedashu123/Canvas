package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.view.View;

public class ColorDraw extends BaseView{

    private DrawColor mDrawView;

    public ColorDraw(Context mContext) {
        super(mContext);
    }

    protected  View initView()
    {
        mView=View.inflate(mContext, R.layout.draw_layout,null);
        mDrawView=mView.findViewById(R.id.dv_View);
//        mDrawView.drawColor();
        return mView;
    }
    public View getRootView()
    {
        return mView;
    }
}
