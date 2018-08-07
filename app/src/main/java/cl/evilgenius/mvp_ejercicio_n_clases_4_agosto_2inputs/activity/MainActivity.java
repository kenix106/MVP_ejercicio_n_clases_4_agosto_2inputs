package cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.R;
import cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter.Contract.MainContract;
import cl.evilgenius.mvp_ejercicio_n_clases_4_agosto_2inputs.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View{

   private MainPresenter presenter;
    private TextView tv;
    private EditText name;
    private EditText last;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.TV_fullName);
        name = findViewById(R.id.ET_name);
        last = findViewById(R.id.ET_lastName);
        btn = findViewById(R.id.BTN_Aceptar);

        presenter = new MainPresenter();
        presenter.attachView(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myName = name.getText().toString();//le damos a la variable el valor del edit text
                String myLast =last.getText().toString();
                presenter.Name(myName, myLast);// le damos al metodo de la interface las variables del editText

            }
        });

    }


    @Override
    public void showName(String fullName) {
tv.setText(fullName);//recibimos los metodos previamente registrado del presenter
    }

    @Override
    public void blank() {
tv.setText("");
        Toast.makeText(this, "Campos Vacios", Toast.LENGTH_SHORT).show();
    }
}
