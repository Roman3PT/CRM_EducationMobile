package com.example.myapplication.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Event extends AbstractCRMEducation implements Serializable {

    @SerializedName(value = "id")
    private Long id;

    @SerializedName(value = "company")
    private Company company;

    @SerializedName(value = "type")
    private EventType type;

    @SerializedName(value = "student")
    private Student student;

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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
