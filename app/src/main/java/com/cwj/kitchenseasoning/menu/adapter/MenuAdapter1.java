package com.cwj.kitchenseasoning.menu.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.cwj.kitchenseasoning.menu.bean.TagTitleBean;
import com.cwj.kitchenseasoning.menu.fragment.CuisineFragment;

import java.util.List;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public class MenuAdapter1 extends FragmentStateAdapter {
    private List<TagTitleBean> title;
    public MenuAdapter1(@NonNull Fragment fragment,List<TagTitleBean> title) {
        super(fragment);
        this.title=title;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment=new CuisineFragment();
        Bundle bundle=new Bundle();
        bundle.putString("title",title.get(position).getId());
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return title.size();
    }
}
