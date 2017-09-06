package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.util.ViewUtil;

public class Practice8DrawArcView extends View {
    private Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF rectF=new RectF(ViewUtil.dp2px(80), ViewUtil.dp2px(60), ViewUtil.dp2px(280), ViewUtil.dp2px(160));

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawArc(rectF,-110,90,true,paint);
        canvas.drawArc(rectF,20,130,false,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,180,60,false,paint);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
