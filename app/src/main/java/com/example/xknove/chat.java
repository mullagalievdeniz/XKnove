package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

import android.text.format.DateFormat;


public class chat extends AppCompatActivity {
    ImageButton startButton, sendmessagebutton;
    private FirebaseListAdapter<Message> adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        startButton = (ImageButton) findViewById(R.id.startbutton);
        sendmessagebutton = (ImageButton) findViewById(R.id.sendmessagebutton);
        sendmessagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaymessages();
            }
        });


    }

    private void displaymessages() {
        ListView messagelist = findViewById(R.id.messagelist);
        adapter = new FirebaseListAdapter<Message>(this, Message.class, R.layout.listitem, FirebaseDatabase.getInstance().getReference()) {
            @Override
            protected void populateView(View v, Message model, int position) {
                TextView messtext, messtime;
                messtext = findViewById(R.id.message_text);
                messtime = findViewById(R.id.message_time);

                messtext.setText(model.getTextMessage());
                messtime.setText(DateFormat.format("dd-mm-yy HH:mm", model.getMessageTime()));


            }
        };

    }
}

