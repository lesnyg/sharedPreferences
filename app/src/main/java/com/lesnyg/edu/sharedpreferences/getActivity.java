package com.lesnyg.edu.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class getActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        SharedPreferences sharedPreferences = getSharedPreferences("AWEPrefs",Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name",null);
        String password = sharedPreferences.getString("password",null);
        String email = sharedPreferences.getString("email",null);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(name+" , "+password+" , "+email);
    }
}
