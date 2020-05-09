package com.cwj.kitchenseasoning.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cwj.kitchenseasoning.lifecycle.BaseLifecycleObserver;

/**
 * Created by CWJ on 2020/5/7.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public abstract class BaseFragment   extends Fragment {

    public BaseFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return null;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundel) {
        super.onViewCreated(view, bundel);
        getLifecycle().addObserver(new BaseLifecycleObserver());//1
        initData(bundel);
    }

    public abstract void  initData(Bundle bundel);
}
