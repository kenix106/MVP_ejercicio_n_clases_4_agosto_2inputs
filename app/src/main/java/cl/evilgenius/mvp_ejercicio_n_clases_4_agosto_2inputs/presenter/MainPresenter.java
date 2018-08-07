package cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter;

import cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter.Contract.MainContract;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.presenter {




 /*   private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }*/

    @Override//aqui hacemos la logica donde se concatena los parametros del edit text
    public void Name(String name, String last) {
        if (name.trim().length() > 0 && last.trim().length() > 0) {
            //si las variables son mayor a 0 le enviamos la info al metodo de showName de BasePresenter
            getView().showName(name + " " + last); //

        } else {
            getView().blank();
        }
    }
}
