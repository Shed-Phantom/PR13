package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WaitTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_timer);
    }
    public void STOP(View view) {
        Intent intent = new Intent(this, driveTimer.class);
        startActivity(intent);
    }
}