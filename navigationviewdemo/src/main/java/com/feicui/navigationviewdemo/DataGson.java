package com.feicui.navigationviewdemo;

import java.util.List;

/**
 * Created by Administrator on 2016/8/3.
 */
public class DataGson {


    /**
     * reason : successed!
     * result : {"data":{"realtime":{"wind":{"windspeed":"7.0","direct":"东风","power":"2级","offset":null},"time":"10:00:00","weather":{"humidity":"83","img":"1","info":"多云","temperature":"27"},"dataUptime":1470191642,"date":"2016-08-03","city_code":"101120101","city_name":"济南","week":3,"moon":"七月初一"},"life":{"date":"2016-8-3","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"]}},"weather":[{"date":"2016-08-03","info":{"night":["1","多云","23","东北风","微风","19:16"],"day":["1","多云","31","东北风","微风","05:19"]},"week":"三","nongli":"七月初一"},{"date":"2016-08-04","info":{"dawn":["1","多云","23","东北风","微风","19:16"],"night":["4","雷阵雨","24","南风","微风","19:15"],"day":["1","多云","31","北风","微风","05:20"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["4","雷阵雨","24","南风","微风","19:15"],"night":["2","阴","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:21"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["2","阴","24","南风","微风","19:14"],"night":["1","多云","24","北风","微风","19:13"],"day":["1","多云","31","东北风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","北风","微风","19:13"],"night":["1","多云","25","南风","微风","19:12"],"day":["1","多云","32","南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"night":["1","多云","24","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["1","多云","25","西南风","微风","19:30"],"day":["0","晴","33","西南风","微风","07:30"]},"week":"二","nongli":"七月初七"}],"pm25":{"key":"","show_desc":0,"pm25":{"curPm":"268","pm25":"141","pm10":"268","level":4,"quality":"中度污染","des":"儿童、老年人及心脏病和呼吸系统疾病患者应避免长时间、高强度的户外锻炼，一般人群适量减少户外运动。"},"dateTime":"2016年08月03日10时","cityName":"济南"},"date":null,"isForeign":0}}
     * error_code : 0
     */

    private String     reason;
    /**
     * data : {"realtime":{"wind":{"windspeed":"7.0","direct":"东风","power":"2级","offset":null},"time":"10:00:00","weather":{"humidity":"83","img":"1","info":"多云","temperature":"27"},"dataUptime":1470191642,"date":"2016-08-03","city_code":"101120101","city_name":"济南","week":3,"moon":"七月初一"},"life":{"date":"2016-8-3","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"]}},"weather":[{"date":"2016-08-03","info":{"night":["1","多云","23","东北风","微风","19:16"],"day":["1","多云","31","东北风","微风","05:19"]},"week":"三","nongli":"七月初一"},{"date":"2016-08-04","info":{"dawn":["1","多云","23","东北风","微风","19:16"],"night":["4","雷阵雨","24","南风","微风","19:15"],"day":["1","多云","31","北风","微风","05:20"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["4","雷阵雨","24","南风","微风","19:15"],"night":["2","阴","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:21"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["2","阴","24","南风","微风","19:14"],"night":["1","多云","24","北风","微风","19:13"],"day":["1","多云","31","东北风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","北风","微风","19:13"],"night":["1","多云","25","南风","微风","19:12"],"day":["1","多云","32","南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"night":["1","多云","24","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["1","多云","25","西南风","微风","19:30"],"day":["0","晴","33","西南风","微风","07:30"]},"week":"二","nongli":"七月初七"}],"pm25":{"key":"","show_desc":0,"pm25":{"curPm":"268","pm25":"141","pm10":"268","level":4,"quality":"中度污染","des":"儿童、老年人及心脏病和呼吸系统疾病患者应避免长时间、高强度的户外锻炼，一般人群适量减少户外运动。"},"dateTime":"2016年08月03日10时","cityName":"济南"},"date":null,"isForeign":0}
     */

    private ResultBean result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * realtime : {"wind":{"windspeed":"7.0","direct":"东风","power":"2级","offset":null},"time":"10:00:00","weather":{"humidity":"83","img":"1","info":"多云","temperature":"27"},"dataUptime":1470191642,"date":"2016-08-03","city_code":"101120101","city_name":"济南","week":3,"moon":"七月初一"}
         * life : {"date":"2016-8-3","info":{"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"]}}
         * weather : [{"date":"2016-08-03","info":{"night":["1","多云","23","东北风","微风","19:16"],"day":["1","多云","31","东北风","微风","05:19"]},"week":"三","nongli":"七月初一"},{"date":"2016-08-04","info":{"dawn":["1","多云","23","东北风","微风","19:16"],"night":["4","雷阵雨","24","南风","微风","19:15"],"day":["1","多云","31","北风","微风","05:20"]},"week":"四","nongli":"七月初二"},{"date":"2016-08-05","info":{"dawn":["4","雷阵雨","24","南风","微风","19:15"],"night":["2","阴","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:21"]},"week":"五","nongli":"七月初三"},{"date":"2016-08-06","info":{"dawn":["2","阴","24","南风","微风","19:14"],"night":["1","多云","24","北风","微风","19:13"],"day":["1","多云","31","东北风","微风","05:22"]},"week":"六","nongli":"七月初四"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","北风","微风","19:13"],"night":["1","多云","25","南风","微风","19:12"],"day":["1","多云","32","南风","微风","05:23"]},"week":"日","nongli":"七月初五"},{"date":"2016-08-08","info":{"night":["1","多云","24","","微风","19:30"],"day":["4","雷阵雨","32","","微风","07:30"]},"week":"一","nongli":"七月初六"},{"date":"2016-08-09","info":{"night":["1","多云","25","西南风","微风","19:30"],"day":["0","晴","33","西南风","微风","07:30"]},"week":"二","nongli":"七月初七"}]
         * pm25 : {"key":"","show_desc":0,"pm25":{"curPm":"268","pm25":"141","pm10":"268","level":4,"quality":"中度污染","des":"儿童、老年人及心脏病和呼吸系统疾病患者应避免长时间、高强度的户外锻炼，一般人群适量减少户外运动。"},"dateTime":"2016年08月03日10时","cityName":"济南"}
         * date : null
         * isForeign : 0
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * date : 2016-8-3
             * info : {"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"]}
             */

            private LifeBean life;

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public static class LifeBean {
                private String   date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> kongtiao;
                    private List<String> yundong;
                    private List<String> ziwaixian;
                    private List<String> ganmao;
                    private List<String> xiche;
                    private List<String> wuran;
                    private List<String> chuanyi;

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getWuran() {
                        return wuran;
                    }

                    public void setWuran(List<String> wuran) {
                        this.wuran = wuran;
                    }

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }
                }
            }
        }
    }
}
