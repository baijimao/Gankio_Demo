package com.baijimao.gankio_demo.net;


import com.baijimao.gankio_demo.json.GankIoToday;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author: baijimao
 * @date: 2019/4/10
 * Description:
 */
public interface GankTodayItf {

    @GET("today")
    Call<GankIoToday> getToday();
}
