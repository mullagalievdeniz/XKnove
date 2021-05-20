package com.example.xknove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class notes extends AppCompatActivity   {

    Button savebtn, loadbtn;
    EditText noteinput;
    SharedPreferences sharedPreferences;
    final String SAVED_TEXT = "TEXT";
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        noteinput = (EditText) findViewById(R.id.editnote);
        loadbtn = (Button) findViewById(R.id.loadbtn);

        loadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                load();
            }
        });
        savebtn = (Button) findViewById(R.id.savebtn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }

        void save () {
            sharedPreferences = getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(SAVED_TEXT, noteinput.getText().toString());
            editor.commit();
            Toast.makeText(this, "СОХРАНЕНО", Toast.LENGTH_SHORT).show();


        }

        void load () {
            sharedPreferences = getPreferences(MODE_PRIVATE);
            String savedtext = sharedPreferences.getString(SAVED_TEXT, "");
            noteinput.setText(savedtext);
            Toast.makeText(this, "ЗАГРУЖЕНО", Toast.LENGTH_SHORT).show();

        }














}