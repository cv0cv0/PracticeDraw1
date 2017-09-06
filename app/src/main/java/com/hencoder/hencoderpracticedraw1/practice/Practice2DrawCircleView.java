package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.util.ViewUtil;

public class Practice2DrawCircleView extends View {
    private Paint paint;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLUE);
        canvas.drawCircle(ViewUtil.dp2px(100),ViewUtil.dp2px(180),ViewUtil.dp2px(50),paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(ViewUtil.dp2px(100),ViewUtil.dp2px(60),ViewUtil.dp2px(50),paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ViewUtil.dp2px(1.5f));
        canvas.drawCircle(ViewUtil.dp2px(260),ViewUtil.dp2px(60),ViewUtil.dp2px(50),paint);

        paint.setStrokeWidth(ViewUtil.dp2px(20));
        canvas.drawCircle(ViewUtil.dp2px(260),ViewUtil.dp2px(180),ViewUtil.dp2px(50),paint);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
