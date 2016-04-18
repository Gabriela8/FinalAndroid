package ed.com.evento.meuappevento.activity;

/**
 * Created by Lenildo on 18/04/2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import ed.com.evento.meuappevento.R;
import ed.com.evento.meuappevento.asyncTask.BuscarNomeGetAsyncTask;
import ed.com.evento.meuappevento.entidade.Pessoa;

public class CadastroActivity extends AppCompatActivity implements OnClickListener{

    private EditText nome;
    private EditText email;
    private EditText endereco;
    private EditText cpf;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        nome = (EditText) findViewById(R.id.editTextNome);
        email = (EditText) findViewById(R.id.editTextEmail);
        endereco = (EditText) findViewById(R.id.editTextEndereco);
        cpf = (EditText) findViewById(R.id.editTextCpf);


        cadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nome.getText().toString());
        pessoa.setEmail(email.getText().toString());
        pessoa.setEndereco(endereco.getText().toString());
        pessoa.setCpf(cpf.getText().toString());

        CadastroAsyncTask cadastroAsyncTask = new CadastroAsyncTask(this);
        cadastroAsyncTask.execute(pessoa);

    }
}

