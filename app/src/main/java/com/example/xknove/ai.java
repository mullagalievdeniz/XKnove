package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class ai extends AppCompatActivity {

    String user_message;
    String bot_message;
    ImageButton send;
    TextView user;
    TextView bot;
    EditText input;
    String phrase;

    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);


        input = (EditText) findViewById(R.id.input);
        user = (TextView) findViewById(R.id.usertext);
       user_message = input.getText().toString();
       //input.setText(user_message);
       //user.setText(user_message);


        final int max = 1;
        final int random1 = rnd(max);

        if(random1 == 0) {
            phrase = "Хорошо";
        }

        if(random1 == 1) {
            phrase = "Не очень :(";

        }







        send = (ImageButton) findViewById(R.id.usermsg);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendd();
            }
        });

        if(user_message.equals("Привет")){
            bot_message = user_message;
            mp = MediaPlayer.create(this, R.raw.music1);
            mp.start();

        }

        if(user_message.equals("1")){
            bot_message = "https://gdz.ru/";
            mp = MediaPlayer.create(this, R.raw.voice);
            mp.start();



        }

        if(user_message.equals("Как дела?")){
            bot_message = phrase;
        }

        if(user_message.equals("Музыка")) {
            mp = MediaPlayer.create(this, R.raw.music );
            mp.start();


        }


        bot = (TextView) findViewById(R.id.aitext);
        bot.setText(bot_message);


    }

    private void sendd() {

        //input = (EditText) findViewById(R.id.input);
       // user_message = input.getText().toString();

        input.setText(user_message);


        user.setText(user_message);



    }


    public static int rnd(int max){
        return (int) (Math.random() * max++);
    }



}
