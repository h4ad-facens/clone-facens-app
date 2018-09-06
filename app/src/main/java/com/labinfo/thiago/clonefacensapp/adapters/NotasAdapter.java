package com.labinfo.thiago.clonefacensapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.labinfo.thiago.clonefacensapp.R;
import com.labinfo.thiago.clonefacensapp.models.Notas;
import com.labinfo.thiago.clonefacensapp.viewholders.NotasViewHolder;

import java.util.ArrayList;
import java.util.List;

public class NotasAdapter extends RecyclerView.Adapter<NotasViewHolder> {

    private List<Notas> itens = new ArrayList<>();

    public NotasAdapter(List<Notas> itens) {
        this.itens = itens;
    }

    @Override
    public NotasViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NotasViewHolder(
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_notas, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotasViewHolder viewHolder, int i) {
        viewHolder.setCourse(itens.get(i).getCurso());
        viewHolder.setM1(itens.get(i).getM1());
        viewHolder.setM2(itens.get(i).getM2());
        viewHolder.setSub(itens.get(i).getSub());
        viewHolder.setMedia(itens.get(i).getMedia());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
