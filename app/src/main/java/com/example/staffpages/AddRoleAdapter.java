package com.example.staffpages;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddRoleAdapter extends RecyclerView.Adapter {

    private Context context;
    List<String> roles;

    public AddRoleAdapter(Context context, List<String> roles) {
        this.context = context;
        this.roles = roles;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolderAddRoleName extends RecyclerView.ViewHolder{

        public ViewHolderAddRoleName(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolderAddRoleAcess extends RecyclerView.ViewHolder{

        CheckBox addRoleAccessCheckbox;
        public ViewHolderAddRoleAcess(@NonNull View itemView) {
            super(itemView);
            addRoleAccessCheckbox = itemView.findViewById(R.id.checkBoxAddRoleAccess);
        }
    }
}
