package com.example.kimamanda.sorteadornomes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button feminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);
        feminino = (Button) findViewById(R.id.feminino);

    }

    public class Nomes {

        public void main(String[] args) {

            ArrayList<String> Femininos = new ArrayList<String>();

            //adiciona itens na lista
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
                //System.out.println(Femininos.get(r.nextInt(Femininos.size())));

            }
        }
    }

    public void mostra(View v) {

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

            texto.setText(Femininos.get(r.nextInt(Femininos.size())));
        }
    }
}
