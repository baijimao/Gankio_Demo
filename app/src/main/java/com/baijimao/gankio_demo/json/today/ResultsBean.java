package com.baijimao.gankio_demo.json.today;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/3/31
 * Description:
 */
public class ResultsBean {
    @SerializedName("Android")
    private List<AndroidBean> androidBeans;
    @SerializedName("App")
    private List<AppBean> appBeans;
    @SerializedName("iOS")
    private List<IOSBean> iosBeans;
    @SerializedName("休息视频")
    private List<RestVideoBean> restVideoBeans;
    @SerializedName("前端")
    private List<FrontEndBean> frontEndBeans;
    @SerializedName("拓展视频")
    private List<ExpandResourceBean> expandResourceBeans;
    @SerializedName("瞎推荐")
    private List<BlindRecommendBean> blindRecommendBeans;
    @SerializedName("福利")
    private List<WelfareBean> welfareBeans;

    public List<AndroidBean> getAndroidBeans() {
        return androidBeans;
    }

    public void setAndroidBeans(List<AndroidBean> androidBeans) {
        this.androidBeans = androidBeans;
    }

    public List<AppBean> getAppBeans() {
        return appBeans;
    }

    public void setAppBeans(List<AppBean> appBeans) {
        this.appBeans = appBeans;
    }

    public List<IOSBean> getIosBeans() {
        return iosBeans;
    }

    public void setIosBeans(List<IOSBean> iosBeans) {
        this.iosBeans = iosBeans;
    }

    public List<RestVideoBean> getRestVideoBeans() {
        return restVideoBeans;
    }

    public void setRestVedioBeans(List<RestVideoBean> restVideoBeans) {
        this.restVideoBeans = restVideoBeans;
    }

    public List<FrontEndBean> getFrontEndBeans() {
        return frontEndBeans;
    }

    public void setFrontEndBeans(List<FrontEndBean> frontEndBeans) {
        this.frontEndBeans = frontEndBeans;
    }

    public List<ExpandResourceBean> getExpandResourceBeans() {
        return expandResourceBeans;
    }

    public void setExpandResourceBeans(List<ExpandResourceBean> expandResourceBeans) {
        this.expandResourceBeans = expandResourceBeans;
    }

    public List<BlindRecommendBean> getBlindRecommendBeans() {
        return blindRecommendBeans;
    }

    public void setBlindRecommendBeans(List<BlindRecommendBean> blindRecommendBeans) {
        this.blindRecommendBeans = blindRecommendBeans;
    }

    public List<WelfareBean> getWelfareBeans() {
        return welfareBeans;
    }

    public void setWelfareBeans(List<WelfareBean> welfareBeans) {
        this.welfareBeans = welfareBeans;
    }

    @Override
    public String toString() {
        return "ResultsBean{" +
                "androidBeans=" + androidBeans +
                ", appBeans=" + appBeans +
                ", iosBeans=" + iosBeans +
                ", restVideoBeans=" + restVideoBeans +
                ", frontEndBeans=" + frontEndBeans +
                ", expandResourceBeans=" + expandResourceBeans +
                ", blindRecommendBeans=" + blindRecommendBeans +
                ", welfareBeans=" + welfareBeans +
                '}';
    }
}
