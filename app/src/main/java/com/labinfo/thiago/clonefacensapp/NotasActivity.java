package com.labinfo.thiago.clonefacensapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.labinfo.thiago.clonefacensapp.adapters.NotasAdapter;
import com.labinfo.thiago.clonefacensapp.models.Notas;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotasActivity extends AppCompatActivity {

    @BindView(R.id.recycler_notas)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        ButterKnife.bind(this);

        List<Notas> list = new ArrayList<>();
        list.add(new Notas(
                "Circuitos Eletronicos II",
                "9.0",
                "-",
                "-",
                "-"
        ));
        list.add(new Notas(
                "Circuitos Eletronicos II - LAB",
                "10.0",
                "-",
                "-",
                "-"
        ));

        list.add(new Notas(
                "Estrutura de Dados e Algoritmos",
                "8.7",
                "-",
                "-",
                "-"
        ));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NotasAdapter(list));
    }
}
