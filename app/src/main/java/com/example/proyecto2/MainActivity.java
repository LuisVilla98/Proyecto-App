package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inicia(View v){

        Intent i = new Intent(this,Pantalla1.class);
        startActivity(i);

        System.out.println("Comencemos");
        Toast.makeText(this, "Hola, Comencemos!", Toast.LENGTH_SHORT).show();
    }

}