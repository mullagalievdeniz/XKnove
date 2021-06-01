package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class input extends AppCompatActivity {

    Button next;
    EditText input;
    String message;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        //input = (EditText) findViewById(R.id.input55);
        next = (Button) findViewById(R.id.next);

        back = (Button) findViewById(R.id.button3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backk();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tracert();
            }
        });
    }

    private void backk() {

        Intent intent;
        intent = new Intent(this, home.class);
        startActivity(intent);
    }

    private void tracert() {

        input = (EditText) findViewById(R.id.input55);
        message = input.getText().toString();

        Intent intent = new Intent(this, output.class);
        intent.putExtra("message", message);
        startActivity(intent);

    }
}