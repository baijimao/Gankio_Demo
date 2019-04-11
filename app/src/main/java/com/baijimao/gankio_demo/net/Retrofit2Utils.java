package com.baijimao.gankio_demo.net;

import com.baijimao.gankio_demo.json.GankIoToday;
import com.baijimao.gankio_demo.utils.CLog;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author: baijimao
 * @date: 2019/4/10
 * Description:
 */
public class Retrofit2Utils {

    private static final String TAG = Retrofit2Utils.class.getSimpleName();

    private static final String GANK_API = "http://gank.io/api/";

    private GankIoTodayCallback mGankIoTodayCallback;

    private static Retrofit2Utils mRetrofit2Utils;

    public static Retrofit2Utils getInstance() {
        if (mRetrofit2Utils == null) {
            mRetrofit2Utils = new Retrofit2Utils();
        }
        return mRetrofit2Utils;
    }

    public void getGankIoToday() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GANK_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GankTodayItf gankTodayItf = retrofit.create(GankTodayItf.class);
        Call<GankIoToday> call = gankTodayItf.getToday();
        call.enqueue(new Callback<GankIoToday>() {
            @Override
            public void onResponse(Call<GankIoToday> call, Response<GankIoToday> response) {
                CLog.i(TAG, response.body().toString());
                mGankIoTodayCallback.onSuccessed(response.body());
            }

            @Override
            public void onFailure(Call<GankIoToday> call, Throwable t) {

            }
        });
    }

    public GankIoTodayCallback getGankIoTodayCallback() {
        return mGankIoTodayCallback;
    }

    public void setmGankIoTodayCallback(GankIoTodayCallback gankIoTodayCallback) {
        this.mGankIoTodayCallback = gankIoTodayCallback;
    }

    public interface GankIoTodayCallback {
        public void onSuccessed(GankIoToday gankIoToday);
        public void onFailed();
    }
}
