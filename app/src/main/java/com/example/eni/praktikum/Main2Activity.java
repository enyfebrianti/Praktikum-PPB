package com.example.eni.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void showinfo(View view){
        Intent in = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(in);
    }
}
