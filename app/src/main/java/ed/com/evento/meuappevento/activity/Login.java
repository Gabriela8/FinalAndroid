package ed.com.evento.meuappevento.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ed.com.evento.meuappevento.R;

/**
 * Created by Lenildo on 17/04/2016.
 */
public class Login extends Activity implements OnClickListener {

    private EditText editTextLogin;
    private EditText editTextSenha;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Administrador administrador = new Administrador();
        administrador.setEmail(editTextLogin.getText().toString());
        administrador.setSenha(editTextSenha.getText().toString());

        LoginAsyncTask loginAsyncTask = new LoginAsyncTask(this);
        loginAsyncTask.execute(administrador);

    }
}