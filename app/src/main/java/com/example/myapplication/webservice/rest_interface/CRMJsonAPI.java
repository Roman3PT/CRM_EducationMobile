package com.example.myapplication.webservice.rest_interface;

import com.example.myapplication.entity.Event;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CRMJsonAPI {

    @GET("/getEvents")
    Call<List<Event>> getStringJson(@Query("login") String login, @Query("password") String password);
}
