package cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter;

public abstract class BasePresenter <V> {

    private V view;

 public void attachView(V view){
      this.view = view;
  }

    public V getView(){
      return view;
    }
}
