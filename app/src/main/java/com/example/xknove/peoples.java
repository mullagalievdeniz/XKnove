package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class peoples extends AppCompatActivity {

    Button send;
    Button friend;
    Button back;
    Button frs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoples);

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

        friend = (Button) findViewById(R.id.message_send2);
        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addfriends();
            }
        });

        frs = (Button) findViewById(R.id.back2);
        frs.setVisibility(View.GONE);

        frs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfriend();
            }
        });



    }

    private void openfriend() {

        Intent intent = new Intent(this, friends.class);
        startActivity(intent);
    }

    private void addfriends() {

        String admin = "admin";

        Intent intent = new Intent(this,  friends.class);
        intent.putExtra("admin", admin);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Теперь вы друзья!", Toast.LENGTH_SHORT);
        toast.show();

        frs.setVisibility(View.VISIBLE);





    }

    private void openhome() {

        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }


}