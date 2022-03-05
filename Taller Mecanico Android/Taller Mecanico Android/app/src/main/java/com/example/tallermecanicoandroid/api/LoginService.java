package com.example.tallermecanicoandroid.api;


import com.example.tallermecanicoandroid.model.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface LoginService {

    @GET("/logins")
    Call<List<Login>> getAllLogins();

    @GET("/login/{id}")
    Call<Login> getLogin(@Path("id") long id);

    @POST("/login")
    Call<Login> createLogin(@Body Login login);

    @PUT("/login/{id}")
    Call<Login> putLogin(@Path("id") long id, @Body Login login);

    @DELETE("/login/{id}")
    Call<Void> deleteLogin(@Path("id") long id);

}
