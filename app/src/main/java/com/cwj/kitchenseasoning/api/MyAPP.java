package com.cwj.kitchenseasoning.api;

import android.app.Application;

/**
 * Created by CWJ on 2020/5/8.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC:
 */
public class MyAPP extends Application {
    public static  final String U_ID="JHa4aaec85a3595335ba53e64d96fef8d1";
    public static  final String APP_KEY="7eab3827422a2b854131cf09ddbcd005";
//    请求示例：http://apis.juhe.cn/cook/category?key=您申请的KEY
//    接口备注：查看菜谱的所有分类，如菜系、口味等
//    http://apis.juhe.cn/cook/index?key=您申请的KEY&cid=1
//    接口备注：按标签检索菜谱
    //http://apis.juhe.cn/cook/index?key=7eab3827422a2b854131cf09ddbcd005&cid=10
//    请求示例：http://apis.juhe.cn/cook/queryid?key=您申请的KEY&id=1001

    public static String title="{\"resultcode\":\"200\",\"reason\":\"Success\",\"error_code\":0,\"list\":[{\"id\":\"1\",\"name\":\"家常菜\",\"parentId\":\"10001\"},{\"id\":\"2\",\"name\":\"快手菜\",\"parentId\":\"10001\"},{\"id\":\"3\",\"name\":\"创意菜\",\"parentId\":\"10001\"},{\"id\":\"4\",\"name\":\"素菜\",\"parentId\":\"10001\"},{\"id\":\"5\",\"name\":\"凉菜\",\"parentId\":\"10001\"},{\"id\":\"6\",\"name\":\"烘焙\",\"parentId\":\"10001\"},{\"id\":\"7\",\"name\":\"面食\",\"parentId\":\"10001\"},{\"id\":\"8\",\"name\":\"汤\",\"parentId\":\"10001\"},{\"id\":\"9\",\"name\":\"自制调味料\",\"parentId\":\"10001\"}]}";
}
