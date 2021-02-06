package com.tcoding.gerisayimaraci;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
             new CountDownTimer(50000,1000){

                 @Override
                 public void onTick(long millisUntilFinished) {
                     textView.setText("Sürenin Başlamasına :"+millisUntilFinished/1000+" Saniye");
                 }

                 @Override
                 public void onFinish() {
                    textView.setText("Süreniz Doldu");
                 }
                 
             }.start();
        }
    }
