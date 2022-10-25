package com.example.practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private CheckBox check1;
    private CheckBox check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.numero1);
        et2 = (EditText) findViewById(R.id.numero2);
        tv1 = (TextView)findViewById(R.id.resultado);
        check1 = (CheckBox)findViewById(R.id.sumar);
        check2 = (CheckBox)findViewById(R.id.restar);


    }

    public void elegirTipo(View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        String resultado = "";
        if(check1.isChecked()){
            int suma = num1 + num2;
             resultado = "SUMA: " + String.valueOf(suma) + " |  ";

        }
        if (check2.isChecked()){
            int resta = num1 - num2;

             resultado = resultado + "RESTA: " +String.valueOf(resta);
        }
        tv1.setText(resultado);

    }




}