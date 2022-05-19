package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class camera extends AppCompatActivity {
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        img=findViewById(R.id.imageView);

        findViewById(R.id.photo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
              startActivityForResult(n,100);
            }
        });
        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m =new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(m,200);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==100 && resultCode==RESULT_OK){
            //مسؤلة عن عرض حاجة

            img.setImageBitmap((Bitmap)data.getExtras().get("data") );
        }
        else if (requestCode ==200 && resultCode==RESULT_OK){
            Uri uri=data.getData();
            img.setImageURI(uri);
        }
    }


}