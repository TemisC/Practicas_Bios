package com.example.tcastillo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MiPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_pantalla);

        String[] array_paises = {"Alemania, Australia, Argentina, Italia"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,array_paises);

        ListView list = findViewById(R.id.listV);
        list.setAdapter(arrayAdapter);
    }
}
