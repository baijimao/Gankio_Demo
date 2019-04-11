package com.baijimao.gankio_demo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.baijimao.gankio_demo.R;
import com.baijimao.gankio_demo.json.today.WelfareBean;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/4/9
 * Description:
 */
public class WelfareAdapter extends RecyclerView.Adapter<WelfareAdapter.ViewHolder> {

    private Context mContext;
    private List<WelfareBean> mWelfareBeans;

    public WelfareAdapter(Context context, List<WelfareBean> welfareBeans) {
        this.mContext = context;
        this.mWelfareBeans = welfareBeans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_welfare, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String url = mWelfareBeans.get(i).getUrl();
        Glide.with(mContext).asDrawable().load(url).into(viewHolder.getImageView());
    }

    @Override
    public int getItemCount() {
        return mWelfareBeans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView mImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.item_imageView);
        }

        @Override
        public void onClick(View v) {

        }

        public ImageView getImageView() {
            return mImageView;
        }
    }
}
