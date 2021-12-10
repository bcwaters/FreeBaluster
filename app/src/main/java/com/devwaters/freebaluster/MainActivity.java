package com.devwaters.freebaluster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.freebaluster.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterFlatRun(View view) {
        Intent intent = new Intent(this, FlatRunBaluster.class);
        startActivity(intent);
    }

    public void enterAngledRun(View view) {
        Intent intent = new Intent(this, AngledRunBaluster.class);
        startActivity(intent);
    }

    public void enterAttachedBaluster(View view) {
        Intent intent = new Intent(this, AttachedBaluster.class);
        startActivity(intent);
    }

    public void enterAngledAttachedBaluster(View view) {
        Intent intent = new Intent(this, AngledAttachedBaluster.class);
        startActivity(intent);
    }

    public void enterTaperedBaluster(View view) {
        Intent intent = new Intent(this, TaperedBaluster.class);
        startActivity(intent);
    }
    public void enterAngledTaperedBaluster(View view) {
        Intent intent = new Intent(this, AngledTaperedBaluster.class);
        startActivity(intent);
    }


}