package com.feicui.recyclerviewdemo.utils;

import com.feicui.recyclerviewdemo.bean.WellFareBean;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/8/5.
 */
public class JsonUtils {

    //获取json字符串


    //进行联网操作
    private  static OkHttpClient mClient = new OkHttpClient();
    private  static String sJson;

    public static String getJSON (String url) {
        //请求阶段
        Request request = new Request.Builder().url(url).build();
        //响应阶段
        try {
            Response response = mClient.newCall(request).execute();
            if (response.isSuccessful()) {
                sJson = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sJson;
    }


    //解析json字符串   利用Gson
    public static WellFareBean parseJson () {
        Gson gson = new Gson();
        WellFareBean wellFareBean = gson.fromJson(sJson, WellFareBean.class);

        return wellFareBean;
    }
}
