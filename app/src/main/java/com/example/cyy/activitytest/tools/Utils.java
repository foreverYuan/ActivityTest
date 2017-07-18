package com.example.cyy.activitytest.tools;

import android.content.Context;
import android.content.Intent;

/**
 * Created by cyy on 2017/7/17.
 *
 * 提供一些公共方法的辅助工具类
 */

public class Utils {

    public static final String LIFE_CYCLE_TAG = "life_cycle_tag";

    /**
     * 从一个Activity跳转另一个Activity的方法，只是简单的跳转，不传参数
     * @param packageContext
     * @param cls
     */
    public static void jumpActivity(Context packageContext, Class<?> cls){
        Intent intent = new Intent(packageContext, cls);
        packageContext.startActivity(intent);
    }
}
