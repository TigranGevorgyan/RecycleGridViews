package com.example.taron.recyclecardviews;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Taron on 05/04/17.
 */

public class GridAdapter extends BaseAdapter {

    ArrayList<Countries> arrayList;
    private Context context;
    private LayoutInflater inflater;

    public GridAdapter(ArrayList<Countries> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;
        if (convertView == null){
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.item_grid,null);
        }

        ImageView imageView = (ImageView)gridView.findViewById(R.id.item_grid_image);
        TextView textView = (TextView)gridView.findViewById(R.id.item_grid_country_name);
        CheckBox checkBox = (CheckBox)gridView.findViewById(R.id.item_grid_checkbox);

        Log.d("gridd","mmm");

        String toLowerCase = arrayList.get(position).getCode().toLowerCase();

        int id = context.getResources().getIdentifier("s_flag_" + toLowerCase,"drawable",context.getPackageName());
        if (id > 0)
            imageView.setImageResource(id);
        else imageView.setImageResource(R.drawable.flag_unknown);

        textView.setText(arrayList.get(position).getName());
        checkBox.setChecked(false);

        return gridView;
    }


}
