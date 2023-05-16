package com.example.wordjumble;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    static int maximum;
    public static int convert(String str) {
        int val = 0;
        System.out.println("String = " + str);

        // Convert the String
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            // This is thrown when the String
            // contains characters other than digits
            System.out.println("Invalid String");
        }
        return val;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scoreshow =findViewById(R.id.button3);
        ArrayList<String> Scorelist= new ArrayList(100);
        String score =getIntent().getStringExtra("sc");
        String J =getIntent().getStringExtra("num");
        Scorelist.add(score);
        maximum = convert(Scorelist.get(0));
        for (int i = 0; i < Scorelist.size(); i++) {
            if (maximum < convert(Scorelist.get(i))) {
                maximum = convert(Scorelist.get(i));
            }
        }
        scoreshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String j =getIntent().getStringExtra("num");
                scoreshow.setText("your last Score:" + maximum);
            }
        });
        Button button;
        button = findViewById(R.id.button1);//start button
        EditText text = (EditText)findViewById(R.id.edittext1);
        EditText hint =(EditText)findViewById(R.id.editTextText3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(text.length()<=16){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Intent i = new Intent(MainActivity.this, Dialogbox1.class);
                i.putExtra("hword",hint.getText().toString());
                intent.putExtra("qword",text.getText().toString());
                intent.putExtra("hint",hint.getText().toString());
                startActivity(intent);
            }else{
                    Toast.makeText(MainActivity.this, "please enter a word of shorter length", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}