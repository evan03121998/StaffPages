package com.example.staffpages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ActivityViewStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_staff);
        initStaffRecyclerView();
    }

    private void initStaffRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.viewStaffRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StaffAdapter(this, createDummyPaymentList()));
    }

    private List<Staffs> createDummyPaymentList(){
        List<Staffs> staffs = new ArrayList<>();
        StaffsObject staff1 = new StaffsObject("Caesar", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff1);
        StaffsObject staff2 = new StaffsObject("Acil", "Kasir", "Alam Sutera", "01-12-20", "Offline");
        staffs.add(staff2);
        StaffsUnassignedObject staffsUnassignedObject1 = new StaffsUnassignedObject("WEWEW", "Belum di assign");
        staffs.add(staffsUnassignedObject1);
        StaffsObject staff3 = new StaffsObject("Tay", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff3);
        StaffsObject staff4 = new StaffsObject("ASD", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff4);
        StaffsObject staff5 = new StaffsObject("WEW", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff5);
        StaffsObject staff6 = new StaffsObject("WWWWQ", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff6);
        StaffsObject staff7 = new StaffsObject("OMOMO", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff7);
        StaffsObject staff8 = new StaffsObject("FFFGG", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff8);
        StaffsObject staff9 = new StaffsObject("$$EER", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff9);
        StaffsObject staff10 = new StaffsObject("QWEWQEWQ", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff10);
        StaffsObject staff11 = new StaffsObject("ERERE", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff11);
        StaffsObject staff12 = new StaffsObject("TTTTT", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff12);
        StaffsObject staff13 = new StaffsObject("MMSDMKDSM", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff13);
        StaffsObject staff14 = new StaffsObject("qweqewerrt", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff14);
        StaffsObject staff15 = new StaffsObject("GJJGGJG", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff15);
        StaffsObject staff16 = new StaffsObject("GHHHHKM", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff16);
        StaffsObject staff17 = new StaffsObject("LSDLSMD", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff17);
        StaffsObject staff18 = new StaffsObject("DNJFNDFJ", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff18);
        StaffsObject staff19 = new StaffsObject("qweTRIJTORJqewerrt", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff19);
        StaffsObject staff20 = new StaffsObject("LFLLF", "Kasir", "Alam Sutera", "01-12-20", "Online");
        staffs.add(staff20);
        return staffs;
    }
}
