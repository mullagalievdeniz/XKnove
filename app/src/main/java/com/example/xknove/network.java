package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class network extends AppCompatActivity {

    ImageButton home, ai, more;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        home = (ImageButton) findViewById(R.id.homenavigationButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

        ai = (ImageButton) findViewById(R.id.assistantnavigationbutton);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openai();
            }
        });

        more = (ImageButton) findViewById(R.id.morenavigationbutton);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmore();
            }
        });
    }

    private void openmore() {

        Intent intent = new Intent(this, more.class);
        startActivity(intent);
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