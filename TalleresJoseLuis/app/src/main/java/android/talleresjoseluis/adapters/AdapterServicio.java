package android.talleresjoseluis.adapters;

import android.talleresjoseluis.Interfaz;
import android.talleresjoseluis.R;
import android.talleresjoseluis.holders.ViewHolderServicio;
import android.talleresjoseluis.dao.Servicio;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class AdapterServicio extends RecyclerView.Adapter<ViewHolderServicio> {
    private LinkedList<Servicio> listaServicios;
    private Interfaz interfaz;

    public AdapterServicio(LinkedList<Servicio> lista, Interfaz interfaz) {
        this.listaServicios = lista;
        this.interfaz = interfaz;

    }

    @NonNull
    @Override
    public ViewHolderServicio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolderServicio(inflater.inflate(R.layout.sevicio_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderServicio holder, int position) {
        holder.render(listaServicios.get(position), interfaz);
    }

    @Override
    public int getItemCount() {
        return listaServicios.size();
    }
}
