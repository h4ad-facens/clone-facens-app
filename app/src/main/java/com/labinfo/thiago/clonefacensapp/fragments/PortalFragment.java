package com.labinfo.thiago.clonefacensapp.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.labinfo.thiago.clonefacensapp.adapters.ListaAdapter;
import com.labinfo.thiago.clonefacensapp.models.ObjetoQualquer;
import com.labinfo.thiago.clonefacensapp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class PortalFragment extends Fragment {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    public PortalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        List<ObjetoQualquer> list = new ArrayList<>();
        list.add(new ObjetoQualquer("Notas", "Veja as notas do seu semestre"));
        list.add(new ObjetoQualquer("Faltas", "Veja as faltas do seu semestre"));
        list.add(new ObjetoQualquer("Hr. das Aulas", "Não perca nenhuma aula, veja os horarios"));
        list.add(new ObjetoQualquer("Ativ. Comp.", "Veja suas atividades complementares"));

        recyclerView.setLayoutManager(
                new GridLayoutManager(view.getContext(), 2)
        );

        recyclerView.setAdapter(new ListaAdapter(list));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portal, container, false);
    }
}
