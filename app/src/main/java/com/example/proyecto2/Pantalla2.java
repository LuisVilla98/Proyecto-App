package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }

    public void guardado_registro(View v){

        System.out.println("Guardado");
        Toast.makeText(this, "Su registro se a relizado con exito!", Toast.LENGTH_SHORT).show();

    }
}