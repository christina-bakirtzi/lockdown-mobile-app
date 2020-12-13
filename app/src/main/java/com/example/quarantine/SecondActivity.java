package com.example.quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.Manifest.permission_group.SMS;

public class SecondActivity extends AppCompatActivity {
    static String name;
    static String surname;
    static String route;
    static String number;
    static String region;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent caller = getIntent();


        name = caller.getStringExtra("name");
        surname = caller.getStringExtra("surname");
        route = caller.getStringExtra("route");
        number = caller.getStringExtra("number");
        region = caller.getStringExtra("region");
        SharedPreferences.Editor editor = getSharedPreferences("TAGS", MODE_PRIVATE).edit();
        editor.putString("name", name);
        editor.commit();
    }

    public void sendMessage1(View v) {
        String message = "1";
        SMS(message);
    }

    public void sendMessage2(View v) {
        String message = "2";
        SMS(message);
    }

    public void sendMessage3(View v) {
        String message = "3";
        SMS(message);
    }

    public void sendMessage4(View v) {
        String message = "4";
        SMS(message);
    }

    public void sendMessage5(View v) {
        String message = "5";
        SMS(message);
    }

    public void sendMessage6(View v) {
        String message = "6";
        SMS(message);
    }

    public void SMS(String message) {
        Uri destination = Uri.parse("smsto:13033");
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, destination);
        smsIntent.putExtra("sms_body", message + " " + name + " " + surname + " " + route + " " + number + " " + region);
        startActivity(smsIntent);
        finish();
    }


}