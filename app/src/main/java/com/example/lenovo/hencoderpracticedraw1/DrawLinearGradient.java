package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
/**
*
* @作者 ：lenovo
*
* @创建日期：2018/7/29
 * 线性渐变
*
**/
public class DrawLinearGradient extends DrawView {
    public DrawLinearGradient(Context context) {
        super(context);
    }

    public DrawLinearGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLinearGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mPaint==null)
            mPaint=new Paint();
        shader = new LinearGradient(100,100,500,500,
                Color.parseColor("#ff0000"),Color.YELLOW,
                Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        canvas.drawCircle(400,600,400,mPaint);
        shader = new LinearGradient(100,100,500,500,
                Color.parseColor("#0000ff"),Color.parseColor("#00ff00"),
                Shader.TileMode.MIRROR);
        mPaint.setShader(shader);
//        canvas.drawCircle(400,600,400,mPaint);
        mPaint.setTextSize(50);
        canvas.drawText("这是一句话！",200,900,mPaint);
    }
}
