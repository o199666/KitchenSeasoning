package com.cwj.kitchenseasoning.menu.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cwj.kitchenseasoning.api.MyAPP;
import com.cwj.kitchenseasoning.menu.bean.DetailsBean;
import com.cwj.kitchenseasoning.utils.GsonUtils;

import java.util.List;

public class DetailsViewModel extends ViewModel {

    private MutableLiveData<List<DetailsBean.ResultBean.DataBean>> detas;

    public LiveData<List<DetailsBean.ResultBean.DataBean>> getDetas(String titles) {
        if (detas == null) {
            detas = new MutableLiveData<>();
            loadDetas(titles);
        }
        return detas;
    }

    private void loadDetas(String titles) {

        switch (titles) {
            case "1":
                byId(MyAPP.title1);
                break;
            case "2":
                byId(MyAPP.title2);
                break;
            case "3":
                byId(MyAPP.title3);
                break;
            case "4":
                byId(MyAPP.title4);
                break;
            case "5":
                byId(MyAPP.title5);
                break;
            case "6":
                byId(MyAPP.title6);
                break;
            case "7":
                byId(MyAPP.title7);
                break;
            case "8":
                byId(MyAPP.title8);
                break;
            case "9":
                byId(MyAPP.title9);
                break;
            default:
                break;
        }

    }

    public void byId(String json) {
        DetailsBean base = GsonUtils.GsonToBean(json, DetailsBean.class);
        List<DetailsBean.ResultBean.DataBean> lists = base.getResult().getData();
        Log.e("AAAAAA", "menuBean: " + base.getResult().getData());
        for (int i = 0; i < lists.size(); i++) {
            Log.e("AAAAAA", "list: " + lists.get(i).getBurden());
        }
        detas.setValue(lists);
    }


}
