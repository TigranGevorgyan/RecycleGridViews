package com.example.taron.recyclecardviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Countries> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        String[] names = {"aa","bb","vv","ff"};
        String[] countres = {"aaa","bba","vva","ffa"};
        arrayList = new ArrayList<>();
        countriesInit();

        gridView = (GridView)findViewById(R.id.grid_view);

        GridAdapter gridAdapter = new GridAdapter(arrayList,GridActivity.this);

        gridView.setAdapter(gridAdapter);

    }

    public void countriesInit(){
        arrayList.add(new Countries("Armenia",false,"AM"));
        arrayList.add(new Countries("Austria",true,"AT"));
        arrayList.add(new Countries("Angola",false,"AD"));
        arrayList.add(new Countries("Brazil",false,"Br"));
        arrayList.add(new Countries("Azerbaijan",false,"AZ"));
        arrayList.add(new Countries("Belarus",false,"BY"));
        arrayList.add(new Countries("Canada",false,"CA"));
        arrayList.add(new Countries("Cuba",false,"CU"));
        arrayList.add(new Countries("France",false,"FR"));
        arrayList.add(new Countries("Georgia",false,"GE"));
        arrayList.add(new Countries("Georgia",false,"GO"));
    }
}
