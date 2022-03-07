package com.example.tallermecanicoandroid.api;

import static okhttp3.logging.HttpLoggingInterceptor.Level;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCliente {

       public  static  final String URL_001 = "http://localhost:8080"; // <----Usad esto si emulais en ordenador
    //public  static  final String URL_001 = "http://192.168.4.30:8080"; //<--- ip de mi ordenador

    public static Retrofit getCliente(){

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();

        loggingInterceptor.setLevel(Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_001)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;
    }
}
