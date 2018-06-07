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
    public void modul4(View view){
        Intent i = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(i);
    }
    public void modul5(View view){
        Intent i = new Intent(MainActivity.this, Main7Activity.class);
        startActivity(i);
    }
    public void modul6(View view){
        Intent i = new Intent(MainActivity.this, Main8Activity.class);
        startActivity(i);
    }
    public void modul7(View view){
        Intent a = new Intent(MainActivity.this, Main9Activity.class);
        startActivity(a);
    }
    public void modul8(View view){
        Intent b = new Intent(MainActivity.this, Main10Activity.class);
        startActivity(b);
    }
}

