package com.baijimao.gankio_demo.net.retrofit;

import android.util.Log;

import com.baijimao.gankio_demo.json.GankIoToday;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: baijimao
 * @date: 2019/4/9
 * Description:
 */
public class RetrofitUtils {

    private static final String GANK_API = "http://gank.io/api/";

    private static RetrofitUtils mRetrofitUtils;

    public static RetrofitUtils getInstance() {
        if (mRetrofitUtils == null) {
            mRetrofitUtils = new RetrofitUtils();
        }
        return mRetrofitUtils;
    }

    public void requestToday() {
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(GANK_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetTodayItf todayItf =retrofit.create(GetTodayItf.class);
        Call<GankIoToday> call = todayItf.getToday();
        call.enqueue(new Callback<GankIoToday>() {
            @Override
            public void onResponse(Call<GankIoToday> call, Response<GankIoToday> response) {
                Log.i("cwx", "response:" + response.body());
            }

            @Override
            public void onFailure(Call<GankIoToday> call, Throwable t) {
                Log.i("cwx", "failure:" + t.toString());
            }
        });
    }
}
