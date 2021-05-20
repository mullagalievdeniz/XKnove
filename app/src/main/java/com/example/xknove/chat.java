package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import android.text.format.DateFormat;
import android.widget.Toast;


public class chat extends AppCompatActivity {
    private static int AUTH_RESULT = 1;
    EditText textsend;
    ImageButton startButton, sendmessagebutton;
    private FirebaseListAdapter<Message> adapter;
    private ConstraintLayout activity_chat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        activity_chat = findViewById(R.id.activity_chat);






        startButton = (ImageButton) findViewById(R.id.startbutton);
        sendmessagebutton = (ImageButton) findViewById(R.id.sendmessagebutton);
        textsend = (EditText) findViewById(R.id.message_input);


        FirebaseDatabase.getInstance().getReference().push().setValue(
                new Message()
        );
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth();
            }
        });


    }

    private void auth() {
        if(FirebaseAuth.getInstance().getCurrentUser() == null)
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), AUTH_RESULT);
        else
            Toast.makeText(this, "Авторизация успешна!", Toast.LENGTH_SHORT).show();
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

