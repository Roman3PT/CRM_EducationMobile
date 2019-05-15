package com.example.myapplication.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contact extends AbstractCRMEducation implements Serializable {

    @SerializedName(value = "id")
    private Long id;

    @SerializedName(value = "company")
    private Company company;

    @SerializedName(value = "phoneNumber")
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
