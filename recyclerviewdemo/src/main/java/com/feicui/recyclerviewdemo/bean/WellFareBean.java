package com.feicui.recyclerviewdemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/5.
 */
public class WellFareBean {

    /**
     * error : false
     * results : [{"_id":"56cc6d1c421aa95caa707523","createdAt":"2015-11-04T10:33:50.564Z","desc":"11.5","publishedAt":"2015-11-05T04:02:52.968Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exp4h479xfj20hs0qoq6t.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707637","createdAt":"2015-06-16T01:02:36.279Z","desc":"6.16","publishedAt":"2015-06-16T05:56:27.410Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1et5nl9mno8j20hs0qoacj.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707642","createdAt":"2015-07-15T03:56:42.772Z","desc":"7.15","publishedAt":"2015-07-15T04:05:29.732Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg","used":true,"who":"小贝"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075a6","createdAt":"2015-11-02T03:53:25.557Z","desc":"11.2","publishedAt":"2015-11-02T04:16:06.443Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1exmhnx76z9j20go0dcabp.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean           error;
    /**
     * _id : 56cc6d1c421aa95caa707523
     * createdAt : 2015-11-04T10:33:50.564Z
     * desc : 11.5
     * publishedAt : 2015-11-05T04:02:52.968Z
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/7a8aed7bjw1exp4h479xfj20hs0qoq6t.jpg
     * used : true
     * who : 张涵宇
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
