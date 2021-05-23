package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;



public class aitask extends AppCompatActivity {


    Button scf1, scf2, scf3, add;
    TextView tv1, tv2, tv3;
    String task1;
    String task2;
    String task3;
    ImageView iv1, iv2, iv3;
    String word;
    String word1;
    String word2;
    Button progress2;
    Button nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aitask);

        progress2 = (Button) findViewById(R.id.progress2);
        //progress2.setVisibility(View.GONE);

        progress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprogress();
            }
        });

        scf1 = (Button) findViewById(R.id.task1t1);
        scf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sucefull1();
            }
        });

        scf2 = (Button) findViewById(R.id.task1t2);
        scf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sucefull2();
            }
        });

        add = (Button) findViewById(R.id.add_button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openadd();
            }
        });

        scf3 = (Button) findViewById(R.id.task1t3);
        scf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sucefull3();
            }
        });

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);


        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {
            String task1 = arguments.get("task1").toString();
            String task2 = arguments.get("task2").toString();
            String task3 = arguments.get("task3").toString();

            // this.task1 = task1;
            //this.task2 = task2;
            //this.task3 = task3;

            tv1.setText(task1);
            tv2.setText(task2);
            tv3.setText(task3);

        }

        //if(task1 == "Homework")
        //tv1.setText(task1);

        iv1 = (ImageView) findViewById(R.id.iv);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);


        final int max = 2;
        final int rnd = rnd(max);

        if(rnd == 0) {
            iv1.setImageResource(R.drawable.allow);
        }

        if(rnd == 1) {
            iv2.setImageResource(R.drawable.allow);
        }

        if(rnd == 2) {
            iv3.setImageResource(R.drawable.allow);
        }

        word = "Задача №1 выполнена!";
        word1 = "Задача №2 выполнена!";
        word2 = "Задача №3 выполнена!";

        nav = (Button) findViewById(R.id.nav);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });



        }

    private void openhome() {

        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    private void openprogress() {

        Intent intent = new Intent(this, Progress.class);
        startActivity(intent);
    }


    private void openadd() {
        Intent intent = new Intent(this, addtask.class);
        startActivity(intent);
    }

    private void sucefull1() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выполнено", Toast.LENGTH_SHORT);
        toast.show();
        tv1.setText("Выполено");

        Intent intent = new Intent(this, Progress.class);
        intent.putExtra("word", word);

        //progress2.setVisibility(View.VISIBLE);




    }


    private void sucefull2() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выполнено", Toast.LENGTH_SHORT);
        toast.show();
        tv2.setText("Выполено");

        Intent intent = new Intent(this, Progress.class);
        intent.putExtra("word1", word1);

        //progress2.setVisibility(View.VISIBLE);

    }

    private void sucefull3() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выполнено", Toast.LENGTH_SHORT);
        toast.show();
        tv3.setText("Выполено");

        Intent intent = new Intent(this, Progress.class);
        intent.putExtra("word2", word2);

        //progress2.setVisibility(View.VISIBLE);


    }


    public static int rnd(int max){
        return (int) (Math.random() * max++);
    }

}





