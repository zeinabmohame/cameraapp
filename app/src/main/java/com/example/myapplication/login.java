
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.login2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                t1=(EditText)findViewById(R.id.username);
                t2=(EditText)findViewById(R.id.password);
                intent.putExtra("username",t1.getText().toString());
                intent.putExtra("password",t2.getText().toString());
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}