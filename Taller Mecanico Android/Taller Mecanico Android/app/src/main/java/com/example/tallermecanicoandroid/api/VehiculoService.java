package com.example.tallermecanicoandroid.api;


import com.example.tallermecanicoandroid.model.Vehiculo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface VehiculoService {

    @GET("/vehiculos")
    Call<List<Vehiculo>> getAllVehiculos();

    @GET("/vehiculo/{id}")
    Call<Vehiculo> getVehiculo(@Path("id") long id);

    @POST("/vehiculo")
    Call<Vehiculo> createVehiculo(@Body Vehiculo vehiculo);

    @PUT("/vehiculo/{id}")
    Call<Vehiculo> putVehiculo(@Path("id") long id, @Body Vehiculo vehiculo);

    @DELETE("/vehiculo/{id}")
    Call<Void> deleteVehiculo(@Path("id") long id);

}
