package com.cwj.kitchenseasoning.base;

import androidx.lifecycle.ViewModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by CWJ on 2020/5/9.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public  class BaseBean<T> extends ViewModel implements Serializable {
    /**
     * resultcode : 200
     * reason : Success
     * error_code : 0
     * list : [{"id":"1","name":"家常菜","parentId":"10001"},{"id":"2","name":"快手菜","parentId":"10001"},{"id":"3","name":"创意菜","parentId":"10001"},{"id":"4","name":"素菜","parentId":"10001"},{"id":"5","name":"凉菜","parentId":"10001"},{"id":"6","name":"烘焙","parentId":"10001"},{"id":"7","name":"面食","parentId":"10001"},{"id":"8","name":"汤","parentId":"10001"},{"id":"9","name":"自制调味料","parentId":"10001"}]
     */
    private String resultcode;
    private String reason;
    private int error_code;
    private List<T> list;
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
