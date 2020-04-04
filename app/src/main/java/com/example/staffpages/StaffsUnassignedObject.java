package com.example.staffpages;

public class StaffsUnassignedObject extends Staffs {
    private String staffUnassignedName;
    private String unassignedStatus;

    public StaffsUnassignedObject(String staffUnassignedName, String unassignedStatus) {
        this.staffUnassignedName = staffUnassignedName;
        this.unassignedStatus = unassignedStatus;
    }

    public String getStaffUnassignedName() {
        return staffUnassignedName;
    }

    public void setStaffUnassignedName(String staffUnassignedName) {
        this.staffUnassignedName = staffUnassignedName;
    }

    public String getUnassignedStatus() {
        return unassignedStatus;
    }

    public void setUnassignedStatus(String unassignedStatus) {
        this.unassignedStatus = unassignedStatus;
    }
}
