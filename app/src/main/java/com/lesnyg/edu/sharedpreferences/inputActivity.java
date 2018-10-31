package com.lesnyg.edu.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editText = findViewById(R.id.editText);
        EditText editTextpw = findViewById(R.id.editTextpw);
        EditText editTextemail = findViewById(R.id.editTextemail);

        SharedPreferences.Editor editor = getSharedPreferences("AWEPrefs",Context.MODE_PRIVATE).edit();
        editor.putString("name",editText.getText().toString());
        editor.putString("password",editTextpw.getText().toString());
        editor.putString("email",editTextemail.getText().toString());
        editor.commit();
    }


}
