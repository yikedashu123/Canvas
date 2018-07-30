package com.example.lenovo.hencoderpracticedraw1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class TuDraw extends BaseView {
    public TuDraw(Context mContext) {
        super(mContext);
    }

    @Override
    protected View initView() {
        BasePaintView mView= new BasePaintView(mContext);
        //图标名称
        mView.setTitle("直方图");
        //设置X轴宽度
        mView.setWidth(900);
        //设置Y周高度
        mView.setHeight(700);
        //Y轴名称
        mView.setYName("营业额");
        //X轴名称
        mView.setXName("天数");
        //X轴数据个数
        mView.setmXSize(7);
        //Y轴数据个数
        mView.setmYSize(10);
        //直方图数据和颜色
        int [][]columnInfo=new int[][]{
                {5, Color.BLUE},
                {7, Color.YELLOW},
                {9, Color.GREEN},
                {4, Color.RED},
                {7, Color.GRAY},
                {3, Color.LTGRAY},
                {8, Color.MAGENTA}
        };
        mView.setColumnInfo(columnInfo);
        return mView;
    }
}
