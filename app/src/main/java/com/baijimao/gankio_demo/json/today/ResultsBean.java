package com.baijimao.gankio_demo.json.today;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/3/31
 * Description:
 */
public class ResultsBean {
    private List<AndroidBean> androidBeans;
    private List<AppBean> appBeans;
    private List<IOSBean> iosBeans;
    private List<RestVedioBean> restVedioBeans;
    private List<FrontEndBean> frontEndBeans;
    private List<ExpandResourceBean> expandResourceBeans;
    private List<BlindRecommendBean> blindRecommendBeans;
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

    public List<RestVedioBean> getRestVedioBeans() {
        return restVedioBeans;
    }

    public void setRestVedioBeans(List<RestVedioBean> restVedioBeans) {
        this.restVedioBeans = restVedioBeans;
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
                ", restVedioBeans=" + restVedioBeans +
                ", frontEndBeans=" + frontEndBeans +
                ", expandResourceBeans=" + expandResourceBeans +
                ", blindRecommendBeans=" + blindRecommendBeans +
                ", welfareBeans=" + welfareBeans +
                '}';
    }
}
