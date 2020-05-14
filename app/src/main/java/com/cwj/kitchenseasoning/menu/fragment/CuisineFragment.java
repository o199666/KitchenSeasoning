package com.cwj.kitchenseasoning.menu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cwj.kitchenseasoning.R;
import com.cwj.kitchenseasoning.base.BaseFragment;
import com.cwj.kitchenseasoning.databinding.FargmentCuisineBinding;
import com.cwj.kitchenseasoning.menu.adapter.ItemDetailsAdapter;
import com.cwj.kitchenseasoning.menu.bean.DetailsBean;
import com.cwj.kitchenseasoning.menu.interfaces.ItemClike;
import com.cwj.kitchenseasoning.menu.ui.DetailsActivity;
import com.cwj.kitchenseasoning.menu.viewmodel.DetailsViewModel;

import java.util.List;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:菜系Fragment
 */
public class CuisineFragment extends BaseFragment {
    FargmentCuisineBinding cuisineBinding;
    DetailsViewModel detailsViewModel;
    private ItemDetailsAdapter detailsAdapter;

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
        String title=bd.getString("title");
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cuisineBinding.rylv.setLayoutManager(layoutManager);

        detailsViewModel=new ViewModelProvider(this).get(DetailsViewModel.class);
        detailsViewModel.getDetas(title).observe(this, new Observer<List<DetailsBean.ResultBean.DataBean>>() {
            @Override
            public void onChanged(List<DetailsBean.ResultBean.DataBean> detailsBeans) {
                    detailsAdapter = new ItemDetailsAdapter(getContext(), detailsBeans, new ItemClike() {
                        @Override
                        public void onClike(View view, DetailsBean.ResultBean.DataBean dataBean) {
                            Log.e("点击图片:",dataBean.getAlbums().get(0));
                            Intent intent=new Intent(getContext(), DetailsActivity.class);
                            intent.putExtra("databean",dataBean);
                            startActivity(intent);
                        }
                    });
                    cuisineBinding.rylv.setAdapter(detailsAdapter);
                };
        });

    }
}
