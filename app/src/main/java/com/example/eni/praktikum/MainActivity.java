package com.example.eni.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void masuk(View view){
        Intent inten = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(inten);
    }

    public void modul2(View view){
        Intent itn = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(itn);
    }
    public void modul3(View view){
        Intent in = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(in);
    }
}
