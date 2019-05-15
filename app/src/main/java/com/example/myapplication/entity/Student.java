package com.example.myapplication.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Student extends AbstractCRMEducation implements Serializable {

    @SerializedName(value = "id")
    private Long id;

    @SerializedName(value = "fullName")
    private String fullName;

    @SerializedName(value = "admissionYear")
    private String admissionYear;

    @SerializedName(value = "specialty")
    private Specialty specialty;

    @SerializedName(value = "phoneNumber")
    private String phoneNumber;

    @SerializedName(value = "ticketNumber")
    private String ticketNumber;

    @SerializedName(value = "existing")
    private boolean existing;

    @SerializedName(value = "rating")
    private Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}