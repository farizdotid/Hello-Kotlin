package com.farizdotid.nyeselpakekotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainJavaActivity extends AppCompatActivity {

    Button btnClickMe;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        
        btnClickMe = (Button) findViewById(R.id.btnClickMe);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainJavaActivity.this, "Hello Kotlin!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
