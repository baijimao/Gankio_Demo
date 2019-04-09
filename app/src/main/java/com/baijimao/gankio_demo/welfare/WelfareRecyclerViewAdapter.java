package com.baijimao.gankio_demo.welfare;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baijimao.gankio_demo.R;
import com.baijimao.gankio_demo.json.today.WelfareBean;

import java.util.List;

/**
 * @author: baijimao
 * @date: 2019/4/9
 * Description:
 */
public class WelfareRecyclerViewAdapter extends RecyclerView.Adapter<WelfareRecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<WelfareBean> mWelfareBeans;

    public WelfareRecyclerViewAdapter(Context context, List<WelfareBean> welfareBeans) {
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

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView mCardView;
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCardView = itemView.findViewById(R.id.item_cardView);
            mImageView = itemView.findViewById(R.id.item_imageView);
            mTextView = itemView.findViewById(R.id.item_textView);

            mCardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
