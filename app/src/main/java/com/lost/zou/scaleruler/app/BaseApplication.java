package com.lost.zou.scaleruler.app;

import android.app.Application;
import android.content.Context;

import com.lost.zou.scaleruler.util.DrawUtil;


/**
 * application
 */
public class BaseApplication extends Application {
    protected static BaseApplication sInstance;

    public BaseApplication() {
        sInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DrawUtil.resetDensity(this);
    }


    public static Context getAppContext() {
        return sInstance;
    }


}
