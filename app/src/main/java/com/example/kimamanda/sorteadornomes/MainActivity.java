package com.example.kimamanda.sorteadornomes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button masculino;
    Button feminino;
    Button limpa;
    Button botaoAddNome;
    Button mostrarLista;
    //String[] Femininos = {"Kim", "Millena"};
    //String[] Masculinos = {"Marcos", "Lucas"};
    String[] Femininos = {"Kim", "Millena", "Bianca", "Nicole", "Ana", "Julia", "Alice", "Sofia", "Carolina", "Sabrina", "Manuela"};
    String[] Masculinos = {"Marcos", "Lucas", "Thiago", "João", "Geison", "Vítor", "Caio", "Vinícius", "Carlos", "Nicolas", "Pedro"};
    String sorteio;
    String compara;
    String novoNome;
    EditText caixaTexto;
    RadioGroup radios;
    RadioButton radioFeminino;
    RadioButton radioMasculino;
    TextView listaFemininos;
    TextView listaMasculinos;


    int tamanhoStringFemininos = Femininos.length;
    int novoTamanhoStringFemininos = tamanhoStringFemininos + 1;
    String[] novoFemininos = new String[novoTamanhoStringFemininos];

    int tamanhoStringMasculinos = Masculinos.length;
    int novoTamanhoStringMasculinos = tamanhoStringMasculinos + 1;
    String[] novoMasculinos = new String[novoTamanhoStringMasculinos];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limpa = (Button) findViewById(R.id.limpa);
        texto = (TextView) findViewById(R.id.texto);
        feminino = (Button) findViewById(R.id.feminino);
        masculino = (Button) findViewById(R.id.masculino);
        botaoAddNome = (Button) findViewById(R.id.botaoAddNome);
        caixaTexto = (EditText) findViewById(R.id.caixaTexto);
        radioFeminino = (RadioButton) findViewById(R.id.radioFeminino);
        radioMasculino = (RadioButton) findViewById(R.id.radioMasculino);
        radios = (RadioGroup) findViewById(R.id.radios);
        mostrarLista = (Button) findViewById(R.id.botaoLista);
        listaFemininos = (TextView) findViewById(R.id.listaFemininos);
        listaMasculinos = (TextView) findViewById(R.id.listaMasculinos);
    }


    public void sorteia(int tamanho, String[] genero, String cor_correspondente) {

        int r = new Random().nextInt(tamanho);
        sorteio = genero[r];
        compara = texto.getText().toString();

        if (compara == sorteio) {
            sorteia(tamanho, genero, cor_correspondente);
        } else {
            mostra(sorteio, cor_correspondente);
        }
    }


    public void mostra(String nome, String cor_correspondente) {

        texto.setText(nome);
        texto.setTextColor(Color.parseColor(cor_correspondente));
    }


    public void mostra_feminino(View v) {

        sorteia(Femininos.length, Femininos, "#FF1493");

    }


    public void mostra_masculino(View v) {

        sorteia(Masculinos.length, Masculinos, "#1E90FF");
    }


    public void adicionarNome(View v) {

        novoNome = caixaTexto.getText().toString();

        RadioGroup rg = findViewById(R.id.radios);
        int opcao = rg.getCheckedRadioButtonId();

        if (opcao == R.id.radioFeminino) {

            for (int i = 0; i < tamanhoStringFemininos; i++) {

                novoFemininos[i] = Femininos[i];                        //copia o conteúdo da String anterior para a String nova
            }
            novoFemininos[novoTamanhoStringFemininos - 1] = novoNome;     //adiciona o novo nome no último índice da String nova.
            Femininos = novoFemininos;

        }

        if (opcao == R.id.radioMasculino) {

            for (int i = 0; i < tamanhoStringMasculinos; i++) {

                novoMasculinos[i] = Masculinos[i];                        //copia o conteúdo da String anterior para a String nova
            }
            novoMasculinos[novoTamanhoStringMasculinos - 1] = novoNome;     //adiciona o novo nome no último índice da String nova.
            Masculinos = novoMasculinos;

        }
    }

    public void mostrarLista(View v) {

        listaFemininos.setText(Arrays.toString(Femininos).substring(1).replaceFirst("]", ""));
        listaMasculinos.setText(Arrays.toString(Masculinos).substring(1).replaceFirst("]", ""));

    }

    public void limpar(View v) {

        texto.setText("");
        listaFemininos.setText("");
        listaMasculinos.setText("");
    }


}
