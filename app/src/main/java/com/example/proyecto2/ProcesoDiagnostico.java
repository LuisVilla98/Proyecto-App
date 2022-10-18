package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class ProcesoDiagnostico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceso_diagnostico);

        TabLayout tl = (TabLayout) findViewById(R.id.tabmenu);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        nivelagua n = new nivelagua();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,n).commit();
                        Toast.makeText(getApplicationContext(), "Nivel del Agua", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        datos d = new datos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,d).commit();
                        Toast.makeText(getApplicationContext(), "Datos", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        opciones o = new opciones();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,o).commit();
                        Toast.makeText(getApplicationContext(), "Opciones", Toast.LENGTH_SHORT).show();
                        break;


                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }






}