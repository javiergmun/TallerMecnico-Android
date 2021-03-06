package android.talleresjoseluis.adapters;

import android.talleresjoseluis.Interfaz;
import android.talleresjoseluis.R;
import android.talleresjoseluis.dao.Cita;
import android.talleresjoseluis.holders.ViewHolderHora;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class AdapterHora extends RecyclerView.Adapter<ViewHolderHora> {
    private LinkedList<Cita> listaHoras;
    private Interfaz interfaz;

    public AdapterHora(LinkedList<Cita> lista, Interfaz interfaz) {
        this.listaHoras = lista;
        this.interfaz = interfaz;

    }

    @NonNull
    @Override
    public ViewHolderHora onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolderHora(inflater.inflate(R.layout.sevicio_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHora holder, int position) {
        holder.render(listaHoras.get(position), interfaz);
    }

    @Override
    public int getItemCount() {
        return listaHoras.size();
    }
}

