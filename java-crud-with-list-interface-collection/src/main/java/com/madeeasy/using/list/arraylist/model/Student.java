package com.madeeasy.using.list.arraylist.model;

public class Student {
    private String id;
    private String name;
    private String branch;
    private String phoneNo;
    private Address address;

    public Student() {
    }

    public Student(String id, String name, String branch, String phoneNo) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.phoneNo = phoneNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address=" + address +
                '}';
    }
}
