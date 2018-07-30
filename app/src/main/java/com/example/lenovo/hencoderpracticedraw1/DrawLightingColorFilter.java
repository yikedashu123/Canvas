package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class DrawLightingColorFilter extends DrawView {
    public DrawLightingColorFilter(Context context) {
        super(context);
    }

    public DrawLightingColorFilter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLightingColorFilter(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.head);
        shader=new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        ColorFilter colorFilter=new LightingColorFilter(0x00ffff,0x000000);
        mPaint.setColorFilter(colorFilter);
        mPaint.setShader(shader);
        canvas.drawRect(100,100,700,700,mPaint);
    }
}
