package com.baijimao.gankio_demo.net.retrofit;

import com.baijimao.gankio_demo.json.GankIoToday;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author: baijimao
 * @date: 2019/4/9
 * Description:
 */
public interface GetTodayItf {

    @GET("today")
    Call<GankIoToday> getToday();
}
