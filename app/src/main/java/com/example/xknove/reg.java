package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reg extends AppCompatActivity {
    Button authbutton, newregbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        newregbutton = (Button) findViewById(R.id.reg_button);
        newregbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newreg();
            }
        });




    }

    private void newreg() {
        Intent intent = new Intent(this, newlogin.class);
        startActivity(intent);
    }


}
