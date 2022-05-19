package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
EditText tt1,tt2,tt3,tt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        findViewById(R.id.sendlog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                tt1=(EditText)findViewById(R.id.fullname);
                tt2=(EditText)findViewById(R.id.username);
                tt3=(EditText)findViewById(R.id.email2);
                tt4=(EditText)findViewById(R.id.password);
                intent.putExtra("fullname",tt1.getText().toString());

                intent.putExtra("email",tt3.getText().toString());

                setResult(Activity.RESULT_OK,intent);
                finish();


            }
        });
    }
}