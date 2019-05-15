package com.example.myapplication.webservice;

import com.example.myapplication.webservice.rest_interface.CRMJsonAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance;
    private static final String BASE_URL = "http://10.0.2.2:8080/";
    private Retrofit retrofit;

    private NetworkService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null)
            mInstance = new NetworkService();

        return mInstance;
    }

    public CRMJsonAPI getJsonAPI() {
        return retrofit.create(CRMJsonAPI.class);
    }
}
