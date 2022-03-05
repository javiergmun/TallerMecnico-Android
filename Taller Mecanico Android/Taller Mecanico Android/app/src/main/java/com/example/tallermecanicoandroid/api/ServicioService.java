package com.example.tallermecanicoandroid.api;

import com.example.tallermecanicoandroid.model.Servicio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServicioService {

    @GET("/servicios")
    Call<List<Servicio>> getAllServicios();

    @GET("/servicio/{id}")
    Call<Servicio> getServicio(@Path("id") long id);

    @POST("/servicio")
    Call<Servicio> createServicio(@Body Servicio servicio);

    @PUT("/servicio/{id}")
    Call<Servicio> putServicio(@Path("id") long id, @Body Servicio servicio);

    @DELETE("/servicio/{id}")
    Call<Void> deleteServicio(@Path("id") long id);

}
