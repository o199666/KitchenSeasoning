package com.cwj.kitchenseasoning.menu.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cwj.kitchenseasoning.api.MyAPP;
import com.cwj.kitchenseasoning.base.BaseBean;
import com.cwj.kitchenseasoning.menu.bean.TagTitleBean;
import com.cwj.kitchenseasoning.utils.GsonUtils;

import java.util.List;

/**
 * Created by CWJ on 2020/5/12.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:ViewModel 负责处理数据。
 */
public class TagTitleViewModel extends ViewModel {
    private MutableLiveData<List<TagTitleBean>> tags;

    public LiveData<List<TagTitleBean>> getTags() {
        if (tags == null) {
            tags = new MutableLiveData<>();
            loadTags();
        }
        return tags;
    }
    /**
     * 异步加载数据
     */
    private void loadTags() {
//        {"resultcode":"200","reason":"Success","error_code":0,"list":[{"id":"1","name":"家常菜","parentId":"10001"},{"id":"2","name":"快手菜","parentId":"10001"},{"id":"3","name":"创意菜","parentId":"10001"},{"id":"4","name":"素菜","parentId":"10001"},{"id":"5","name":"凉菜","parentId":"10001"},{"id":"6","name":"烘焙","parentId":"10001"},{"id":"7","name":"面食","parentId":"10001"},{"id":"8","name":"汤","parentId":"10001"},{"id":"9","name":"自制调味料","parentId":"10001"}]}
        BaseBean base = GsonUtils.GsonToBean(MyAPP.title, BaseBean.class);
        List<TagTitleBean> list = GsonUtils.jsonToList(base.getList().toString(), TagTitleBean.class);
        for (int i = 0; i < list.size(); i++) {
            Log.e("tagtag", list.get(i).getName());
        }
        tags.setValue(list);//发送数据
    }
}
