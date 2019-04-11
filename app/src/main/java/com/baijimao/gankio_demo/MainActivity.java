package com.baijimao.gankio_demo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baijimao.gankio_demo.fragment.WelfareFragment;
import com.baijimao.gankio_demo.json.GankIoToday;
import com.baijimao.gankio_demo.net.Retrofit2Utils;


public class MainActivity extends AppCompatActivity implements Retrofit2Utils.GankIoTodayCallback {
    private static final String TAG = MainActivity.class.getSimpleName();

    private TabLayout mTabLayout = null;
    private ViewPager mViewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit2Utils.getInstance().getGankIoToday();
        Retrofit2Utils.getInstance().setmGankIoTodayCallback(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onSuccessed(GankIoToday gankIoToday) {
        WelfareFragment welfareFragment = new WelfareFragment(this, gankIoToday.getResults().getWelfareBeans());
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content_fragment, welfareFragment);
        transaction.commit();
    }

    @Override
    public void onFailed() {

    }

//    private void initTab() {
//        mTabLayout = findViewById(R.id.tabLayout);
//        // set tab scrollable
//        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//
//
//        mViewPager = findViewById(R.id.viewPager);
//    }
}
