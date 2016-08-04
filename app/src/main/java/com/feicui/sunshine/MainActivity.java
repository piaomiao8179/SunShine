package com.feicui.sunshine;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        AdapterView.OnItemClickListener {

    //http://op.juhe.cn/onebox/weather/query?
    // cityname=%E6%B5%8E%E5%8D%97&key=47b6953bb67bd7b7ac0f73885826be04

    private String uilAddress = "http://op.juhe.cn/onebox/weather/query?";
    private String pushCity   = "cityname=";
    private String pushKey    = "&key=47b6953bb67bd7b7ac0f73885826be04";
    private static final String TAG = "MainActivity";
    private Button             mButton;
    private EditText           mEtInput;
    private ListView           mListView;
    private TextView mTvShow;
    private ArrayList<Weather> mList;
    private String             mCityname;
    private OkHttpClient       mClient;
    public String             mJson;
    private MyAsync mAsync;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtInput = (EditText) findViewById(R.id.et_input);
        mTvShow = (TextView) findViewById(R.id.tv_show);
        mList = new ArrayList<>();
        mClient = new OkHttpClient();
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
        mListView = (ListView)findViewById(R.id.lv_show);
        mListView.setOnItemClickListener(this);

    }


    //点击控件获取天气JSON
    @Override
    public void onClick(View view) {
        if (mList != null) {
            for (int i = mList.size()-1; i >=0; i--) {
                mList.remove(i);
            }
        }
        mCityname = mEtInput.getText().toString().trim();
        String url = uilAddress + pushCity + mCityname + pushKey;
        mAsync = new MyAsync();
        mAsync.execute(url);

    }

    //listview的点击事件
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (i == 0) {
            Intent intent = new Intent(this, LifeGuideActivity.class);
            intent.putExtra("json",mJson);
            startActivity(intent);
        }
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

                //设置适配器
                mListView.setAdapter(new MyAdapter(MainActivity.this,mList));

                mTvShow.setText("城市：" + mCityname);
        }
    }

    public class MyAdapter extends BaseAdapter {
        private ArrayList<Weather> mArrayList;
        private Context            mContext;

        public MyAdapter(Context context, ArrayList<Weather> arrayList) {
            mContext = context;
            mArrayList = arrayList;
        }

        @Override
        public int getCount() {
            if (mArrayList.size() != 0) {
                return mArrayList.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder holder = null;
            if (view == null) {
                holder = new ViewHolder();
                view = LayoutInflater.from(mContext).inflate(R.layout.listview_item,null);
                holder.mTvShowData = (TextView) view.findViewById(R.id.tv_data);
                holder.mTvStateDay = (TextView) view.findViewById(R.id.tv_state_day);
                holder.mTvTemDay = (TextView) view.findViewById(R.id.tv_tem_day);
                holder.mTvStateNight = (TextView) view.findViewById(R.id.tv_state_night);
                holder.mTvTemNight = (TextView) view.findViewById(R.id.tv_tem_night);
                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }
            holder.mTvShowData.setText("日期:" + mList.get(i).getDate());
            holder.mTvStateDay.setText("白天：" + mList.get(i).mDay.getState());
            holder.mTvTemDay.setText("温度：" + mList.get(i).mDay.getTemperatrue());
            holder.mTvStateNight.setText("晚上：" + mList.get(i).mNight.getState());
            holder.mTvTemNight.setText("晚上：" + mList.get(i).mNight.getTemperatrue());

            return view;
        }

        public class ViewHolder {
            private TextView mTvShowData;
            private TextView mTvStateDay;
            private TextView mTvTemDay;
            private TextView mTvStateNight;
            private TextView mTvTemNight;
        }
    }
}
