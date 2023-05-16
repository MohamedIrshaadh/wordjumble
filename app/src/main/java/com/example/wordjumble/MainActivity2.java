package com.example.wordjumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.*;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.app.Dialog;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
public class MainActivity2 extends AppCompatActivity {
    static String J="0";
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
    static int count = 0;
    static String Score="300";
    static int life = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        J=String.valueOf(convert(J)+1);
        Dialog dialog;
        Intent in =new Intent(MainActivity2.this, MainActivity.class);
        in.putExtra("sc",Score);
        Dialog dialog1;
        TextView answerBox = findViewById(R.id.answerBox);
        ImageView heart1 = findViewById(R.id.heart1);
        ImageView heart2 = findViewById(R.id.heart2);
        ImageView heart3 =findViewById(R.id.heart3);
        Button Resetbutt = findViewById(R.id.button);
        Button checkbutt =(Button) findViewById(R.id.button2);
        Button but1 = findViewById(R.id.but1);
        Button but2 = findViewById(R.id.but2);
        Button but3 = findViewById(R.id.but3);
        Button but4 = findViewById(R.id.but4);
        Button but5 = findViewById(R.id.but5);
        Button but6 = findViewById(R.id.but6);
        Button but7 = findViewById(R.id.but7);
        Button but8 = findViewById(R.id.but8);
        Button but9 = findViewById(R.id.but9);
        Button but10 = findViewById(R.id.but10);
        Button but11 = findViewById(R.id.but11);
        Button but12 = findViewById(R.id.but12);
        Button but13 = findViewById(R.id.but13);
        Button but14 = findViewById(R.id.but14);
        Button but15 = findViewById(R.id.but15);
        Button but16 = findViewById(R.id.but16);
        String qword = getIntent().getStringExtra("qword").toUpperCase();
        String hword = getIntent().getStringExtra("hint");
        ArrayList<Character> chars = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < qword.length(); i++) {
            chars.add(qword.charAt(i));
        }
        for (int i = qword.length(); i < 16; i++) {
            int num = r.nextInt(26);
            chars.add((char)((int) num + (int) (65)));
        }
        Collections.shuffle(chars);
        StringBuilder initial = new StringBuilder();
        for (int m = 0; m < qword.length(); m++) {
            initial.append(" ___", 0, 3);
        }
        answerBox.setText(initial);
        checkbutt.setEnabled(false);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but1.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but1.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but1.startAnimation(animation);
                if(answer.length()==qword.length()){
                   checkbutt.setEnabled(true);
                   but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but2.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but2.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but2.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but3.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but3.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but3.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but4.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but4.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but4.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but5.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but5.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but5.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but6.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but6.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but6.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but7.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but7.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but7.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but8.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but8.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but8.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but9.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but9.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but9.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but10.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but10.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but10.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but11.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but11.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but11.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but12.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but12.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but12.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but13.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but13.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but13.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but14.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but14.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but14.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but15.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but15.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but15.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initial.replace((count), (count + 3), " " + but16.getText().toString());
                answerBox.setText(initial);
                count = count + 2;
                but16.setBackground(getDrawable(R.drawable.custon_button));
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttonanimation);
                but16.startAnimation(animation);
                if(answer.length()==qword.length()){
                    checkbutt.setEnabled(true);
                    but1.setEnabled(false);
                    but2.setEnabled(false);
                    but3.setEnabled(false);
                    but4.setEnabled(false);
                    but5.setEnabled(false);
                    but6.setEnabled(false);
                    but7.setEnabled(false);
                    but8.setEnabled(false);
                    but9.setEnabled(false);
                    but10.setEnabled(false);
                    but11.setEnabled(false);
                    but12.setEnabled(false);
                    but13.setEnabled(false);
                    but14.setEnabled(false);
                    but15.setEnabled(false);
                    but16.setEnabled(false);
                }
            }
        });
        Resetbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score= String.valueOf(convert(Score)-35);
                initial.delete(0, answerBox.getText().toString().length());
                for (int m = 0; m < qword.length(); m++) {
                    initial.append(" ___", 0, 3);
                }
                answerBox.setText(initial);
                count = 0;
                but1.setBackground(getDrawable(R.drawable.normalbutt));
                but2.setBackground(getDrawable(R.drawable.normalbutt));
                but3.setBackground(getDrawable(R.drawable.normalbutt));
                but4.setBackground(getDrawable(R.drawable.normalbutt));
                but5.setBackground(getDrawable(R.drawable.normalbutt));
                but6.setBackground(getDrawable(R.drawable.normalbutt));
                but7.setBackground(getDrawable(R.drawable.normalbutt));
                but8.setBackground(getDrawable(R.drawable.normalbutt));
                but9.setBackground(getDrawable(R.drawable.normalbutt));
                but10.setBackground(getDrawable(R.drawable.normalbutt));
                but11.setBackground(getDrawable(R.drawable.normalbutt));
                but12.setBackground(getDrawable(R.drawable.normalbutt));
                but13.setBackground(getDrawable(R.drawable.normalbutt));
                but14.setBackground(getDrawable(R.drawable.normalbutt));
                but15.setBackground(getDrawable(R.drawable.normalbutt));
                but16.setBackground(getDrawable(R.drawable.normalbutt));
                checkbutt.setEnabled(false);
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
                but4.setEnabled(true);
                but5.setEnabled(true);
                but6.setEnabled(true);
                but7.setEnabled(true);
                but8.setEnabled(true);
                but9.setEnabled(true);
                but10.setEnabled(true);
                but11.setEnabled(true);
                but12.setEnabled(true);
                but13.setEnabled(true);
                but14.setEnabled(true);
                but15.setEnabled(true);
                but16.setEnabled(true);
            }
        });
        //for fist dialog
        dialog = new Dialog(MainActivity2.this);
        dialog.setContentView(R.layout.activity_dialogbox1);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.backfordialog));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button infobutt = findViewById(R.id.ibutt);
        Button okay_butt = dialog.findViewById(R.id.btn_okay);
        TextView CLUE = dialog.findViewById(R.id.cluetext);
        CLUE.setText(hword);
        okay_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(MainActivity2.this, "Hope You Got The Qlue!!!", Toast.LENGTH_SHORT).show();
            }
        });
        infobutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
                infobutt.setBackground(getDrawable(R.drawable.custon_button));
            }
        });
        //for sec dialo
        dialog1 = new Dialog(MainActivity2.this);
        dialog1.setContentView(R.layout.activity_dialogbox2);
        dialog1.getWindow().setBackgroundDrawable(getDrawable(R.drawable.backfordialog));
        dialog1.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog1.setCancelable(false);
        dialog1.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button home = dialog1.findViewById(R.id.homebutt);
        TextView score =dialog1.findViewById(R.id.score);
        Button Playagainbutton =dialog1.findViewById(R.id.Playagain);
        //checkbutton
        checkbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                String answer = answerBox.getText().toString().replaceAll("\\s", "");
                if (qword.equals(answer)) {
                    if(life==3){
                        score.setText("Your score :"+Score);
                    } else if (life==2) {
                        Score= String.valueOf(convert(Score)-100);
                        score.setText("Your score :"+Score);
                    } else if (life==1) {
                        Score= String.valueOf(convert(Score)-100);
                        score.setText("Your score :"+Score);
                    }
                    dialog1.show();
                } else {
                    life=life-1;
                    if(life==2){
                        heart1.setVisibility(View.GONE);
                    } else if (life==1) {
                        heart2.setVisibility(View.GONE);
                    }else if(life==0){
                        heart3.setVisibility(View.GONE);
                        score.setText("Sorry you lost");
                        dialog1.show();
                    }
                    Toast.makeText(MainActivity2.this, "You made incorrect word", Toast.LENGTH_SHORT).show();
                    initial.delete(0, answerBox.getText().toString().length());
                    for (int m = 0; m < qword.length(); m++) {
                        initial.append(" ___", 0, 3);
                    }
                    answerBox.setText(initial);
                    Collections.shuffle(chars);
                    but1.setText(String.valueOf(chars.get(0)));
                    but2.setText(String.valueOf(chars.get(1)));
                    but3.setText(String.valueOf(chars.get(2)));
                    but4.setText(String.valueOf(chars.get(3)));
                    but5.setText(String.valueOf(chars.get(4)));
                    but6.setText(String.valueOf(chars.get(5)));
                    but7.setText(String.valueOf(chars.get(6)));
                    but8.setText(String.valueOf(chars.get(7)));
                    but9.setText(String.valueOf(chars.get(8)));
                    but10.setText(String.valueOf(chars.get(9)));
                    but11.setText(String.valueOf(chars.get(10)));
                    but12.setText(String.valueOf(chars.get(11)));
                    but13.setText(String.valueOf(chars.get(12)));
                    but14.setText(String.valueOf(chars.get(13)));
                    but15.setText(String.valueOf(chars.get(14)));
                    but16.setText(String.valueOf(chars.get(15)));
                    but1.setBackground(getDrawable(R.drawable.normalbutt));
                    but2.setBackground(getDrawable(R.drawable.normalbutt));
                    but3.setBackground(getDrawable(R.drawable.normalbutt));
                    but4.setBackground(getDrawable(R.drawable.normalbutt));
                    but5.setBackground(getDrawable(R.drawable.normalbutt));
                    but6.setBackground(getDrawable(R.drawable.normalbutt));
                    but7.setBackground(getDrawable(R.drawable.normalbutt));
                    but8.setBackground(getDrawable(R.drawable.normalbutt));
                    but9.setBackground(getDrawable(R.drawable.normalbutt));
                    but10.setBackground(getDrawable(R.drawable.normalbutt));
                    but11.setBackground(getDrawable(R.drawable.normalbutt));
                    but12.setBackground(getDrawable(R.drawable.normalbutt));
                    but13.setBackground(getDrawable(R.drawable.normalbutt));
                    but14.setBackground(getDrawable(R.drawable.normalbutt));
                    but15.setBackground(getDrawable(R.drawable.normalbutt));
                    but16.setBackground(getDrawable(R.drawable.normalbutt));
                    checkbutt.setEnabled(false);
                    but1.setEnabled(true);
                    but2.setEnabled(true);
                    but3.setEnabled(true);
                    but4.setEnabled(true);
                    but5.setEnabled(true);
                    but6.setEnabled(true);
                    but7.setEnabled(true);
                    but8.setEnabled(true);
                    but9.setEnabled(true);
                    but10.setEnabled(true);
                    but11.setEnabled(true);
                    but12.setEnabled(true);
                    but13.setEnabled(true);
                    but14.setEnabled(true);
                    but15.setEnabled(true);
                    but16.setEnabled(true);

                }
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home =new Intent(MainActivity2.this,MainActivity.class);
                home.putExtra("sc",Score);
                home.putExtra("num",J);
                startActivity(home);
                life=3;
                Score="300";
            }
        });
        Playagainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playagain =new Intent(MainActivity2.this,MainActivity.class);
                playagain.putExtra("sc",Score);
                playagain.putExtra("num",J);
                startActivity(playagain);
                life=3;
                Score="300";
            }
        });
        but1.setText(String.valueOf(chars.get(0)));
        but2.setText(String.valueOf(chars.get(1)));
        but3.setText(String.valueOf(chars.get(2)));
        but4.setText(String.valueOf(chars.get(3)));
        but5.setText(String.valueOf(chars.get(4)));
        but6.setText(String.valueOf(chars.get(5)));
        but7.setText(String.valueOf(chars.get(6)));
        but8.setText(String.valueOf(chars.get(7)));
        but9.setText(String.valueOf(chars.get(8)));
        but10.setText(String.valueOf(chars.get(9)));
        but11.setText(String.valueOf(chars.get(10)));
        but12.setText(String.valueOf(chars.get(11)));
        but13.setText(String.valueOf(chars.get(12)));
        but14.setText(String.valueOf(chars.get(13)));
        but15.setText(String.valueOf(chars.get(14)));
        but16.setText(String.valueOf(chars.get(15)));
    }
}