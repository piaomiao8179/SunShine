package com.feicui.sunshine;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Weather{
    private String date;
    public Day    mDay;
    public Night  mNight;
    private StringBuilder mBuilder;
    private   String cityName;



    public Weather(String cityName, String date, Day day, Night night) {
        this.cityName = cityName;
        this.date = date;
        mDay = day;
        mNight = night;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public StringBuilder getBuilder() {
        return mBuilder;
    }

    public void setBuilder(StringBuilder builder) {
        mBuilder = builder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
