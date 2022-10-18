package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }

    public void agregar(View v){
        Intent i = new Intent(this,Pantalla2.class);
        startActivity(i);

        System.out.println("Registrar");
        Toast.makeText(this, "Registrar represa", Toast.LENGTH_SHORT).show();
    }

    public void iniciar_diagnostico(View v){
        Intent i = new Intent(this,ProcesoDiagnostico.class);
        startActivity(i);

        System.out.println("IniciarDiagnostico");
        Toast.makeText(this, "Has inciado el diagnóstico!", Toast.LENGTH_SHORT).show();
    }

}