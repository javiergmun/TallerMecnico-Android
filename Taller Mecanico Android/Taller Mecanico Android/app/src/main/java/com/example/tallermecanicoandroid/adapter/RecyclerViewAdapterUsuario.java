package com.example.tallermecanicoandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tallermecanicoandroid.R;
import com.example.tallermecanicoandroid.model.Usuario;

import java.util.List;

public class RecyclerViewAdapterUsuario {
        /*
        extends RecyclerView.Adapter<RecyclerViewAdapterUsuario.ViewHolder>{


    List<Usuario> usuarioList;
    Context context;

    public RecyclerViewAdapterUsuario(List<Usuario> usuarioList, Context context) {
        this.usuarioList = usuarioList;
        this.context = context;
    }

    //Poner en el inflate el xml del item (como se muestra)

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inicializar el view con la lista de elementos
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_elem,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Usuario item = usuarioList.get(position);

        //Poner el textview correspondiente con el atributo al que corresponda
        holder.textViewDni.setText(item.getDni());
        holder.textViewUsername.setText(item.getUsername());
        holder.textViewPassword.setText(item.getPassword());
        holder.textViewTelefono.setText(item.getTelefono());
        holder.textViewCorreo.setText(item.getCorreo());

        //Para tratar la imagen con glide
        Glide.with(context)
                .load(item.getImage())
                .into(holder.imageViewUsuario);

    }


    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewDni,textViewUsername,textViewPassword, textViewTelefono, textViewCorreo;    //Poner los elementos del xml
        ImageView imageViewUsuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textViewDni = itemView.findViewById(R.id.textView_dni);
            textViewUsername = itemView.findViewById(R.id.textView_username);
            textViewPassword = itemView.findViewById(R.id.textView_password);
            textViewTelefono = itemView.findViewById(R.id.textView_telefono);
            textViewCorreo = itemView.findViewById(R.id.textView_correo);
            imageViewUsuario = itemView.findViewById(R.id.imageView_usuario);

        }
    }

         */


}
