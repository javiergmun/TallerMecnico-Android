package com.example.tallermecanicoandroid.api;

import com.example.tallermecanicoandroid.model.Cita;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CitaService {

    @GET("/citas")
    Call<List<Cita>> getAllCitas();

    @GET("/cita/{id}")
    Call<Cita> getCita(@Path("id") long id);

    @POST("/cita")
    Call<Cita> createCita(@Body Cita cita);

    @PUT("/cita/{id}")
    Call<Cita> putCita(@Path("id") long id, @Body Cita cita);

    @DELETE("/cita/{id}")
    Call<Void> deleteCita(@Path("id") long id);

}
