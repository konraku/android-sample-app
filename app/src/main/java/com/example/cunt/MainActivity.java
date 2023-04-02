package com.example.cunt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btClear;
    Button btCunter;
    private int Cnt = 0;

    @Override
    //アプリ起動時に実行されるメソッド
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IDを取得
        //Androidアプリのリソースを参照するためのクラス
        btClear = findViewById(R.id.button_clear);
        btCunter = findViewById(R.id.button_counter);

        btCunter.setTextSize(56f);

        //各リスナークラス
        btClear.setOnClickListener(new clearListener());
        btCunter.setOnClickListener(new counterListener());
    }

    //クリアーボタンのリスナークラス
    private class clearListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Cnt=0;
            btCunter.setText(String.valueOf(Cnt));
        }
    }

    //カウンターボタンのリスナークラス
    private class counterListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Cnt++;
            btCunter.setText(String.valueOf(Cnt));
        }
    }
}