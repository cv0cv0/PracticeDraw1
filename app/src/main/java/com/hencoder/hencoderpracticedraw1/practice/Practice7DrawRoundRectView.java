package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.util.ViewUtil;

public class Practice7DrawRoundRectView extends View {
    private Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF rectF=new RectF(ViewUtil.dp2px(110),ViewUtil.dp2px(80),ViewUtil.dp2px(250),ViewUtil.dp2px(160));

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRoundRect(rectF,ViewUtil.dp2px(20),ViewUtil.dp2px(20),paint);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
    }
}
