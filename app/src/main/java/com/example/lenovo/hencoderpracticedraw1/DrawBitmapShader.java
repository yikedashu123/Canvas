package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class DrawBitmapShader extends DrawView {
    public DrawBitmapShader(Context context) {
        super(context);
    }

    public DrawBitmapShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawBitmapShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.ha);
        shader=new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        /*
        *   bitmap：用来做模板的 Bitmap 对象
            tileX：横向的 TileMode
            tileY：纵向的 TileMode。
        */
        canvas.drawCircle(200,200,200,mPaint);
        shader=new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);
        mPaint.setShader(shader);
        canvas.drawRect(100,400,1000,800,mPaint);

        shader=new BitmapShader(bitmap, Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
        mPaint.setShader(shader);
        canvas.drawRect(100,900,1000,1500,mPaint);

    }
}
