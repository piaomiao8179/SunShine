package com.feicui.recyclerviewdemo.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/5.
 */
public class WellBean implements Serializable{
    private String url;
    private String mText;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
