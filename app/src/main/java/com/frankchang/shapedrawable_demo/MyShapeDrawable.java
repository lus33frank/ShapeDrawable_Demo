package com.frankchang.shapedrawable_demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;


public class MyShapeDrawable extends View {

    public MyShapeDrawable(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用圖形繪圖：畫圓形
        ShapeDrawable shape = new ShapeDrawable(new OvalShape());
        // 取得畫筆
        Paint pen = shape.getPaint();
        // 設定顏色
        pen.setColor(Color.BLUE);
        // 設定大小範圍
        shape.setBounds(100, 100, 450, 850);
        // 繪製
        shape.draw(canvas);
    }

}
