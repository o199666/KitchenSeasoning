package com.cwj.kitchenseasoning.menu.bean;

/**
 * Created by CWJ on 2020/5/9.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public class TagTitleBean {
    /**
     * id : 1
     * name : 家常菜
     * parentId : 10001
     */
    private String id;
    private String name;
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
