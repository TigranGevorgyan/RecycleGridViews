package com.example.taron.recyclecardviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class LinerListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Countries> countriesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_list);

        countriesInit();

        Intent intent = getIntent();
        recyclerView = (RecyclerView)findViewById(R.id.act_recycle_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(countriesList,this);
        recyclerView.setAdapter(adapter);
    }

    public void countriesInit(){
        countriesList.add(new Countries("Armenia",false,"AM"));
        countriesList.add(new Countries("Austria",true,"AT"));
        countriesList.add(new Countries("Angola",false,"AD"));
        countriesList.add(new Countries("Brazil",false,"Br"));
        countriesList.add(new Countries("Azerbaijan",false,"AZ"));
        countriesList.add(new Countries("Belarus",false,"BY"));
        countriesList.add(new Countries("Canada",false,"CA"));
        countriesList.add(new Countries("Cuba",false,"CU"));
        countriesList.add(new Countries("France",false,"FR"));
        countriesList.add(new Countries("Georgia",false,"GE"));
        countriesList.add(new Countries("Georgia",false,"GO"));
    }
}
