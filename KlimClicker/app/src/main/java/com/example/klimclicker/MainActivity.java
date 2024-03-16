package com.example.klimclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private long score = 0;
    int score = 0;
    int money = 1;
    TextView mainTextView;
    ImageButton mainBtn;
    ImageButton mainBtn2;
    ImageButton mainBtn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainBtn = (ImageButton) findViewById(R.id.main_btn);
        mainBtn2 = (ImageButton) findViewById(R.id.main_btn_2);
        mainBtn3 = (ImageButton) findViewById(R.id.main_btn_3);
        mainBtn();//*
        mainBtn2();//*
        mainBtn3();
    }
    void mainBtn(){
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score += money;
                mainTextView.setText("Кликов: " + score);
            }
        });
    }
    void mainBtn2(){
        mainBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score -= money;
                mainTextView.setText("Кликов: " + score);
            }
        });
    }
    void mainBtn3(){
        mainBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                mainTextView.setText("Кликов: " + score);
            }
        });
    }
}