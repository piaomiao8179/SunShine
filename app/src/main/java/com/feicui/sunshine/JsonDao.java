package com.feicui.sunshine;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/2.
 */
public class JsonDao {
    private String       json;
    private ArrayList<Weather> mList;

    public JsonDao(String json, ArrayList<Weather> list) {
        this.json = json;
        mList = list;
    }

    //解析json
    public ArrayList<Weather> parseJson() {
        try {
            JSONObject jsonObject = new JSONObject(json);
            String reason = jsonObject.getString("reason");
            if (reason.equals("successed!")) {
                //解析json文件的天气
                JSONObject result = jsonObject.getJSONObject("result");
                JSONObject data = result.getJSONObject("data");
                //获取城市名
                JSONObject cityname = data.getJSONObject("pm25");
                String cityName = cityname.getString("cityName");
                //获取天气
                JSONArray weather = data.getJSONArray("weather");
                for (int i = 0; i < weather.length(); i++) {
                    JSONObject json = weather.getJSONObject(i);
                    //获取当天的日期
                    String today = json.getString("date");
                    Log.d("data", "parseJson: " + today);
                    //获取白天的天气情况
                    JSONObject infoDay = json.getJSONObject("info");
                    JSONArray day = infoDay.getJSONArray("day");
                    String stateDay = day.get(1).toString();
                    String temperatrueDay = day.get(2).toString();
                    //将数据封装进Day中
                    Day d = new Day();
                    d.setState(stateDay);
                    d.setTemperatrue(temperatrueDay);
                    //获取晚上的天气情况
                    JSONObject infoNight = json.getJSONObject("info");
                    JSONArray night = infoDay.getJSONArray("night");
                    String stateNight = day.get(1).toString();
                    String temperatrueNight = day.get(2).toString();
                    //将数据封装进Night中
                    Night n = new Night();
                    n.setState(stateNight);
                    n.setTemperatrue(temperatrueNight);
                    Weather w = new Weather(cityName,today,d,n);
                    w.setDate(today);
                    //添加进集合中
                    mList.add(w);
                }

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mList;
    }
}
