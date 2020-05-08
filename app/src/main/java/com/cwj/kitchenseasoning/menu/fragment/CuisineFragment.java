package com.cwj.kitchenseasoning.menu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.cwj.kitchenseasoning.R;
import com.cwj.kitchenseasoning.base.BaseFragment;
import com.cwj.kitchenseasoning.databinding.FargmentCuisineBinding;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:菜系Fragment
 */
public class CuisineFragment extends BaseFragment {
    FargmentCuisineBinding cuisineBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        cuisineBinding = DataBindingUtil.inflate(inflater, R.layout.fargment_cuisine, container, false);
        return cuisineBinding.getRoot();
    }

    @Override
    public void initData(Bundle bd) {
        //todo:取出adapter中储存的值，
        bd = getArguments();
        cuisineBinding.tva.setText(bd.getString("AA"));

    }
}
