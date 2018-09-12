package br.ufjf.dcc196.dcc196exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PROF = 1;
    private static final int REQUEST_ALUNO = 2;
    private static final int REQUEST_EXTERNO = 3;


    private Button btnAluno;
    private Button btnProfessor;
    private Button btnExterno;
    private TextView txtAluno;
    private TextView txtProfessor;
    private TextView txtExterno;

    private int totalAlunos = 0;
    private int totalExternos = 0;
    private int totalProfessores = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnProfessor = (Button) findViewById(R.id.btn_professor);
        btnExterno = (Button) findViewById(R.id.btn_externo);
        txtAluno = (TextView) findViewById(R.id.txt_alunos);
        txtProfessor = (TextView) findViewById(R.id.txt_professores);
        txtExterno = (TextView) findViewById(R.id.txt_externo);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_ALUNO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MainActivity.REQUEST_ALUNO && resultCode == Activity.RESULT_OK){
            totalAlunos++;
            txtAluno.setText("Alunos: " + totalAlunos);
        }
        txtProfessor.setText("Professores: " + totalProfessores);
        txtExterno.setText("Externos: " + totalExternos);

    }
}
