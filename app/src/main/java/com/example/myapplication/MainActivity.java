package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.entity.Event;
import com.example.myapplication.webservice.NetworkService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;
    private List<Event> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        events = new ArrayList<>();
    }

    public void getListEventOnCompany(View view) {
        NetworkService.getInstance()
                .getJsonAPI()
                .getStringJson(login.getText().toString(), password.getText().toString())
                .enqueue(new Callback<List<Event>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<Event>> call, @NonNull Response<List<Event>> response) {
                        events = response.body();
                    }

                    @Override
                    public void onFailure(@NonNull Call<List<Event>> call, @NonNull Throwable t) {
                        System.out.println(t.getMessage());
                    }
                });

        Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
        intent.putExtra("event", (Serializable) events);
        startActivity(intent);
    }
}