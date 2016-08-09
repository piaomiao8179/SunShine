package com.feicui.navigationviewdemo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,TodyFragment.ISendText {
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;

    private NavigationView mNavigationView;

    //http://op.juhe.cn/onebox/weather/query?
    // cityname=%E6%B5%8E%E5%8D%97&key=47b6953bb67bd7b7ac0f73885826be04

    private String uilAddress = "http://op.juhe.cn/onebox/weather/query?";
    private String pushCity   = "cityname=";
    private String pushKey    = "&key=47b6953bb67bd7b7ac0f73885826be04";
    private static final String TAG = "MainActivity";

    private TextView           mTvShow;
    private ArrayList<Weather> mList;
    private OkHttpClient       mClient;
    public  String             mJson;
    private MyAsync            mAsync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvShow = (TextView) findViewById(R.id.tv);
        mList = new ArrayList<>();
        mClient = new OkHttpClient();
        mDrawer = (DrawerLayout) findViewById(R.id.root);
        mToggle = new ActionBarDrawerToggle(this,mDrawer,R.string.open,R.string.close);
        //
        mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        //显示mtoggle菜单
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mNavigationView = (NavigationView) findViewById(R.id.navigation);
        //给navigation设置点击监听
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    //点击mToggle打开抽屉
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        executeAsync();
         Toast.makeText(MainActivity.this, "静等三秒钟", Toast.LENGTH_SHORT).show();

        return  mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }

    //点击返回键处理


    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        switch (item.getItemId()) {
            case R.id.today:
                Toast.makeText(MainActivity.this, "查看今日天气", Toast.LENGTH_SHORT).show();
                mTvShow.setText("济南" + "\n" + mList.get(0).getDate() + "\n" + mList.get(0).mDay.getState());
                //添加一个Fragment
                transaction.replace(R.id.ll_navi,new TodyFragment());

                mDrawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.tomorrow:
                Toast.makeText(MainActivity.this, "查看明日天气", Toast.LENGTH_SHORT).show();
                transaction.replace(R.id.ll_navi,new SecondFragment());
                mDrawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.aftertomorrow:
                Toast.makeText(MainActivity.this, "查看后日天气", Toast.LENGTH_SHORT).show();

                break;
        }

        transaction.commit();
        return false;
    }

    private void executeAsync() {
        if (mList != null) {
            for (int i = mList.size()-1; i >=0; i--) {
                mList.remove(i);
            }
        }
        String url = uilAddress + pushCity + "济南" + pushKey;
        mAsync = new MyAsync();
        mAsync.execute(url);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_main,menu);
        return true;
    }

    @Override
    public void sendText(String text) {
        SecondFragment secondFragment = new SecondFragment();

        Bundle bundle = new Bundle();
        bundle.putString("name",text);

        secondFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.ll_navi,secondFragment).addToBackStack(null).
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
    }

    private class MyAsync extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            String uri = strings[0];
            //Request阶段
            Request request = new Request.Builder().url(uri).build();

            //Response阶段
            try {
                Response response = mClient.newCall(request).execute();
                if (response.isSuccessful()) {
                    mJson = response.body().string();
                    Log.d(TAG, "doInBackground: " + mJson);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return mJson;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: " + s);
            //解析传过来的json文件
            JsonDao jsonDao = new JsonDao(s, mList);
            mList = jsonDao.parseJson();



        }
    }
}
