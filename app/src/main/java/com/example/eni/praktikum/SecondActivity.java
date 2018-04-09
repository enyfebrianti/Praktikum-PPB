package com.example.eni.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5, t6;
    String name, reg, dept, kota, hobi, tgl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t6 = (TextView) findViewById(R.id.textView5);
        t5 = (TextView) findViewById(R.id.textView6);


        Intent i = getIntent();
        name = i.getStringExtra("name_key");
        reg = i.getStringExtra("reg_key");
        dept = i.getStringExtra("dept_key");
        kota = i.getStringExtra("kota_key");
        tgl = i.getStringExtra("tgl_key");
        hobi = i.getStringExtra("hobi_key");


        t1.setText(name);
        t2.setText(reg);
        t3.setText(dept);
        t4.setText(kota);
        t6.setText(tgl);
        t5.setText(hobi);

    }
}
