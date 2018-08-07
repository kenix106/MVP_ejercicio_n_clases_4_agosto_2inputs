package cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter.Contract;

public interface MainContract {

    interface View{
        void showName(String fullName);
        void blank ();
    }
    interface presenter{

        void Name(String name, String last);


        //void initNumber();
    }


}
