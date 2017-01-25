package com.hackingbuzz.buttonusinginnerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        // why we take inner clases coz if we creating feature of something ..so its gonna be attact to that thing..so do not create another class for it we create inner coz that tells these two things are attached in some way..

        buton.setOnClickListener(new View.OnClickListener() {  //annon
            @Override
            public void onClick(View v) {
                textView.setText("Button just Clicked");
            }
        });
    }
}
