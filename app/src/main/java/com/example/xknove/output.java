package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class output extends AppCompatActivity {

    TextView tv;
    String message;
    MediaPlayer mp;
    Button back;
    Button stop, open;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tv = (TextView) findViewById(R.id.tw25);

        back = (Button) findViewById(R.id.button2);

        stop = (Button) findViewById(R.id.stop);
        stop.setVisibility(View.GONE);

        open = (Button) findViewById(R.id.open);
        open.setVisibility(View.GONE);

        iv = (ImageView) findViewById(R.id.imageView10);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                revert();
            }
        });

        Bundle arguments = getIntent().getExtras();

        if (arguments != null) {

            String message = arguments.get("message").toString();

            this.message = message;


        }

        if (message.equals("Привет")) {
            tv.setText("Привет!");
            mp = MediaPlayer.create(this, R.raw.music1);
            mp.start();
        } else {
            tv.setText("Ой... Я пока тебя не понимаю");

        }

        if (message.equals("1")) {
            tv.setText("Портал https://gdz.ru/");
            mp = MediaPlayer.create(this, R.raw.voice);
            mp.start();

            open.setVisibility(View.VISIBLE);
            open.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent;
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gdz.ru/"));
                    startActivity(intent);
                }
            });


        }

        if (message.equals("Как дела?")) {
            tv.setText("Отлично! Как у тебя?");
            mp = MediaPlayer.create(this, R.raw.hwe);
            mp.start();
        }

        if (message.equals("Хорошо")) {
            tv.setText("Это хорошо");
            mp = MediaPlayer.create(this, R.raw.good);
            mp.start();
        }

        if (message.equals("Музыка")) {
            tv.setText("...");
            mp = MediaPlayer.create(this, R.raw.music);
            mp.start();

            stop.setVisibility(View.VISIBLE);
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.stop();
                }
            });

        }


        if (message.equals("Меню")) {
            tv.setText("1 - Домашние задания 2 - Помощь 3 - Новые команды");

            mp = MediaPlayer.create(this, R.raw.menu);
            mp.start();
        }

        if (message.equals("2")) {
            tv.setText("Выбери предмет");

            mp = MediaPlayer.create(this, R.raw.tyy);
            mp.start();


        }

        if (message.equals("Математика")) {
            tv.setText("Квадрат гипотенузы равен сумме квадратов катетов");
            iv.setImageResource(R.drawable.teorem);

            mp = MediaPlayer.create(this, R.raw.tr);
            mp.start();
        }

        if (message.equals("Физика")) {
            tv.setText("Атом - наименьшая неделимая частица во Вселенной");
            iv.setImageResource(R.drawable.atom);

            mp = MediaPlayer.create(this, R.raw.at);
            mp.start();


        }

        if (message.equals("Игра")) {
            tv.setText("Камень ножницы или бумага?");
            mp = MediaPlayer.create(this, R.raw.game1);
            mp.start();

        }


        if (message.equals("Камень")) {
            tv.setText("Бумага");
            mp = MediaPlayer.create(this, R.raw.paper);
            mp.start();
        }

        if (message.equals("Бумага")) {
            tv.setText("Камень");
            mp = MediaPlayer.create(this, R.raw.kc);
            mp.start();


        }

        if(message.equals("Ножницы")){
            tv.setText("Камень");
            mp = MediaPlayer.create(this, R.raw.kc);
            mp.start();
        }

        if(message.equals("Погода")){
            tv.setText("Мне бы тоже хотелось это знать))");
            mp = MediaPlayer.create(this, R.raw.weather);
            mp.start();
        }


        if(message.equals("Мессенджер")){
            Intent intent;
            intent = new Intent(this, chat.class);
            startActivity(intent);
        }

        if(message.equals("Задачи")){
            Intent intent = new Intent(this, aitask.class);
            startActivity(intent);
        }

        if(message.equals("Достижения")){
            Intent intent;
            intent = new Intent(this, Progress.class);
            startActivity(intent);
        }

        if(message.equals("Стикер")){
            tv.setText("Держи)");

            mp = MediaPlayer.create(this, R.raw.stick);
            mp.start();

            iv.setImageResource(R.drawable.hello);

        }

        if(message.equals("3")){
            tv.setText("Стикер - получи крутой стикер");

            mp = MediaPlayer.create(this, R.raw.st);
            mp.start();
        }
    }

    private void revert() {

        Intent intent = new Intent(this, input.class);
        startActivity(intent);
    }
}