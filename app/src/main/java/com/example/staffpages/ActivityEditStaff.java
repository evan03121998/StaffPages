package com.example.staffpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityEditStaff extends AppCompatActivity {

    private TextView staffNameEdit, staffRoleEdit, staffPlaceEdit, staffContractEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_staff);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        staffNameEdit = findViewById(R.id.staffNameEdit);
        staffRoleEdit = findViewById(R.id.staffRoleEdit);
        staffPlaceEdit = findViewById(R.id.staffPlaceEdit);
        staffContractEdit = findViewById(R.id.staffContractEdit);

        //recieve data
        Intent intent = getIntent();
        int staffInfoType = intent.getExtras().getInt("staffInfoType");
        if (staffInfoType == 0) {
            String staffName = intent.getExtras().getString("staffNamePassed");
            String staffRole = intent.getExtras().getString("staffRolePassed");
            String staffPlace = intent.getExtras().getString("staffPlacePassed");
            String staffContract = intent.getExtras().getString("staffContractPassed");

            staffNameEdit.setText(staffName);
            staffRoleEdit.setText(staffRole);
            staffPlaceEdit.setText(staffPlace);
            staffContractEdit.setText(staffContract);
        }else if (staffInfoType == 1){
            String staffUnassignedName = intent.getExtras().getString("staffUnassignedNamePassed");
            String statusUnassigned = intent.getExtras().getString("statusUnassignedPassed");

            staffNameEdit.setText(staffUnassignedName);
            staffRoleEdit.setText(statusUnassigned);
            staffPlaceEdit.setText("Tempat belum di assign ");
            staffContractEdit.setText("Contract belum ada");
        }
    }
}
