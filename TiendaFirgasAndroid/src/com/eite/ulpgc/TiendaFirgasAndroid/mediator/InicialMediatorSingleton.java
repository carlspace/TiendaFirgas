package com.eite.ulpgc.TiendaFirgasAndroid.mediator;

import es.ulpgc.eite.framework.android.AndroidMediatorSingleton;


public class InicialMediatorSingleton extends AndroidMediatorSingleton {
    @Override
    public void createMediator() {
        setCustomConfig(new InicialMediatorConfig(this));

    }
}
