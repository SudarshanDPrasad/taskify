package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homeexpanded extends AppCompatActivity {
    private Button mbtndelete;
    private Button mbtnupdate;
    private Button mbtnfront;
    private Button mfab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeexpanded);
        intidviews();

        mbtnfront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Homeexpanded.this,Profile.class);
                startActivity(intent);
            }
        });
        mfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homeexpanded.this,newtask.class);
                startActivity(intent);

            }
        });
    }

    private void intidviews() {
        mbtndelete=findViewById(R.id.btndelete);
        mbtnupdate=findViewById(R.id.btnupdate);
        mbtnfront=findViewById(R.id.btnfront);
        mfab=findViewById(R.id.fab);
    }
}