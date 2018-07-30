package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
/**
*
* @作者 ：lenovo
*
* @创建日期：2018/7/29
*
 * 扫描简便
**/
public class SweepGradientView extends DrawView {
    public SweepGradientView(Context context) {
        super(context);
    }

    public SweepGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SweepGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*
        * cx cy ：扫描的中心
        color0：扫描的起始颜色
        color1：扫描的终止颜色*/
        mPaint=new Paint();
        shader=new SweepGradient(300,300, Color.RED,Color.CYAN);
        mPaint.setShader(shader);
        canvas.drawCircle(300,300,200,mPaint);
    }
}
