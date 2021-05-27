package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class friends extends AppCompatActivity {

    Button back;
    Button dlt;
    Button sync;
    TextView tv;
    String admin = "admin";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        tv = (TextView) findViewById(R.id.name2);

        //Bundle arguments = getIntent().getExtras();

       // if (arguments != null) {
            //String admin = arguments.get("admin").toString();
            //tv.setText(admin);


        //}

        back = (Button) findViewById(R.id.button4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

        dlt = (Button) findViewById(R.id.delete);
        dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
            }
        });

        sync = (Button) findViewById(R.id.sync1);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sync5();
            }
        });
    }

    private void sync5() {

        tv.setText(admin);
    }

    private void delete() {

        tv.setText(" ");
        Toast toast = Toast.makeText(getApplicationContext(),
        "Друг удалён", Toast.LENGTH_SHORT);
        toast.show();

    }

    private void openhome() {

        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}