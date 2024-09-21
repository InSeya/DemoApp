package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Quiz_module extends AppCompatActivity implements View.OnClickListener {
    private CardView Module1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module);

        Module1 =(CardView) findViewById(R.id.module1);

        Module1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.module1:
                i = new Intent(this, Quiz_Module1.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}