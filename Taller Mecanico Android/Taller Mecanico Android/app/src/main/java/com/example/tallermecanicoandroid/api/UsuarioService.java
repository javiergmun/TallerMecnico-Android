package com.example.tallermecanicoandroid.api;


import com.example.tallermecanicoandroid.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UsuarioService {

    @GET("/usuarios")
    Call<List<Usuario>> getAllUsuarios();

    @GET("/usuario/{id}")
    Call<Usuario> getUsuario(@Path("id") long id);

    @POST("/usuario")
    Call<Usuario> createUsuario(@Body Usuario usuario);

    @PUT("/usuario/{id}")
    Call<Usuario> putUsuario(@Path("id") long id, @Body Usuario usuario);

    @DELETE("/usuario/{id}")
    Call<Void> deleteUsuario(@Path("id") long id);

}
