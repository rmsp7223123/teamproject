package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text_cost1, text_cnt1, text_cost2, text_cnt2, text_cost3, text_cnt3, text_cost4, text_cnt4;
    Button btn1, btn2, btn3, btn4;

    int money = 10000;

    ArrayList<MainDTO> dto = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dto.add(new MainDTO("콜라", 800, 10));
        dto.add(new MainDTO("사이다", 900, 15));
        dto.add(new MainDTO("환타", 700, 0));
        dto.add(new MainDTO("실론티", 100, 9));




        text_cost1 = findViewById(R.id.text_cost1);
        text_cnt1 = findViewById(R.id.text_cnt1);
        btn1 = findViewById(R.id.btn1);
        text_cost2 = findViewById(R.id.text_cost2);
        text_cnt2 = findViewById(R.id.text_cnt2);
        btn2 = findViewById(R.id.btn2);
        text_cost3 = findViewById(R.id.text_cost3);
        text_cnt3 = findViewById(R.id.text_cnt3);
        btn3 = findViewById(R.id.btn3);
        text_cost4 = findViewById(R.id.text_cost4);
        text_cnt4 = findViewById(R.id.text_cnt4);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        text_cost1.setText(dto.get(0).getCost()+"원");
        text_cnt1.setText(dto.get(0).getCnt()+"개 남음");
        btn2.setOnClickListener(this);
        text_cost2.setText(dto.get(1).getCost()+"원");
        text_cnt2.setText(dto.get(1).getCnt()+"개 남음");
        btn3.setOnClickListener(this);
        text_cost3.setText(dto.get(2).getCost()+"원");
        text_cnt3.setText(dto.get(2).getCnt()+"개 남음");
        btn4.setOnClickListener(this);
        text_cost4.setText(dto.get(3).getCost()+"원");
        text_cnt4.setText(dto.get(3).getCnt()+"개 남음");

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn1) {
            if(dto.get(0).getCnt()>0) {
                if(money>=(dto.get(0).getCost() )){
                    dto.set(0, new MainDTO(dto.get(0).getName(), dto.get(0).getCost(), dto.get(0).getCnt()-1));
                    money -= dto.get(0).getCost();
                    text_cnt1.setText(dto.get(0).getCnt()+"개 남음");
                }else {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(MainActivity.this, "다른 음료를 선택하세요.", Toast.LENGTH_SHORT).show();
            }
        }else if(v.getId() == R.id.btn2) {
            if(dto.get(1).getCnt()>0) {
                if(money>=(dto.get(1).getCost() )){
                    dto.set(1, new MainDTO(dto.get(1).getName(), dto.get(1).getCost(), dto.get(1).getCnt()-1));
                    money -= dto.get(1).getCost();
                    text_cnt2.setText(dto.get(1).getCnt()+"개 남음");
                }else {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(MainActivity.this, "다른 음료를 선택하세요.", Toast.LENGTH_SHORT).show();
            }
        }else if(v.getId() == R.id.btn3) {
            if(dto.get(2).getCnt()>0) {
                if(money>=(dto.get(2).getCost() )){
                    dto.set(2, new MainDTO(dto.get(2).getName(), dto.get(2).getCost(), dto.get(2).getCnt()-1));
                    money -= dto.get(2).getCost();
                    text_cnt3.setText(dto.get(2).getCnt()+"개 남음");
                }else {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(MainActivity.this, "다른 음료를 선택하세요.", Toast.LENGTH_SHORT).show();
            }
        }else if(v.getId() == R.id.btn4) {
            if(dto.get(3).getCnt()>0) {
                if(money>=(dto.get(3).getCost() )){
                    dto.set(3, new MainDTO(dto.get(3).getName(), dto.get(3).getCost(), dto.get(3).getCnt()-1));
                    money -= dto.get(3).getCost();
                    text_cnt4.setText(dto.get(3).getCnt()+"개 남음");
                }else {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(MainActivity.this, "다른 음료를 선택하세요.", Toast.LENGTH_SHORT).show();
            }
        }



    }
}