package com.madeeasy.using.list.arraylist.model;

public class Address {
    private String villageName;
    private String pinCode;

    public Address() {
    }

    public Address(String villageName, String pinCode) {
        this.villageName = villageName;
        this.pinCode = pinCode;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "villageName='" + villageName + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
