package com.example.tallermecanicoandroid.api;


import com.example.tallermecanicoandroid.model.Direccion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface DireccionService {

    @GET("/direcciones")
    Call<List<Direccion>> getAllDireccions();

    @GET("/direccion/{id}")
    Call<Direccion> getDireccion(@Path("id") long id);

    @POST("/direccion")
    Call<Direccion> createDireccion(@Body Direccion direccion);

    @PUT("/direccion/{id}")
    Call<Direccion> putDireccion(@Path("id") long id, @Body Direccion direccion);

    @DELETE("/direccion/{id}")
    Call<Void> deleteDireccion(@Path("id") long id);

}
