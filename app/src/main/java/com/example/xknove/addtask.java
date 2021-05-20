package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.HashMap;
import java.util.Map;

public class addtask extends AppCompatActivity {

    EditText taskInput1;
    EditText taskInput2;
    EditText taskInput3;
    String task1;
    String task2;
    String task3;

    Button ai;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);



        ai = (Button) findViewById(R.id.aibtn);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tracert();
            }
        });









        }

    private void tracert() {

        taskInput1 = (EditText) findViewById(R.id.taskinput1);
        task1 = taskInput1.getText().toString();


        taskInput2 = (EditText) findViewById(R.id.taskinput2);
        task2 = taskInput2.getText().toString();

        taskInput3 = (EditText) findViewById(R.id.taskinput3);
        task3 = taskInput3.getText().toString();

        Intent intent = new Intent(this, aitask.class);
        intent.putExtra("task1", task1);
        intent.putExtra("task2", task2);
        intent.putExtra("task3", task3);
        startActivity(intent);


    }


}


