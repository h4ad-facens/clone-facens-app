package com.labinfo.thiago.clonefacensapp.presenters;

import com.labinfo.thiago.clonefacensapp.interfaces.MainContract;
import com.labinfo.thiago.clonefacensapp.interactors.MainInteractor;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;
    MainContract.Interactor interactor;

    public MainPresenter(MainContract.View view) {
        this.view = view;
        this.interactor = new MainInteractor();
    }
}
