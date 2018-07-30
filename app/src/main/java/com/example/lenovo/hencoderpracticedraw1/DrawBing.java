package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class DrawBing extends DrawView{
    public DrawBing(Context context) {
        super(context);
    }

    public DrawBing(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawBing(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mPaint==null)
            mPaint=new Paint();

       mPaint.setFakeBoldText(true);
       mPaint.setTextSize(20);
       mPaint.setColor(Color.BLACK);
        canvas.drawText("红色",50,100,mPaint);
        canvas.drawText("蓝色",50,800,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        Path path=new Path();
        path.moveTo(100,100);
        path.lineTo(200,100);
        path.lineTo(400,400);
        mPaint.setStrokeWidth(4);
        canvas.drawPath(path,mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        path.moveTo(100,800);
        path.lineTo(200,800);
        path.lineTo(400,600);

        canvas.drawPath(path,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        canvas.drawArc(100,100,900,900,-60,-120,true,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(120,120,900,900,-180,-95,true,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(120,120,900,900,-275,-50,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(120,120,900,900,-325,-20,true,mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(120,120,900,900,-345,-10,true,mPaint);
        mPaint.setColor(Color.MAGENTA);
        canvas.drawArc(120,120,900,900,-355,-5,true,mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(120,120,900,900,-0,-60,true,mPaint);
    }
}
