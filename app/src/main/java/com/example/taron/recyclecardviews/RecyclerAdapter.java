package com.example.taron.recyclecardviews;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Taron on 05/04/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    public ArrayList<Countries> arrayList;
    public Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView countryFlag;
        TextView countryName;
        CheckBox countryChechked;


        public ViewHolder(View itemView) {
            super(itemView);
            countryFlag = (ImageView)itemView.findViewById(R.id.item_liner_image);
            countryName = (TextView)itemView.findViewById(R.id.item_country_name);
            countryChechked = (CheckBox)itemView.findViewById(R.id.item_liner_cheackbox);
        }
    }


    public RecyclerAdapter(ArrayList<Countries> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_liner,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String toLowerCase = arrayList.get(position).getCode().toLowerCase();

        int id = context.getResources().getIdentifier("flag_" + toLowerCase,"drawable",context.getPackageName());

        if (id > 0)
            holder.countryFlag.setImageResource(id);
        else holder.countryFlag.setImageResource(R.drawable.flag_unknown);

        holder.countryName.setText(arrayList.get(position).getName());
        holder.countryChechked.setChecked(false);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    }
