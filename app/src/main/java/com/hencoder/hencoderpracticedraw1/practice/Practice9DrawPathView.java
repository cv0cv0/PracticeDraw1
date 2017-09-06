package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.util.ViewUtil;

public class Practice9DrawPathView extends View {
    private Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path=new Path();

    {
        path.addArc(new RectF(ViewUtil.dp2px(120),ViewUtil.dp2px(80),ViewUtil.dp2px(170),ViewUtil.dp2px(130)),140,220);
        path.arcTo(new RectF(ViewUtil.dp2px(170),ViewUtil.dp2px(80),ViewUtil.dp2px(220),ViewUtil.dp2px(130)),180,220);
        path.lineTo(ViewUtil.dp2px(170),ViewUtil.dp2px(170));
    }

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(path,paint);

//        练习内容：使用 canvas.drawPath() 方法画心形
    }
}
