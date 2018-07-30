package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BasePaintView extends View {
    private int mXSize;
    private int mYSize;
    private int[][] columnInfo;
    private String mTitle;
    private Paint mPaint;

    private int width;
    private int height;
    public int startX=100;
    public int startY=900;

    private String YName;
    private String XName;
    private float cellXWidth;

    private float maxY=10;
    private float max;
    private float cellYHeight;


    public BasePaintView(Context context) {
        super(context);
    }

    public BasePaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasePaintView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(mPaint==null)
            mPaint=new Paint();
        drawXAxis(canvas,mPaint);
        drawYAxis(canvas,mPaint);
        drawTitle(canvas,mPaint);
        drawXArrow(canvas,mPaint);
        drawYArrow(canvas,mPaint);
        drawYName(canvas,mPaint);
        drawXName(canvas,mPaint);
        drawYScale(canvas,mPaint);
        drawYScaleValue(canvas,mPaint);
        drawXScale(canvas,mPaint);
        drawXScaleValue(canvas,mPaint);
        drawColumn(canvas,mPaint);
    }
    //写入X轴的名称
    private void drawXName(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(18);
        canvas.drawText(XName,startX+width-30,startY+50,mPaint);

    }
    //写入Y轴的名称
    private void drawYName(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(18);
        canvas.drawText(YName,startX-80,startY-height-50,mPaint);
    }
    //Y轴
    private void drawYAxis(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        canvas.drawLine(startX,startY,startX,startY-height,mPaint);
    }
    //直方图标题
    private void drawTitle(Canvas canvas, Paint mPaint) {
        mPaint.setTextSize(40);
        mPaint.setFakeBoldText(true);
        mPaint.setColor(Color.BLACK);
        canvas.drawText(mTitle,getWidth()/2-(mPaint.measureText(mTitle))/2,//中心位置是获取整个屏幕的一半减去文字长度的一半
                100,mPaint);
    }

    /**
     * 画X轴箭头
     * @param canvas
     * @param mPaint
     */
    private void drawXArrow(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        Path path=new Path();
        path.moveTo(startX+width+30,startY);
        path.lineTo(startX+width,startY+10);
        path.lineTo(startX+width,startY-10);
        path.close();
        canvas.drawPath(path,mPaint);
    }
    //Y轴箭头
    private void drawYArrow(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        Path path=new Path();
        path.moveTo(startX,startY-height-30);
        path.lineTo(startX-10,startY-height);
        path.lineTo(startX+10,startY-height);
        path.close();
        canvas.drawPath(path,mPaint);
    }
    //Y轴刻度
    private void drawYScale(Canvas canvas, Paint mPaint) {
        float cellYHeight=height/mYSize;
        for(int i=0;i<mYSize;i++)
        {
            canvas.drawLine(startX,startY-(i+1)*cellYHeight,startX+10,startY-(i+1)*cellYHeight,mPaint);
        }
    }
    //X轴刻度
    private void drawXScale(Canvas canvas, Paint mPaint) {
        cellXWidth = width/mXSize;
        for(int i=0;i<mXSize;i++)
        {
            canvas.drawLine(startX+(i+1)* cellXWidth,startY,startX+(i+1)* cellXWidth,startY-10,mPaint);
        }
    }
    //Y轴刻度值
    private void drawYScaleValue(Canvas canvas, Paint mPaint) {
        cellYHeight = height/mYSize;
        max = maxY/mYSize;
        for(int i=0;i<mYSize;i++)
        {
            canvas.drawText(max *(i+1)+"",startX-40,startY-(i+1)* cellYHeight,mPaint);
        }
    }
    //X轴刻度值
    private void drawXScaleValue(Canvas canvas, Paint mPaint) {
        mPaint.setTextSize(20);
        mPaint.setColor(Color.BLACK);
        float jg=cellXWidth/2;
        for(int i=0;i<mXSize;i++)
        {
            canvas.drawText((i+1)+"",cellXWidth*i+startX+jg,startY+20,mPaint);
        }
    }
    //画数据
    private void drawColumn(Canvas canvas, Paint mPaint) {
        if(columnInfo!=null)
        {
            for(int i=0;i<columnInfo.length;i++)
            {
                mPaint.setColor(columnInfo[i][1]);
                float nowHeight=(columnInfo[i][0]/max)*cellYHeight;
                canvas.drawRect(startX+(i)*cellXWidth,startY,
                        startX+(i+1)*cellXWidth,startY-nowHeight,mPaint);
                mPaint.setColor(Color.BLACK);
                canvas.drawText(columnInfo[i][0]+"",startX+(i)*cellXWidth+cellXWidth/2,startY-nowHeight,
                        mPaint);
            }
        }
    }

    /**
     * 画X轴
     * @param canvas
     * @param mPaint
     */
    private void drawXAxis(Canvas canvas, Paint mPaint) {
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        canvas.drawLine(startX,startY,startX+width,startY,mPaint);
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setYName(String YName) {
        this.YName = YName;
    }

    public void setXName(String XName) {
        this.XName = XName;
    }

    public void setmXSize(int mXSize) {
        this.mXSize = mXSize;
    }

    public void setmYSize(int mYSize) {
        this.mYSize = mYSize;
    }
    //Y轴最大值
    public void setMaxY(float maxY) {
        this.maxY = maxY;
    }

    public void setColumnInfo(int[][] columnInfo) {
        this.columnInfo = columnInfo;
    }
}
