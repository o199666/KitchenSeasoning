package com.cwj.kitchenseasoning.menu.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.cwj.kitchenseasoning.R;
import com.cwj.kitchenseasoning.base.BaseActivity;
import com.cwj.kitchenseasoning.databinding.ActivityDetailsBinding;
import com.cwj.kitchenseasoning.menu.bean.DetailsBean;

/**
 * Created by CWJ on 2020/5/14.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC: 详情页面。
 */
public class DetailsActivity extends BaseActivity {
    ActivityDetailsBinding binding;
    DetailsBean.ResultBean.DataBean dataBean;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_details);
        dataBean= (DetailsBean.ResultBean.DataBean) getIntent().getSerializableExtra("databean");
        binding.setDatabean(dataBean);
        binding.setImage(dataBean.getSteps().get(0).getImg());
        Log.e("托片路径：",dataBean.getSteps().get(0).getImg());
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    public void initData() {

    }
}
