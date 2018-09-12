package br.ufjf.dcc196.dcc196exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlunoActivity extends AppCompatActivity {

    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
        btnConfirmar = (Button) findViewById(R.id.btn_confirmarAluno);
        Bundle extras = getIntent().getExtras();
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent resultado = new Intent();
                //resultado.putExtra();
                setResult(Activity.RESULT_OK);
                finish();
            }
        });
    }
}
