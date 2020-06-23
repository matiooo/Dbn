package com.example.dbn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dbn.WelcomePage.WelcomeActivity;

public class test extends AppCompatActivity {

    Button btn_matiooo,btn_hadanooo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn_matiooo = findViewById(R.id.matiooo);
        btn_hadanooo = findViewById(R.id.hadanooo);

        btn_matiooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
        btn_hadanooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}