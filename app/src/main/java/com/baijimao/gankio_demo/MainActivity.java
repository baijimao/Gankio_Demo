package com.baijimao.gankio_demo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baijimao.gankio_demo.net.retrofit.RetrofitUtils;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout = null;
    private ViewPager mViewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitUtils.getInstance().requestToday();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void initTab() {
        mTabLayout = findViewById(R.id.tabLayout);
        // set tab scrollable
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


        mViewPager = findViewById(R.id.viewPager);
    }
}
