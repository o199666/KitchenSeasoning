package com.cwj.kitchenseasoning.base;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cwj.kitchenseasoning.lifecycle.BaseLifecycleObserver;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        getLifecycle().addObserver(new BaseLifecycleObserver());//1
    }
    public abstract void initData();
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BaseActivity", "onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BaseActivity", "onRestart");

    }
}
