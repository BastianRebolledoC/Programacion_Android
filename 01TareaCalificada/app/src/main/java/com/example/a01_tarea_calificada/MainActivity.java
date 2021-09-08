package com.example.a01_tarea_calificada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_toast, btn_add, btn_reset, btn_reduce;
    private TextView text_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_number = (TextView)findViewById(R.id.text_number);
    }
    public void ToastButton(View view){
        Toast.makeText(this,"Tostada de ejemplo",Toast.LENGTH_SHORT).show();
    }
    public void AddOne(View view){
        text_number.setText( String.valueOf( Integer.parseInt(text_number.getText().toString()) + 1 ) );
    }
    public void ReduceOne(View view){
        text_number.setText( String.valueOf( Integer.parseInt(text_number.getText().toString()) - 1 ) );
    }
    public void Reset(View view){
        text_number.setText("0");
    }
}