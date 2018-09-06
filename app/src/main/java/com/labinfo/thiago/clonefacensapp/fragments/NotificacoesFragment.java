package com.labinfo.thiago.clonefacensapp.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.labinfo.thiago.clonefacensapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificacoesFragment extends Fragment {


    public NotificacoesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notificacoes, container, false);
    }

}
