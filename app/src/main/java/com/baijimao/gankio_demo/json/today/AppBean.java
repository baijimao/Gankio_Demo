package com.baijimao.gankio_demo.json.today;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/3/31
 * Description:
 */
public class AppBean {
    /**
     * _id : 5c370ae29d212264d18bb25e
     * createdAt : 2019-01-16T05:11:23.740Z
     * desc : 基于组件化 + MVP + Retrofit + RxKotlin + Dagger2实现的一款用Kotlin语言编写的影视类应用。
     * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fze9706gdzj30ae0kqmyw","https://ww1.sinaimg.cn/large/0073sXn7ly1fze970ocgxj30ae0ks0tc","https://ww1.sinaimg.cn/large/0073sXn7ly1fze97124aej30af0kq404"]
     * publishedAt : 2019-01-21T00:00:00.0Z
     * source : web
     * type : App
     * url : https://github.com/guofudong/KotlinAndroid
     * used : true
     * who : guofudong
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "AppBean{" +
                "_id='" + _id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", desc='" + desc + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", used=" + used +
                ", who='" + who + '\'' +
                ", images=" + images +
                '}';
    }
}
