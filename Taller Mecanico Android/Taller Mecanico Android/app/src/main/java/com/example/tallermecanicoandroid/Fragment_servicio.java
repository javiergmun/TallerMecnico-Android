package com.example.tallermecanicoandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tallermecanicoandroid.adapter.RecyclerViewAdapterServicio;
import com.example.tallermecanicoandroid.api.ApiCliente;
import com.example.tallermecanicoandroid.api.ServicioService;
import com.example.tallermecanicoandroid.api.VehiculoService;
import com.example.tallermecanicoandroid.model.Servicio;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_servicio extends Fragment {

    List<Servicio> servicioList = new ArrayList<>();
    RecyclerViewAdapterServicio adapter;
    LinearLayoutManager layoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_servicios,container,false);

        ServicioService apiService = ApiCliente.getCliente().create(ServicioService.class);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerServicios);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);


        Call<List<Servicio>> listCall = apiService.getAllServicios();

        listCall.enqueue(new Callback<List<Servicio>>() {
            @Override
            public void onResponse(Call<List<Servicio>> call, Response<List<Servicio>> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(), "Error en la conexion", Toast.LENGTH_SHORT).show();
                }

                servicioList = response.body();

                Servicio s1 = new Servicio(1L,200.00,"Cambio aceite",2.00,"","Se hacen muchas cosas");
                Servicio s2 = new Servicio(1L,200.00,"Cambio aceite",2.00,"","Se hacen muchas cosas");
                Servicio s3 = new Servicio(1L,200.00,"Cambio aceite",2.00,"","Se hacen muchas cosas");
                Servicio s4 = new Servicio(1L,200.00,"Cambio aceite",2.00,"","Se hacen muchas cosas");

                servicioList.add(s1);
                servicioList.add(s2);
                servicioList.add(s3);
                servicioList.add(s4);


                adapter = new RecyclerViewAdapterServicio(servicioList,getActivity());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Servicio>> call, Throwable t) {
                Toast.makeText(getActivity(), "HA FALLADO" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.i("info", "onFailure: "+t.getMessage());

            }
        });


        return view;
    }

}
