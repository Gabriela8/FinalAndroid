package ed.com.evento.meuappevento.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ed.com.evento.meuappevento.R;
import ed.com.evento.meuappevento.entidade.Pessoa;

public class PessoaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selected);


        Bundle bundle = getIntent().getExtras();
        Pessoa pessoa = null;

        if (bundle.containsKey("pessoa")){
            pessoa = (Pessoa) bundle.get("pessoa");
        }

        TextView name = (TextView) findViewById(R.id.userNome);
        TextView email = (TextView) findViewById(R.id.emailUser);
        TextView id = (TextView) findViewById(R.id.idUser);
        TextView endereco = (TextView) findViewById(R.id.enderecoUser);
        TextView cpf = (TextView) findViewById(R.id.cpfUser);

        name.setText(name.getText().toString() + " " + pessoa.getNome());
        email.setText(email.getText().toString() + " " + pessoa.getEmail());
        id.setText(id.getText().toString() + " " + pessoa.getId());
        endereco.setText(endereco.getText().toString() + " " + pessoa.getEndereco());
        cpf.setText(cpf.getText().toString() + " " + pessoa.getEndereco());

    }
}

