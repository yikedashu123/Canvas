package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class DrawColor extends DrawView{
    public DrawColor(Context context) {
        super(context);
    }

    public DrawColor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawColor(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
    }
}
