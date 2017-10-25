package com.example.tenma.wolkapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton start,stop,reset;
    int steps;
    private SoundPool soundPool;

    private int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (ImageButton) findViewById(R.id.imageButton4);
        start.setOnClickListener(this);
        //ジャイロセンサー起動　歩数計測スタート

        stop = (ImageButton) findViewById(R.id.imageButton5);
        stop.setOnClickListener(this);
        //ジャイロセンサー停止　歩数計測ストップ

        reset = (ImageButton) findViewById(R.id.imageButton6);
        reset.setOnClickListener(this);
        //ジャイロセンサー取得数値消去



    }
    protected void onResume() {
        super.onResume();
        // 予め音声データを読み込む
        soundPool = new SoundPool(50, AudioManager.STREAM_MUSIC, 0);
        soundId = soundPool.load(getApplicationContext(), R.raw.clicksound1, 1);
    }

    //↓無くてもいいらしいですが、サイトのコードをコピーした時についてきたので念のため残しておきます
    /*
    protected void onPause() {
        super.onPause();
        // リリース
        soundPool.release();
    }
    private void playFromSoundPool() {
        // 再生
        soundPool.play(soundId, 1.0F, 1.0F, 0, 0, 1.0F);
    }
    */

    @Override
    public void onClick(View v) {
        soundPool.play(soundId, 1f, 1f, 0, 0, 1);    //音の大きさは0fから1fで調整できる
        Toast.makeText(this, "クリックされました！", Toast.LENGTH_SHORT).show();

    }
}
