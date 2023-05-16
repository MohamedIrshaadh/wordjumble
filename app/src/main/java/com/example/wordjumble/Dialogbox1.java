package com.example.wordjumble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dialogbox1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogbox1);
        String hword = getIntent().getStringExtra("hword");
        TextView clue = findViewById(R.id.cluetext);
        clue.setText(hword);
    }
}