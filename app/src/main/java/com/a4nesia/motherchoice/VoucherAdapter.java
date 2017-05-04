package com.a4nesia.motherchoice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

/**
 * Created by Dhian on 28/04/2017.
 */

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.ViewHolder>{

    private ArrayList<Voucher> voucherList;
    private RequestManager glide;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView voucherName;
        public ImageView background;

        public ViewHolder(View view){
            super(view);
            //voucherName = (TextView) view.findViewById(R.id.voucher_name);
            background = (ImageView) view.findViewById(R.id.voucher_background);
        }

    }

    public VoucherAdapter(ArrayList<Voucher> voucherList, RequestManager glide){
        this.voucherList = voucherList;
        this.glide = glide;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.voucher_list_row, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        Voucher voucher = voucherList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voucherList.get(position).setStatus(true);
            }
        });
        glide.load(voucher.getDrawableId()).into(holder.background);
    }

    public int getItemCount(){
        return voucherList.size();
    }

}
