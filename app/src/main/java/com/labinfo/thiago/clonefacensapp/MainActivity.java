package com.labinfo.thiago.clonefacensapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;

import com.labinfo.thiago.clonefacensapp.fragments.EventosFragment;
import com.labinfo.thiago.clonefacensapp.fragments.NotificacoesFragment;
import com.labinfo.thiago.clonefacensapp.fragments.PortalFragment;
import com.labinfo.thiago.clonefacensapp.interfaces.MainContract;
import com.labinfo.thiago.clonefacensapp.presenters.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements MainContract.View {

    @BindView(R.id.menu)
    BottomNavigationView bottomNavigationView;

    private MainContract.Presenter presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, new PortalFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_portal:
                        getFragmentManager().beginTransaction().replace(R.id.fragment_content, new PortalFragment()).commit();
                        return true;
                    case R.id.navigation_eventos:
                        getFragmentManager().beginTransaction().replace(R.id.fragment_content, new EventosFragment()).commit();
                        return true;
                    case R.id.navigation_notificacoes:
                        getFragmentManager().beginTransaction().replace(R.id.fragment_content, new NotificacoesFragment()).commit();
                        return true;
                }
                return false;
            };
}
