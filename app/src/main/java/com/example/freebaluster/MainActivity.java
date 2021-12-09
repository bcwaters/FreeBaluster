package com.example.freebaluster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterFlatRun(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, FlatRunBaluster.class);
        startActivity(intent);
    }

    public void enterAngledRun(View view){
        TextView textView = (TextView) findViewById(R.id.Title);
        Intent intent = new Intent(this, AngledRunBaluster.class);
        startActivity(intent);
    }

}