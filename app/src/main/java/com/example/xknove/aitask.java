package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class aitask extends AppCompatActivity {




    Button scf1, scf2, scf3, add;
    TextView tv1, tv2, tv3;
    String task1;
    String task2;
    String task3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aitask);

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
                sucefull1();
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
                sucefull1();
            }
        });

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);


        Bundle arguments = getIntent().getExtras();

        if(arguments!= null){
            String task1 = arguments.get("task1").toString();
            String task2 = arguments.get("task2").toString();
            String task3 = arguments.get("task3").toString();

            this.task1 = task1;
            this.task2 = task2;
            this.task3 = task3;

            }

        if(task1 == "Homework")
            tv1.setText(task1);

        if(task2 == "Homework")
            tv1.setText(task2);

        if(task3 == "Homework")
            tv1.setText(task3);

        if(task1 == "Walk")
            tv2.setText(task1);

        if(task2 == "Walk")
            tv2.setText(task2);

        if(task3 == "Walk")
            tv2.setText(task3);


            //tv1.setText(task1);
            //tv2.setText(task2);
            //tv3.setText(task3);


        }










    private void openadd() {
        Intent intent = new Intent(this, addtask.class);
        startActivity(intent);
    }

    private void sucefull1() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выполнено", Toast.LENGTH_SHORT);
        toast.show();



        



    }
}





