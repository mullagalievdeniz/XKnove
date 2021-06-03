package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class input extends AppCompatActivity {

    Button next;
    EditText input;
    String message;
    Button back;
    Button v2;
    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        //input = (EditText) findViewById(R.id.input55);
        next = (Button) findViewById(R.id.next);

        info = (Button) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in();
            }
        });

        back = (Button) findViewById(R.id.button3);

        v2 = (Button) findViewById(R.id.button9);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweb();
            }
        });

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

    private void in() {

        String info = "Меню";

      Intent intent;
      intent = new Intent(this, output.class);
      intent.putExtra("message", info);
      startActivity(intent);

    }

    private void openweb() {

        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://app.engati.com/static/standalone/bot.html?bot_key=4bb7cb7270de4781&env=p"));
        startActivity(intent);
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