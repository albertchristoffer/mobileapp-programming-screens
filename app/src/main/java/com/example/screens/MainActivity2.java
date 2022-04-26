package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String title;
    String lorem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView header = findViewById(R.id.title);
        TextView lorem_ipsum = findViewById(R.id.lorem_ipsum);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            title = extras.getString("title");
            lorem = extras.getString("lorem_ipsum");
        }

        header.setText(title);
        lorem_ipsum.setText(lorem);
    }
}