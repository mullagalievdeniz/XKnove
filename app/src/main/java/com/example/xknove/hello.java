package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

public class hello extends AppCompatActivity {


    private ConstraintLayout hello;
    Button reg;
    Button auth;
    Button step;
    private static int AUTH_RESULT = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        hello = findViewById(R.id.hello);
        reg = (Button) findViewById(R.id.reg_btn);
        auth = (Button) findViewById(R.id.auth_button);
        step = (Button) findViewById(R.id.step_btn);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), AUTH_RESULT);
            }
        });

        auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startauth();
            }
        });

        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                step1();
            }
        });




    }

    private void step1() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Профиль не выбран", Toast.LENGTH_LONG);
        toast.show();


    }

    private void startauth() {
        if(FirebaseAuth.getInstance().getCurrentUser() == null)
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), AUTH_RESULT);
        else
            Toast.makeText(this, "Авторизация успешна!", Toast.LENGTH_SHORT).show();



    }
}