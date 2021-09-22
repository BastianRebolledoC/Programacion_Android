package com.brebolledo.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
    }
    public void Tostada(View view){
        if(editTextNombre.getText().toString().length() > 2){
            Toast.makeText(this, editTextNombre.getText().toString() + " , pedido confirmado!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Ingrese su nombre, por favor", Toast.LENGTH_SHORT).show();
        }
    }
}