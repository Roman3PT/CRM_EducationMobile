package com.example.myapplication.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AbstractCRMEducation implements Serializable {

    @SerializedName(value = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
