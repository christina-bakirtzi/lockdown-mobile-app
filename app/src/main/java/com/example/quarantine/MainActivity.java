package com.example.quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    String surname;
    String route;
    String number;
    String region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("TAGS", Context.MODE_PRIVATE);
        name = preferences.getString("name", "");
        surname = preferences.getString("surname", "");
        route = preferences.getString("route", "");
        number = preferences.getString("number", "");
        region = preferences.getString("region", "");
        Log.i("THIS", surname);
        EditText name_text = (EditText) findViewById(R.id.name_text);
        name_text.setText(name);
        EditText surname_text = (EditText) findViewById(R.id.surname_text);
        surname_text.setText(surname);
        EditText route_text = (EditText) findViewById(R.id.route_text);
        route_text.setText(route);
        EditText number_text = (EditText) findViewById(R.id.number_text);
        number_text.setText(number);
        EditText region_text = (EditText) findViewById(R.id.region_text);
        region_text.setText(region);

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences("TAGS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("name", name);
        editor.putString("surname", surname);
        editor.putString("route", route);
        editor.putString("number", number);
        editor.putString("region", region);

        editor.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences preferences = getSharedPreferences("TAGS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("name", name);
        editor.putString("surname", surname);
        editor.putString("route", route);
        editor.putString("number", number);
        editor.putString("region", region);

        editor.commit();
    }

    //    SharedPreferences preferences = getSharedPreferences("TAGS", Context.MODE_PRIVATE);
//    final SharedPreferences.Editor editor = preferences.edit();
    public void getdata(View v) {
        EditText name_text = (EditText) findViewById(R.id.name_text);
        name = name_text.getText().toString();
        if (name.matches("")) {
            Toast.makeText(this, R.string.namemissing, Toast.LENGTH_SHORT).show();
            return;
        }
        EditText surname_text = (EditText) findViewById(R.id.surname_text);
        surname = surname_text.getText().toString();
        if (surname.matches("")) {
            Toast.makeText(this, R.string.surnamemissing, Toast.LENGTH_SHORT).show();
            return;
        }
        EditText route_text = (EditText) findViewById(R.id.route_text);
        route = route_text.getText().toString();
        if (route.matches("")) {
            Toast.makeText(this, R.string.routemissing, Toast.LENGTH_SHORT).show();
            return;
        }
        EditText number_text = (EditText) findViewById(R.id.number_text);
        number = number_text.getText().toString();
        if (number.matches("")) {
            Toast.makeText(this, R.string.numbermissing, Toast.LENGTH_SHORT).show();
            return;
        }
        EditText region_text = (EditText) findViewById(R.id.region_text);
        region = region_text.getText().toString();
        if (region.matches("")) {
            Toast.makeText(this, R.string.regionmissing, Toast.LENGTH_SHORT).show();
            return;
        }


        Intent goToNext = new Intent();
        goToNext.setClass(this, SecondActivity.class);
        goToNext.putExtra("name", name);
        goToNext.putExtra("surname", surname);
        goToNext.putExtra("route", route);
        goToNext.putExtra("number", number);
        goToNext.putExtra("region", region);
        startActivity(goToNext);
        finish();
//        editor.putString("name", name);
//        name_text.setText(name);
//        editor.commit();
    }
}