package com.baijimao.gankio_demo.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baijimao.gankio_demo.R;
import com.baijimao.gankio_demo.adapter.WelfareAdapter;
import com.baijimao.gankio_demo.json.today.WelfareBean;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/4/7
 * Description:
 */
@SuppressLint("ValidFragment")
public class WelfareFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManger;
    private WelfareAdapter mWelfareAdapter;
    private int spanCount = 2;
    private Context mContext;
    private List<WelfareBean> mWelfareBeans;

    @SuppressLint("ValidFragment")
    public WelfareFragment(Context context, List<WelfareBean> welfareBeans) {
        this.mContext = context;
        this.mWelfareBeans = welfareBeans;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welfare, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerView_welfare);
        // set layoutmanager for recyclerview
        mLayoutManger = new StaggeredGridLayoutManager(spanCount, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManger);

        // create a RecyclerView.Adapter, set the adapter
        mWelfareAdapter = new WelfareAdapter(mContext, mWelfareBeans);
        mRecyclerView.setAdapter(mWelfareAdapter);

        return view;
    }
}
