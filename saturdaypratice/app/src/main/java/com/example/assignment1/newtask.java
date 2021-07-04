package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newtask extends AppCompatActivity {
    private Button mbtnaddnewtask;
    private Button mbtnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtask);
        intidviews();
        mbtnaddnewtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(newtask.this,EndTask.class);
                startActivity(intent);
            }
        });
        mbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newtask.this,Home.class);
                startActivity(intent);
            }
        });

    }

    private void intidviews() {
     mbtnback=findViewById(R.id.btnback);
        mbtnaddnewtask=findViewById(R.id.btnaddnewtask);
    }
}