package com.example.tallermecanicoandroid.api;


import com.example.tallermecanicoandroid.model.Mecanico;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface MecanicoService {

    @GET("/mecanicos")
    Call<List<Mecanico>> getAllMecanicos();

    @GET("/mecanico/{id}")
    Call<Mecanico> getMecanico(@Path("id") long id);

    @POST("/mecanico")
    Call<Mecanico> createMecanico(@Body Mecanico mecanico);

    @PUT("/mecanico/{id}")
    Call<Mecanico> putMecanico(@Path("id") long id, @Body Mecanico mecanico);

    @DELETE("/mecanico/{id}")
    Call<Void> deleteMecanico(@Path("id") long id);

}
