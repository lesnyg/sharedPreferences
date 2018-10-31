package com.lesnyg.edu.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttoninput = findViewById(R.id.buttoninput);
        buttoninput.setOnClickListener(this);
        Button buttonoutput = findViewById(R.id.buttonoutput);
        buttonoutput.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttoninput:
                Intent intent = new Intent(this, inputActivity.class);
                startActivityForResult(intent,1000);
                break;
            case R.id.buttonoutput:
                Intent intent1 = new Intent(this, getActivity.class);
                startActivityForResult(intent1,1000);
                break;
        }
    }
}
