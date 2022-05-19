package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class home extends AppCompatActivity {
TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(home.this,login.class);
                startActivityForResult(i,100);
            }
        });


        findViewById(R.id.signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(home.this,Signup.class);
                startActivityForResult(i,200);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100 && resultCode==RESULT_OK){
            String username =data.getExtras().getString("username");
            String password  =data.getExtras().getString("password");
            tt=(TextView)findViewById(R.id.show);
            tt.setText(" your username is :"+username +" and your password is : "+password);
        }
        else if(requestCode==200 && resultCode==RESULT_OK){
            String fullname =data.getExtras().getString("fullname");
            String email  =data.getExtras().getString("email");
            tt=(TextView)findViewById(R.id.show);
            tt.setText(" your fullname is :"+fullname +" and your email is : "+email);}


    }
}
