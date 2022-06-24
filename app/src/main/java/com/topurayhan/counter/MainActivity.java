package com.topurayhan.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void resetAndToast(View view) {
        Toast.makeText(getApplicationContext(), "Counter has been reset!", Toast.LENGTH_SHORT).show();
        TextView text = findViewById(R.id.counterText);
        counter = 0;
        text.setText(Integer.toString(counter));
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(15);
    }

    @SuppressLint("SetTextI18n")
    public void incrementCounter(View view) {
        TextView text = findViewById(R.id.counterText);
        counter++;
        if (counter < 100) {
            text.setText(Integer.toString(counter));
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(15);
        } else {
            Toast.makeText(getApplicationContext(), "Maximum reached! Reset to start again.", Toast.LENGTH_SHORT).show();
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(100);
        }
    }
}