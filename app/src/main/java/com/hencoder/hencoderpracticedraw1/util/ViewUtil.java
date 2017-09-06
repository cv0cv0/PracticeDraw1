package com.hencoder.hencoderpracticedraw1.util;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by GR on 2017/9/6.
 */

public class ViewUtil {

    public static float dp2px(float dp){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dp, Resources.getSystem().getDisplayMetrics());
    }
}
