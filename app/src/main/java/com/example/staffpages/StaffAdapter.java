package com.example.staffpages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StaffAdapter extends RecyclerView.Adapter{

    private Context context;
    private List<Staffs> staffs;

    private static final int STAFF_ITEM = 0;
    private static final int STAFF_UNASSIGNED_ITEM = 1;

    public StaffAdapter(Context context, List<Staffs> staffs) {
        this.context = context;
        this.staffs = staffs;
    }

    @Override
    public int getItemViewType(int position) {
        Staffs staff = staffs.get(position);
        if (staff instanceof StaffsObject){
            return STAFF_ITEM;
        }else if (staff instanceof StaffsUnassignedObject){
            return STAFF_UNASSIGNED_ITEM;
        }else {
            return super.getItemViewType(position);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == STAFF_ITEM){
            view = layoutInflater.inflate(R.layout.holder_activity_view_staff, parent, false);
            return new StaffViewHolder(view);
        }else if (viewType == STAFF_UNASSIGNED_ITEM){
            view = layoutInflater.inflate(R.layout.holder_activity_view_staff_unassigned, parent, false);
            return new StaffUnassignedViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Staffs staff = staffs.get(position);
        if (holder instanceof StaffViewHolder){
            StaffViewHolder staffViewHolder = (StaffViewHolder) holder;
            StaffsObject staffsObject = (StaffsObject) staff;
            staffViewHolder.staffName.setText(staffsObject.getStaffName());
            staffViewHolder.roleName.setText(staffsObject.getRoleName());
            staffViewHolder.placeName.setText(staffsObject.getPlaceName());
            staffViewHolder.contractDate.setText(staffsObject.getContractDate());
            staffViewHolder.staffStatus.setText(staffsObject.getStaffStatus());
            if (staffsObject.getStaffStatus().equals("Online")){
                staffViewHolder.staffStatus.setBackgroundColor(Color.parseColor("#88D75E"));
            }else if (staffsObject.getStaffStatus().equals("Offline")){
                staffViewHolder.staffStatus.setBackgroundColor(Color.parseColor("#ED6253"));
            }
            staffViewHolder.staffCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ActivityEditStaff.class);
                    //pass data
                    intent.putExtra("staffInfoType", 0);
                    intent.putExtra("staffNamePassed", staffsObject.getStaffName());
                    intent.putExtra("staffRolePassed", staffsObject.getRoleName());
                    intent.putExtra("staffPlacePassed", staffsObject.getPlaceName());
                    intent.putExtra("staffContractPassed", staffsObject.getContractDate());

                    context.startActivity(intent);
                }
            });
        }else if (holder instanceof StaffUnassignedViewHolder){
            StaffUnassignedViewHolder staffUnassignedViewHolder = (StaffUnassignedViewHolder) holder;
            StaffsUnassignedObject staffsUnassignedObject = (StaffsUnassignedObject) staff;
            staffUnassignedViewHolder.staffName.setText(staffsUnassignedObject.getStaffUnassignedName());
            staffUnassignedViewHolder.statusUnassigned.setText(staffsUnassignedObject.getUnassignedStatus());
            staffUnassignedViewHolder.staffUnassignedCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ActivityEditStaff.class);
                    //pass data
                    intent.putExtra("staffInfoType", 1);
                    intent.putExtra("staffUnassignedNamePassed", staffsUnassignedObject.getStaffUnassignedName());
                    intent.putExtra("statusUnassignedPassed", staffsUnassignedObject.getUnassignedStatus());

                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return staffs.size();
    }


    class StaffViewHolder extends RecyclerView.ViewHolder{

        TextView staffName;
        TextView roleName;
        TextView placeName;
        TextView contractDate;
        TextView staffStatus;
        CardView staffCardView;

        public StaffViewHolder(@NonNull View itemView) {
            super(itemView);
            staffName = itemView.findViewById(R.id.staffName);
            roleName = itemView.findViewById(R.id.roleName);
            placeName = itemView.findViewById(R.id.placeName);
            contractDate = itemView.findViewById(R.id.contractDate);
            staffStatus = itemView.findViewById(R.id.staffStatus);
            staffCardView = itemView.findViewById(R.id.staffCardView);
        }
    }

    class StaffUnassignedViewHolder extends RecyclerView.ViewHolder{

        TextView staffName;
        TextView statusUnassigned;
        CardView staffUnassignedCardView;
        public StaffUnassignedViewHolder(@NonNull View itemView) {
            super(itemView);
            staffName = itemView.findViewById(R.id.staffNameUnassigned);
            statusUnassigned = itemView.findViewById(R.id.statusUnassigned);
            staffUnassignedCardView = itemView.findViewById(R.id.staffUnassignedCardView);
        }
    }
}
