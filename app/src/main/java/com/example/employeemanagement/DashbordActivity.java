package com.example.employeemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DashbordActivity extends AppCompatActivity {
    String email;
    String password;
    ImageView listemp;
    ImageView map;
    ImageView communication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        // intent Variable
        Intent intent = getIntent();
        email =intent.getStringExtra("email");
        password=intent.getStringExtra("password");


        Toast.makeText(this, "Hello " + intent.getStringExtra("uidname")+" !", Toast.LENGTH_LONG).show();
        listemp= findViewById(R.id.employe);
        listemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(i);
            }
        });
        map= findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapActivity.class);
                startActivity(i);
            }
        });
        communication= findViewById(R.id.communication);
        communication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ApiActivity.class);
                startActivity(i);
            }
        });
    }


}








