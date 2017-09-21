package com.fatihacar.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Syntax's
        //myImage -> Camel Case -> Androidte kullanılan Syntax
        //my_image -> Snake Case
        //MyImage -> Pascal Case

        Button button=(Button) findViewById(R.id.myButton);
        //layout kısmında olanlara artık erişilebiliyor.


    }

    public void changeImage(View view){
        ImageView imageView=(ImageView) findViewById(R.id.myImage);
        imageView.setImageResource(R.drawable.aurora);
    }
    public void  Onceki(View view){
        ImageView image=(ImageView) findViewById(R.id.myImage);
        image.setImageResource(R.drawable.sea);
    }
}
