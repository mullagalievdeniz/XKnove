package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Progress extends AppCompatActivity {

    TextView tv21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        tv21 = (TextView) findViewById(R.id.tV21);

        Bundle arguments = getIntent().getExtras();

        if(arguments !=null){
            String word = arguments.get("word").toString();
            tv21.setText(word);

            String word1 = arguments.get("word1").toString();
            tv21.setText(word1);

            String word2 = arguments.get("word2").toString();
            tv21.setText(word2);

        }

    }
}