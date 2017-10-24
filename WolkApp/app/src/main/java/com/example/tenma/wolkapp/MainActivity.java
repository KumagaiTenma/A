package com.example.tenma.wolkapp;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button start,stop,reset;
    int steps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button);
        start.setOnClickListener(this);
        //ジャイロセンサー起動　歩数計測スタート

        stop = (Button) findViewById(R.id.button2);
        stop.setOnClickListener(this);
        //ジャイロセンサー停止　歩数計測ストップ

        reset = (Button) findViewById(R.id.button3);
        reset.setOnClickListener(this);
        //ジャイロセンサー取得数値消去
    }

    @Override
    public void onClick(View v) {


    }
}
