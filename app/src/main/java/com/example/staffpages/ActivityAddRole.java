package com.example.staffpages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityAddRole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_role);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
