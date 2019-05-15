package com.example.myapplication.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Company extends AbstractCRMEducation implements Serializable {

    @SerializedName(value = "id")
    private Long id;

    @SerializedName(value = "name")
    private String name;

    @SerializedName(value = "login")
    private String login;

    @SerializedName(value = "password")
    private String password;

    @SerializedName(value = "address")
    private String address;

    @SerializedName(value = "isBool")
    private boolean isBool;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isBool() {
        return isBool;
    }

    public void setBool(boolean bool) {
        isBool = bool;
    }
}
