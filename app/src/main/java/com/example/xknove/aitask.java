package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class aitask extends AppCompatActivity {



    Button scf1, scf2, scf3, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aitask);

        scf1 = (Button) findViewById(R.id.task1t);
        scf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sucefull1();
            }
        });

    }

    private void sucefull1() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выполнено", Toast.LENGTH_SHORT);
        toast.show();
    }


}




