package com.labinfo.thiago.clonefacensapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.labinfo.thiago.clonefacensapp.models.ObjetoQualquer;
import com.labinfo.thiago.clonefacensapp.R;
import com.labinfo.thiago.clonefacensapp.viewholders.ListaViewHolder;

public class ListaAdapter extends RecyclerView.Adapter<ListaViewHolder> {

    private List<ObjetoQualquer> itens = new ArrayList<>();

    public ListaAdapter(List<ObjetoQualquer> itens) {
        this.itens = itens;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ListaViewHolder(
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_lista, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListaViewHolder listaViewHolder, int i) {
        listaViewHolder.setTitle(itens.get(i).getTitle());
        listaViewHolder.setMessage(itens.get(i).getMessage());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
