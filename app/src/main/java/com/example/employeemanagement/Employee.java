package com.example.employeemanagement;

public class Employee {


    private String fname;
    private String lname;
    private String img;

    public Employee() {

    }

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Employee(String fname, String lname, String img) {
        this.fname = fname;
        this.lname = lname;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
