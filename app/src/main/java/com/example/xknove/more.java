package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class more extends AppCompatActivity {
    
    ImageButton homebutton;
    ImageButton ai;
    ImageButton more;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        more = (ImageButton) findViewById(R.id.morenavigationbutton);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(more.this, "Вы уже на этом экране", Toast.LENGTH_SHORT).show();
            }
        });
        ai = (ImageButton) findViewById(R.id.assistantnavigationbutton);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openai();
            }
        });
        homebutton = (ImageButton) findViewById(R.id.homenavigationButton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
                
            }
        });
    }

    private void openai() {
        Intent intent = new Intent(this, assistant.class);
        startActivity(intent);
    }

    private void openhome() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}