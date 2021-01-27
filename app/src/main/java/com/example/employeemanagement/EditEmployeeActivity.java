package com.example.employeemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditEmployeeActivity extends AppCompatActivity {
    TextView mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_employee);

        mytext = findViewById(R.id.textView);

        Intent intent = getIntent();
        mytext.setText(mytext.getText().toString()+" "+intent.getStringExtra("eid"));
    }
}