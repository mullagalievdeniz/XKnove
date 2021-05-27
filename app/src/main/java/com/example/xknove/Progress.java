package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Progress extends AppCompatActivity {

    TextView tv21;
    TextView tv22, tv23;
    Button sync;
    ImageView cup1, cup2, cup3;
    Button pac1, pac2, pac3;


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

        sync = (Button) findViewById(R.id.sync);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scy();
            }
        });

        cup1 = (ImageView) findViewById(R.id.cup1);
        cup2 = (ImageView) findViewById(R.id.cup2);
        cup3 = (ImageView) findViewById(R.id.cup3);


        pac1 = (Button) findViewById(R.id.pac1);
        pac2 = (Button) findViewById(R.id.pac2);
        pac3 = (Button) findViewById(R.id.pac3);

        pac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set1();
            }
        });

        pac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set2();
            }
        });

        pac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set3();
            }
        });



    }

    private void set3() {

        cup3.setImageResource(R.drawable.cup3);

        Toast toast = Toast.makeText(getApplicationContext(), "Поздравляем!",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    private void set2() {

        cup2.setImageResource(R.drawable.cup2);
        Toast toast = Toast.makeText(getApplicationContext(), "Поздравляем!",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    private void set1() {

        cup1.setImageResource(R.drawable.cup1);
        Toast toast = Toast.makeText(getApplicationContext(), "Поздравляем!",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    private void scy() {

        tv21.setText("Задача 1 выполнена");
        tv22.setText("Задача 2 выполнена");
        tv23.setText("Задача 3 выполнена");
    }
}