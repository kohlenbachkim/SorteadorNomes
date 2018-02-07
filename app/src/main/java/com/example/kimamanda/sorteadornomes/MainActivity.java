package com.example.kimamanda.sorteadornomes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button masculino;
    Button feminino;
    Button limpa;
    String[] Femininos = {"Kim", "Millena", "Bianca", "Nicole", "Ana", "Julia", "Alice", "Sofia", "Carolina", "Sabrina", "Manuela"};
    String[] Masculinos = {"Marcos", "Lucas", "Thiago", "João", "Geison", "Vítor", "Caio", "Vinícius", "Carlos", "Nicolas", "Pedro"};
    String sorteio;
    String compara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limpa = (Button) findViewById(R.id.limpa);
        texto = (TextView) findViewById(R.id.texto);
        feminino = (Button) findViewById(R.id.feminino);
        masculino = (Button) findViewById(R.id.masculino);
    }


    public void sorteia(int tamanho, String[] genero) {

        int r = new Random().nextInt(tamanho);
        sorteio = genero[r];
        compara = texto.getText().toString();
    }

     /* public void compara(View v) {

            if (compara == sorteio) {
                i=0;
            } else {
                mostra(v);
            }
    }


    private void mostra(View v) {

        if () {
            texto.setText(sorteio);
            texto.setTextColor(Color.MAGENTA);
        }

        if () {
            texto.setText(sorteio);
            texto.setTextColor(Color.BLUE);
        }
    } */


    public void mostra_feminino(View v) {

        sorteia(Femininos.length, Femininos);
        //mostra(Femininos);

        if (compara == sorteio) {
            mostra_feminino(v);
        } else {
            texto.setText(sorteio);
            texto.setTextColor(Color.MAGENTA);
        }
    }


    public void mostra_masculino(View v) {

        sorteia(Masculinos.length, Masculinos);

        if (compara == sorteio) {
            mostra_masculino(v);
        } else {
            texto.setText(sorteio);
            texto.setTextColor(Color.BLUE);
        }
    }


    public void limpar(View v) {
        texto.setText("");
    }
}
