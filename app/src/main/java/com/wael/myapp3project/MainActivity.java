package com.wael.myapp3project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser1, txtPW1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtUser1 = (EditText) findViewById(R.id.txtUser);
         txtPW1 = (EditText) findViewById(R.id.txtPW);
    }


    public void  loginM(View v)
    {
        String userName = "admin";
        String password = "1234";
        if (txtUser1.getText().toString().equals(userName) && txtPW1.getText().toString().equals(password))
        {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }else {
            txtUser1.setText("");
            txtPW1.setText("");
            Toast.makeText(getApplicationContext(), "Invalid User Name or Password", Toast.LENGTH_LONG).show();
        }
    }

    public void exitM(View v)
    {
        System.exit(0);
    }


}
