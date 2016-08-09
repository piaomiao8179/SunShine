package com.feicui.recyclerviewdemo.dao;

import com.feicui.recyclerviewdemo.utils.JsonUtils;
import com.feicui.recyclerviewdemo.bean.WellBean;
import com.feicui.recyclerviewdemo.bean.WellFareBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/5.
 */
public class GetJsonUrl {

    private static  ArrayList<WellBean> mList;

    public GetJsonUrl(ArrayList<WellBean> list) {
        mList = list;
    }

    public static ArrayList<WellBean> getUrl (String url) {
        mList = new ArrayList<>();
        //调用json 工具类
        String json = JsonUtils.getJSON(url);
        //调用json的解析Gson
        WellFareBean wellFareBean = JsonUtils.parseJson();
        //通过bean来获取url
        for (int i = 0; i < 20; i++) {
            WellBean wellBean = new WellBean();
            String uri = wellFareBean.getResults().get(i).getUrl();
            wellBean.setUrl(uri);
            wellBean.setText("福利：" + i);
            mList.add(wellBean);
        }
        return mList;
    }
}
