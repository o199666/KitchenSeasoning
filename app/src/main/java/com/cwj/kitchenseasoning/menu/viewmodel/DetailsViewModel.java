package com.cwj.kitchenseasoning.menu.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cwj.kitchenseasoning.api.MyAPP;
import com.cwj.kitchenseasoning.base.BaseBean;
import com.cwj.kitchenseasoning.menu.bean.DetailsBean;
import com.cwj.kitchenseasoning.utils.GsonUtils;

import java.util.List;

public class DetailsViewModel extends ViewModel {
    private MutableLiveData<List<DetailsBean.ResultBean.DataBean>> detas;

    public LiveData<List<DetailsBean.ResultBean.DataBean>> getDetas() {
        if (detas == null) {
            detas = new MutableLiveData<>();
            loadDetas();
        }
        return detas;
    }

    private void loadDetas() {
        DetailsBean base = GsonUtils.GsonToBean(MyAPP.title1, DetailsBean.class);
        List<DetailsBean.ResultBean.DataBean> lists = base.getResult().getData();

        Log.e("AAAAAA", "menuBean: "+base.getResult().getData());
        for (int i = 0; i <lists.size() ; i++) {
            Log.e("AAAAAA", "list: "+lists.get(i).getBurden());
        }
        detas.setValue(lists);

    }


}
