package com.example.eni.praktikum;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    EditText input;
    TextView displayinput;
    int ch = 1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        input = (EditText) findViewById(R.id.et_simple);
        displayinput = (TextView) findViewById(R.id.textView);

        final TextView t = (TextView) findViewById(R.id.textView);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(font);
                font = font + 5;
                if(font == 50)
                    font = 30;
            }
        });
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 3:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 4:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 5:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });
    }
    public void display(View view){
        String getinput = input.getText().toString();
        displayinput.setText(getinput);
    }
}
