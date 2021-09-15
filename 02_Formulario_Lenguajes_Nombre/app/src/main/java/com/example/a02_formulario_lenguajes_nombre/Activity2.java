package com.example.a02_formulario_lenguajes_nombre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView txtValores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtValores = (TextView) findViewById(R.id.txtValores);

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String lenguajes = getIntent().getStringExtra("lenguajes");
        String lenguajePrincipal = getIntent().getStringExtra("lenguajePrincipal");

        txtValores.setText(String.format("Nombre: %s %s\nLenguajes que maneja: %s\nLenguaje preferido: %s", nombre, apellido, lenguajes, lenguajePrincipal));
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}