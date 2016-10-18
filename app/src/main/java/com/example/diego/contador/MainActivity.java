package com.example.diego.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;    //Creamos la variable para que tengan acceso todos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;   //Iniciamos la variable
    }

    //Creamos los métodos correspondientes

    //Método para incrementar
    public void incrementaContador(View vista){
        contador++;

        //Llamamos al método mostrarResultado
        mostrarResultado();
    }


    //Método para decrementar
    public void restaContador(View vista){
        contador--;

        //Llamamos al método mostrarResultado
        mostrarResultado();
    }

    //Método para resetear
    public void resetearContador(View vista){
        contador = 0;

        //Llamamos al método mostrarResultado
        mostrarResultado();
    }

    public void mostrarResultado(){
        //Creo una instancia de la clase textView
        TextView textoResultado = (TextView)findViewById(R.id.contadorTexto);

        //Método setText
        textoResultado.setText("" + contador);
    }
}
