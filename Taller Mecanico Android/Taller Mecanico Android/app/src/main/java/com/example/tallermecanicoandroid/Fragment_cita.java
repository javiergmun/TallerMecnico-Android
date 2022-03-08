package com.example.tallermecanicoandroid;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tallermecanicoandroid.adapter.RecyclerViewAdapterCita;
import com.example.tallermecanicoandroid.adapter.RecyclerViewAdapterServicio;
import com.example.tallermecanicoandroid.api.ApiCliente;
import com.example.tallermecanicoandroid.api.CitaService;
import com.example.tallermecanicoandroid.api.ServicioService;
import com.example.tallermecanicoandroid.model.Cita;
import com.example.tallermecanicoandroid.model.Mecanico;
import com.example.tallermecanicoandroid.model.Servicio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_cita extends Fragment {

    List<Cita> servicioList = new ArrayList<>();
    RecyclerViewAdapterCita adapter;
    LinearLayoutManager layoutManager;
    Date fechaCita;

    public Fragment_cita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Fragment_cita() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_citas,container,false);

        CitaService apiService = ApiCliente.getCliente().create(CitaService.class);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerCitas);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);


        Call<List<Cita>> listCall = apiService.getAllCitas();

        listCall.enqueue(new Callback<List<Cita>>() {

            @Override
            public void onResponse(Call<List<Cita>> call, Response<List<Cita>> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(), "Error en la conexion", Toast.LENGTH_SHORT).show();
                }

                servicioList = response.body();
                adapter = new RecyclerViewAdapterCita(servicioList,getActivity());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Cita>> call, Throwable t) {
                Toast.makeText(getActivity(), "HA FALLADO" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.i("info", "onFailure: "+t.getMessage());

            }
        });


        return view;
    }

}
