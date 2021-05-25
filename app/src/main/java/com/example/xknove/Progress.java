package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Progress extends AppCompatActivity {

    TextView tv21;
    TextView tv22, tv23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        tv21 = (TextView) findViewById(R.id.tV21);
        tv22 = (TextView) findViewById(R.id.tV22);
        tv23 = (TextView) findViewById(R.id.tV23);

        Bundle arguments = getIntent().getExtras();

        if(arguments !=null){
            String word = arguments.get("word").toString();
            String word1 = arguments.get("word1").toString();
            String word2 = arguments.get("word2").toString();

            tv21.setText(word);
            tv22.setText(word1);
            tv23.setText(word2);

        }

    }
}