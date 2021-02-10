package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reg extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        button = (Button) findViewById(R.id.reg_button);

    }

    public void onClick(View view) {
        Intent intent = new Intent(newreg.this, reg.class);
        startActivity(intent);

    }
}