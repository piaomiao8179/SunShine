package com.feicui.recyclerviewdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.feicui.recyclerviewdemo.R;
import com.feicui.recyclerviewdemo.bean.WellBean;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView mIvDetail;
    private TextView mTvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTvDetail = (TextView) findViewById(R.id.detail_tv);
        mIvDetail = (ImageView) findViewById(R.id.detail_image);

        WellBean wellBean = (WellBean) getIntent().getSerializableExtra("KEY");
        if (wellBean != null) {
            Picasso.with(this).load(wellBean.getUrl()).into(mIvDetail);
        }
    }
}
