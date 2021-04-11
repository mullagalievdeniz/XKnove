package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home extends AppCompatActivity {
    Button btn;
    ImageButton forumButton;
    ImageButton assistantButton;
    ImageButton taskButton;
    ImageButton homenagationbutton;
    ImageButton morebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn = (Button) findViewById(R.id.button);
        forumButton = (ImageButton) findViewById(R.id.forumButton);
        forumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForumActivity();

            }
        });

                taskButton = (ImageButton) findViewById(R.id.tasksButton5);
        taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTaskactivity();
            }
        });


        assistantButton = (ImageButton) findViewById(R.id.assistantButton);
        assistantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAssistantactivity();
            }

        });

        homenagationbutton = (ImageButton) findViewById(R.id.homenavigationButton);
        homenagationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        morebutton = (ImageButton) findViewById(R.id.morenavigationbutton);
        morebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmoreactivity();
            }
        });


    }

    private void openmoreactivity() {
        Intent intent = new Intent(this, more.class);
        startActivity(intent);
    }

    private void openHomeActivity() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Вы уже на этом экране", Toast.LENGTH_SHORT);
        toast.show();


    }

    private void openForumActivity() {
        Intent intent = new Intent(this, forum.class);
        startActivity(intent);
    }

    private void openTaskactivity() {
        Intent intent = new Intent(this, aitask.class);
        startActivity(intent);
    }




    private void openAssistantactivity() {
        Intent intent = new Intent(this,assistant.class);
        startActivity(intent);
    }


}


