package com.cwj.kitchenseasoning.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.cwj.kitchenseasoning.R;
import com.cwj.kitchenseasoning.base.BaseFragment;
import com.cwj.kitchenseasoning.databinding.FragmentMenuBinding;
import com.cwj.kitchenseasoning.menu.adapter.MenuAdapter1;
import com.cwj.kitchenseasoning.menu.viewmodel.TagTitleViewModel;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * Created by CWJ on 2020/5/7.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:菜单
 */
public class MenuFragment extends BaseFragment  {
    private MenuAdapter1 adapter;
    private FragmentMenuBinding binding;
    TagTitleViewModel tagTitleViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_menu, container, false);
        return binding.getRoot();
    }
    @Override
    public void initData(Bundle mBundel) {
        tagTitleViewModel = new ViewModelProvider(this).get(TagTitleViewModel.class);
        tagTitleViewModel.getTags().observe(this, tags -> {
            //处理UI
            adapter=new MenuAdapter1(this,tags);
            binding.viewPage.setAdapter(adapter);
            new TabLayoutMediator(binding.tlt,binding.viewPage, true, new TabLayoutMediator.TabConfigurationStrategy() {
                @Override
                public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                    tab.setText(tags.get(i).getName());
                }
            }).attach();


        });
//        tagTitleViewModel.getTags().observe(this, new Observer<String[]>() {
//            @Override
//            public void onChanged(String[] strings) {
//
//            }
//        });





    }
}
