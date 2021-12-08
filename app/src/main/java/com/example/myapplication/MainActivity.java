package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // Do something in response to button
    }

    /** Called when the user taps the Send button */
    public void enterLandscaping(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, LandscapingMenu.class);
        startActivity(intent);
    }

    public void enterPainting(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, PaintingMenu.class);
        startActivity(intent);
    }

    public void enterConcrete(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, ConcreteMenu.class);
        startActivity(intent);
    }

    public void enterCarpentry(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, Baluster.class);
        startActivity(intent);
    }

    public void enterPlumbing(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, PlumbingActivity.class);
        startActivity(intent);
    }

    public void updateText(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
    }

}