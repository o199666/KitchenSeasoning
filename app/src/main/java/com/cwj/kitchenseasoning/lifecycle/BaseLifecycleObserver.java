package com.cwj.kitchenseasoning.lifecycle;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public class BaseLifecycleObserver implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner owner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.e("BaseLifecyceObserver", "ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NonNull LifecycleOwner owner) {
        Log.e("BaseLifecyceObserver", "ON_RESUME");

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(@NonNull LifecycleOwner owner) {
        Log.e("BaseLifecyceObserver", "ON_PAUSE");

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)

    public void onStop(@NonNull LifecycleOwner owner) {
        Log.e("BaseLifecyceObserver", "ON_STOP");

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Log.e("BaseLifecyceObserver", "ON_DESTROY");

    }
}
