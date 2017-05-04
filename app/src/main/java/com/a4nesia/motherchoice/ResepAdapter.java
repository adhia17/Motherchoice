package com.a4nesia.motherchoice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dhian on 02/05/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder> {

    public ArrayList<Resep> resepList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView week, name;

        public ViewHolder(View view) {
            super(view);
            week = (TextView) view.findViewById(R.id.notif_minggu);
            name = (TextView) view.findViewById(R.id.notif_resep);
        }
    }


    public ResepAdapter(ArrayList<Resep> resepList) {
        this.resepList = resepList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Resep resep = resepList.get(position);
        holder.week.setText(resep.getWeek());
        holder.name.setText(resep.getName());
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }
}
