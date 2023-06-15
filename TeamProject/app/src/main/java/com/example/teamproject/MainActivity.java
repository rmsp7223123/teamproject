package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text_cost, text_ea, text_money;
    Button btn1;
    int cost =100;
    int ea =10;
    int money=10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        text_cost = findViewById(R.id.text_cost);
        text_ea = findViewById(R.id.text_ea);
        text_money=findViewById(R.id.text_money);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(this);
        text_cost.setText(cost+"원");
        text_ea.setText(ea+"개 남음");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn1 && money>cost) {
            ea=9;
            text_cost.setText(cost+"원");
            text_ea.setText(ea+"개 남음");
        }else {
            Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
        }

    }
}