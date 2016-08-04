package com.feicui.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

public class LifeGuideActivity extends AppCompatActivity {

    private TextView mTvLife;
    private StringBuilder mBuilder;
    private String mJson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_guide);
        mTvLife = (TextView) findViewById(R.id.tv_life);
        mBuilder = new StringBuilder();
        Intent intent = getIntent();
        mJson = intent.getStringExtra("json");
        Log.d("...", "onCreate: " + mJson);
        parseGson(mJson);
    }

    public void parseGson (String json) {
        Gson gson = new Gson();
        DataGson dataGson = gson.fromJson(json, DataGson.class);
        String date = dataGson.getResult().getData().getLife().getDate();
        DataGson.ResultBean.DataBean.LifeBean life = dataGson.getResult().getData().getLife();
        DataGson.ResultBean.DataBean.LifeBean.InfoBean info = life.getInfo();
//        List<String> chuanyi = info.getChuanyi();
//        //链接穿衣指南
        mBuilder.append(date + "\n" );
        //感冒
        List<String> kongtiao = info.getKongtiao();
        mBuilder.append(kongtiao.get(0).toString()+ "\n"+kongtiao.get(1).toString()+"\n");
        //


        //设置内容
        mTvLife.setText(mBuilder.toString());
    }
}
