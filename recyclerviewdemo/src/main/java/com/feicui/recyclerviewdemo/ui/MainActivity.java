package com.feicui.recyclerviewdemo.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.feicui.recyclerviewdemo.R;
import com.feicui.recyclerviewdemo.adapter.RecyclerAdapter;
import com.feicui.recyclerviewdemo.bean.WellBean;
import com.feicui.recyclerviewdemo.dao.GetJsonUrl;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static String url = "http://gank.io/api/random/data/%E7%A6%8F%E5%88%A9/100";
    private static final String TAG = "MainActivity";
    private RecyclerView        mRecyclerWellfare;
    private ArrayList<WellBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout col = (CollapsingToolbarLayout) findViewById(R.id.col_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        col.setTitleEnabled(false);

        //获取包含url的list集合，为了放在adapter中
//        mList = new ArrayList<>();

        mRecyclerWellfare = (RecyclerView) findViewById(R.id.recycler_wellfare);
        mRecyclerWellfare.setHasFixedSize(true);
        //设置layoutmanager
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
//        CarouselLayoutManager manager = new
//                CarouselLayoutManager(CarouselLayoutManager.VERTICAL);
        mRecyclerWellfare.setLayoutManager(manager);

        //使用AsyncTask获取url
        MyAysnc aysnc = new MyAysnc();
        aysnc.execute(url);



    }

    private class MyAysnc extends AsyncTask<String,Void,ArrayList<WellBean>> {

        @Override
        protected ArrayList<WellBean> doInBackground(String... strings) {
            String url = strings[0];
            mList = GetJsonUrl.getUrl(url);

            return mList;
        }

        @Override
        protected void onPostExecute(ArrayList<WellBean> wellBeen) {
            Log.d(TAG, "onPostExecute: " + wellBeen.get(0).getUrl());
            mRecyclerWellfare.setAdapter(new RecyclerAdapter(MainActivity.this,wellBeen));

            super.onPostExecute(wellBeen);
        }
    }
}
