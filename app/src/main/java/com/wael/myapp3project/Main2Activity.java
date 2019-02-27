package com.wael.myapp3project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    private EditText txtName1, txtAge1,txtCollege1;
    private Spinner spinner1;
    private RadioGroup gb1;
    String[] city = { "Baghdad", "Kirkuk", "Mousl", "Basra", "Babil"};

    public Main2Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName1 = (EditText) findViewById(R.id.txtName);
        txtAge1 = (EditText) findViewById(R.id.txtAge);
        txtCollege1 = (EditText) findViewById(R.id.txtCollege);

        RadioGroup gb1 = (RadioGroup) findViewById(R.id.gb);



        Spinner spin = (Spinner) findViewById(R.id.spinner);
        //spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter arr = new ArrayAdapter(this,android.R.layout.simple_spinner_item,city);
        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(arr);
    }

    public void goFirstActivity(View v)
    {
        Intent intent2 = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent2);
    }

    public void newRecM(View v)
    {

    }
}
