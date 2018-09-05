package com.android.melo.wakeandkeepalive;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by melo on 2018/9/5.
 */

public class ChannelService extends Service {
    private static final String TAG = "ChannelService";

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand(): intent = [" + intent.toUri(0) + "], flags = [" + flags + "], startId = [" + startId + "]");
        startForeground(DaemonService.SERVICE_ID, new Notification());
        stopForeground(true);
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}