package com.example.taron.recyclecardviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button liner_btn;
    Button grid_btn;

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liner_btn = (Button)findViewById(R.id.act_liner_btn) ;
        grid_btn = (Button)findViewById(R.id.act_grid_btn);
        liner_btn.setOnClickListener(this);
        grid_btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.act_liner_btn:
                Intent intent = new Intent(this,LinerListActivity.class);
                startActivity(intent);
                break;
            case R.id.act_grid_btn:
                Intent intent2 = new Intent(this,GridActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
