package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
/**
*
* @作者 ：lenovo
*
* @创建日期：2018/7/29
 * 辐射渐变
*
**/
public class DrawRadialGradient extends DrawView {
    public DrawRadialGradient(Context context) {
        super(context);
    }

    public DrawRadialGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRadialGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint=new Paint();
        /*
        * centerX centerY：辐射中心的坐标
          radius：辐射半径
          centerColor：辐射中心的颜色
          edgeColor：辐射边缘的颜色
          tileMode：辐射范围之外的着色模式。
        */
        shader= new RadialGradient(100,300,300, Color.RED,Color.BLUE, Shader.TileMode.CLAMP);
        mPaint.setTextSize(50);
        mPaint.setShader(shader);
        canvas.drawText("RadialGradient渐变演示：",200,200,mPaint);
//        canvas.drawRect(200,200,400,400,mPaint);

        shader= new RadialGradient(400,800,300, Color.RED,Color.YELLOW, Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        canvas.drawCircle(400,800,300,mPaint);
    }
}
