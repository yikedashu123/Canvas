package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class DrawComposeShader extends DrawView {
    public DrawComposeShader(Context context) {
        super(context);
    }

    public DrawComposeShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawComposeShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setLayerType(LAYER_TYPE_SOFTWARE, null);//关闭硬件加速器
        mPaint=new Paint();
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.head);
        Shader shader1= new BitmapShader(bitmap1, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        Bitmap bitmap2=BitmapFactory.decodeResource(getResources(),R.drawable.qing);
        Shader shader2=new BitmapShader(bitmap2,Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        shader=new ComposeShader(shader1,shader2, PorterDuff.Mode.DST_OUT);

        mPaint.setShader(shader);

//        canvas.drawCircle(400,400,400,mPaint);
        canvas.drawRect(100,100,900,900,mPaint);
    }
}
