package com.feicui.recyclerviewdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.feicui.recyclerviewdemo.R;
import com.feicui.recyclerviewdemo.bean.WellBean;
import com.feicui.recyclerviewdemo.ui.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/5.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<WellBean> mRecyclerDatas;
    private Context             mContext;

    public RecyclerAdapter(Context context, ArrayList<WellBean> recyclerDatas) {
        mContext = context;
        mRecyclerDatas = recyclerDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_card_well, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Picasso.with(mContext).load(mRecyclerDatas.get(position).getUrl()).into(holder.mCardImage);
        holder.mCardText.setText(mRecyclerDatas.get(position).getText());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,DetailActivity.class);
                intent.putExtra("KEY",mRecyclerDatas.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mRecyclerDatas != null) {
            return mRecyclerDatas.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private ImageView mCardImage;
        private TextView mCardText;

        public MyViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_well);
            mCardImage = (ImageView) itemView.findViewById(R.id.card_image);
            mCardText = (TextView) itemView.findViewById(R.id.card_text);
        }
    }
}
