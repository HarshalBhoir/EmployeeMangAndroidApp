package com.example.employeemanagement;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ApiActivity extends AppCompatActivity {
    RelativeLayout Facebook,Gmail;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_api);

        Facebook = (RelativeLayout) findViewById(R.id.Facebook);
        Gmail = (RelativeLayout) findViewById(R.id.Gmail);

        Facebook.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ApiActivity.this, facebook.class);
                startActivity(i);
            }
        } );

        Gmail.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ApiActivity.this, gmail.class);
                startActivity(i);
            }
        } );

    }
}
