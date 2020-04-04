package com.example.staffpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAddRoleEmpty extends AppCompatActivity {

    Button addRoleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_role_empty);

        addRoleButton = findViewById(R.id.addRoleButton);
        addRoleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAddRoleEmpty.this, ActivityAddRole.class);
                startActivity(intent);
            }
        });
    }
}
