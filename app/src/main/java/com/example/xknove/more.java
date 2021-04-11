package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class more extends AppCompatActivity {
    
    ImageButton homebutton;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        homebutton = (ImageButton) findViewById(R.id.homenavigationButton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
                
            }
        });
    }

    private void openhome() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}