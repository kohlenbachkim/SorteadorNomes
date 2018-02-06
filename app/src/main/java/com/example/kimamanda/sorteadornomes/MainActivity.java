package com.example.kimamanda.sorteadornomes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button masculino;
    Button feminino;
    Button limpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limpa = (Button)  findViewById(R.id.limpa);
        texto = (TextView) findViewById(R.id.texto);
        feminino = (Button) findViewById(R.id.feminino);
        masculino = (Button) findViewById(R.id.masculino);
    }

    public void mostra_feminino(View v) {


        ArrayList<String> Femininos = new ArrayList<String>();
        Femininos.add("Kim");
        Femininos.add("Millena");
        Femininos.add("Bianca");
        Femininos.add("Ana");
        Femininos.add("Nicole");
        Femininos.add("Julia");
        Femininos.add("Alice");
        Femininos.add("Sofia");
        Femininos.add("Carolina");
        Femininos.add("Sabrina");
        Femininos.add("Manuela");

        int i;
        Random r = new Random();
        int n = Femininos.size();
        for (i = 0; i < 1; i++) {

            String sorteioFeminino = Femininos.get(r.nextInt(Femininos.size()));

            texto.setText(sorteioFeminino);
        }
    }

    public void mostra_masculino (View v) {

        ArrayList<String> Masculinos = new ArrayList<String>();
        Masculinos.add("Marcos");
        Masculinos.add("Lucas");
        Masculinos.add("Thiago");
        Masculinos.add("Gustavo");
        Masculinos.add("Geison");
        Masculinos.add("Vítor");
        Masculinos.add("Caio");
        Masculinos.add("Vinícius");
        Masculinos.add("Carlos");
        Masculinos.add("Nicolas");
        Masculinos.add("Pedro");

        int i;
        Random r = new Random();
        int n = Masculinos.size();
        for (i = 0; i < 1; i++) {

            String sorteioMasculino = Masculinos.get(r.nextInt(Masculinos.size()));

            

            texto.setText(sorteioMasculino);
        }
    }

    public void limpar (View v){
        texto.setText("");
    }
}
