package com.example.pr13;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class driveTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive_timer);
    }
    public void stopduh(View view) {
        showInfoAlert();
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
    public void showInfoAlert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(driveTimer.this);
        builder.setMessage("Thank you")
                .setCancelable(false);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}