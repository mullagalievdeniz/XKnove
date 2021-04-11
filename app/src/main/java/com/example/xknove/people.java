package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class people extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        imageButton = (ImageButton) findViewById(R.id.avatarbutton1);
        imageButton = (ImageButton) findViewById(R.id.avatarbutton2);

    }



    public void onClick(View view) {
        Intent intent = new Intent(people.this, userprofile.class);
        startActivity(intent);
    }


}




