package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class secondpage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage2);
        findViewById(R.id.brow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=-Ny7XujiiZ0"));
                startActivity(i);

            }
        });
        findViewById(R.id.sms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:01202087215"));
                startActivity(i);
            }
        });
    }
}