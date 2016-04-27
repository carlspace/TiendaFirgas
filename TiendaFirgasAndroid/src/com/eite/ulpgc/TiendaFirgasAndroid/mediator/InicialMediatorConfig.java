package com.eite.ulpgc.TiendaFirgasAndroid.mediator;

import com.eite.ulpgc.TiendaFirgasAndroid.pantallaInicial.model.InicialModelo;
import com.eite.ulpgc.TiendaFirgasAndroid.pantallaInicial.presenter.InicialPresenter;
import com.eite.ulpgc.TiendaFirgasAndroid.pantallaInicial.view.InicialView;
import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorConfig;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;

/**
 * Created by Carlos on 30/03/2016.
 */
public class InicialMediatorConfig extends MediatorConfig{
    public InicialMediatorConfig(I_MediatorSingleton mediator) {
        super(mediator);
    }

    @Override
    public void setCustomConfig() {
        setInicialConfig();
    }

    private void setInicialConfig() {
        setInicialScreenCollection();
        SetInicialTransitionCollection();
    }

    private void setInicialScreenCollection(){
        getScreens().add(new MediatorScreen(InicialView.class, InicialPresenter.class, InicialModelo.class));
    }
    private void SetInicialTransitionCollection() {
        getTransitions().add(new MediatorTransition(InicialView.class, null,InicialMediatorCode.CLICK));
    }
}
