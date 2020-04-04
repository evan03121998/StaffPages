package com.example.staffpages;

public class StaffsObject extends Staffs {
    private String staffName;
    private String roleName;
    private String placeName;
    private String contractDate;
    private String staffStatus;

    public StaffsObject(String staffName, String roleName, String placeName, String contractDate, String staffStatus) {
        this.staffName = staffName;
        this.roleName = roleName;
        this.placeName = placeName;
        this.contractDate = contractDate;
        this.staffStatus = staffStatus;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }
}
