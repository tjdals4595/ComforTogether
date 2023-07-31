package com.example.comfortogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    //황성민
    int a = 0;
    RelativeLayout go_play_btn;
    RelativeLayout go_tuto_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_play_btn = findViewById(R.id.go_play_btn);
        go_tuto_btn = findViewById(R.id.go_tuto_btn);

        go_play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_main_intent = new Intent(MainActivity.this,PlayActivity.class);
                startActivity(go_main_intent);
                //finish();
            }
        });

        go_tuto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_tuto_intent = new Intent(MainActivity.this,TutorialActivity.class);
                startActivity(go_tuto_intent);
                //finish();
            }
        });
    }
}