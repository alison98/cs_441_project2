package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int[] message = intent.getIntArrayExtra("val");
        System.out.println(message[0] + ", " + message[1] + ", " + message[2]);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(message[0], message[1], message[2]));
        setContentView(R.layout.activity_2);
    }

    public void switch_main(View view){
        Intent main_activity = new Intent(this, MainActivity.class);
        startActivity(main_activity);
    }
}