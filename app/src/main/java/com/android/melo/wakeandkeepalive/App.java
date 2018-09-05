package com.android.melo.wakeandkeepalive;

import android.app.Application;
import android.content.Context;

/**
 * Created by melo on 2018/9/5.
 */

public class App extends Application{
     private static Context appContext;

    public static Context getAppContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }
}
