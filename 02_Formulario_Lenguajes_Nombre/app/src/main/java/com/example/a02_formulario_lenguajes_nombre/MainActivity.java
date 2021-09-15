package com.example.a02_formulario_lenguajes_nombre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input_name, input_last_name;
    private CheckBox checkJava, checkPhp, checkPython, checkCs, checkCpp;
    private RadioGroup radioGroup;
    String Lenguajes = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_name = (EditText) findViewById(R.id.input_name);
        input_last_name = (EditText) findViewById(R.id.input_last_name);

        checkJava = (CheckBox) findViewById(R.id.checkJava);
        checkPhp = (CheckBox) findViewById(R.id.checkPhp);
        checkPython = (CheckBox) findViewById(R.id.checkPython);
        checkCs = (CheckBox) findViewById(R.id.checkCs);
        checkCpp = (CheckBox) findViewById(R.id.checkCpp);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

    }

    public void Siguiente(View view){

        if(DatosCorrectos()){
            Intent siguiente = new Intent(this, Activity2.class);
            lenguajesEscogidos();

            siguiente.putExtra("nombre", input_name.getText().toString());
            siguiente.putExtra("apellido", input_last_name.getText().toString());
            siguiente.putExtra("lenguajes", Lenguajes);

            //Obtener radioButton

            int id = radioGroup.getCheckedRadioButtonId();
            RadioButton rb = (RadioButton) findViewById(id);

            siguiente.putExtra("lenguajePrincipal", rb.getText().toString());


            startActivity(siguiente);
        }else{
            Toast.makeText(this,"Rellene los campos faltantes...", Toast.LENGTH_SHORT).show();
        }

    }

    public boolean DatosCorrectos(){

        boolean nombreValido = false, apellidoValido = false, lenguajesValido = false;

        if(input_name.getText().toString().length() > 0){
            nombreValido = true;
        }

        if(input_last_name.getText().toString().length() > 0){
            apellidoValido = true;
        }

        if(checkJava.isChecked() || checkPhp.isChecked() || checkPython.isChecked() || checkCs.isChecked() || checkCpp.isChecked()){
            lenguajesValido = true;
        }

        return nombreValido && apellidoValido && lenguajesValido;

    }

    public void lenguajesEscogidos(){

        //Vaciar String
        Lenguajes = "";

        if(checkJava.isChecked()){
            Lenguajes += "Java - ";
        }
        if(checkPhp.isChecked()){
            Lenguajes += "PHP - ";
        }
        if(checkPython.isChecked()){
            Lenguajes += "Python - ";
        }
        if(checkCs.isChecked()){
            Lenguajes += "C# - ";
        }
        if(checkCpp.isChecked()){
            Lenguajes += "C++ - ";
        }
        if(Lenguajes.substring(Lenguajes.length() - 3).equals(" - ")){
            Lenguajes = Lenguajes.substring(0, Lenguajes.length() - 3);
        }
    }
}