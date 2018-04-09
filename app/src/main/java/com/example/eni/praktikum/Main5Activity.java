package com.example.eni.praktikum;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e4;
    Button bt;
    Spinner s, s1;

    String[] dept_array = {"CSE", "ECE", "IT", "Mech", "Civil"};
    String[] kota_array = {"Surabaya", "Sidoarjo", "Gresik", "Lamongan", "Bojonegoro"};
    String name, reg, dept, kota, hobi, tgl;

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private Button btDatePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        tvDateResult = (TextView) findViewById(R.id.tv_dateresult);
        btDatePicker = (Button) findViewById(R.id.bt_datepicker);
        btDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        s = (Spinner) findViewById(R.id.spinner);
        s1 = (Spinner) findViewById(R.id.spinner1);
        e4 = (EditText) findViewById(R.id.editText5);
        bt = (Button) findViewById(R.id.button);

        ArrayAdapter adapter = new
                ArrayAdapter(Main5Activity.this, android.R.layout.simple_spinner_item, dept_array);
        s.setAdapter(adapter);

        ArrayAdapter adapter1 = new
                ArrayAdapter(Main5Activity.this, android.R.layout.simple_spinner_item, kota_array);
        s1.setAdapter(adapter1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = e1.getText().toString();
                reg = e2.getText().toString();
                dept = s.getSelectedItem().toString();
                kota = s1.getSelectedItem().toString();
                hobi = e4.getText().toString();
                tgl = tvDateResult.getText().toString();


                Intent i = new Intent(Main5Activity.this, SecondActivity.class);
                i.putExtra("name_key", name);
                i.putExtra("reg_key", reg);
                i.putExtra("dept_key", dept);
                i.putExtra("kota_key", kota);
                i.putExtra("hobi_key", hobi);
                i.putExtra("tgl_key", tgl);
                startActivity(i);


            }
        });
    }

    private  void showDateDialog(){

        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayMonth);
                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
        }
    }


