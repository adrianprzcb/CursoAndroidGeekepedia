package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Spinner spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.numero1);
        et2 = (EditText) findViewById(R.id.numero2);
        tv1 = (TextView)findViewById(R.id.resultado);
        spin = (Spinner)findViewById(R.id.spinner);

        String [] opciones = {"Sumar" , "Restar", "Multiplicar" , "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              R.layout.spinner_item, opciones);

        spin.setAdapter(adapter);
    }

   public void elegirTipo(View view){
        String seleccion = spin.getSelectedItem().toString();
        if(seleccion.equals("Sumar")){
            sumar();
        }
        else if(seleccion.equals("Restar")){
            restar();
        }
        else if(seleccion.equals("Multiplicar")){
            multiplicar();
        }
        else if(seleccion.equals("Dividir")){
            dividir();
        }
        else {
            tv1.setText("Tienes que seleccionar una opción");
        }

    }


    public void sumar(){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }

    public void restar(){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resta = num1 - num2;

        String resultado = String.valueOf(resta);
        tv1.setText(resultado);
    }


    private void multiplicar() {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multiplicacion = num1 * num2;

        String resultado = String.valueOf(multiplicacion);
        tv1.setText(resultado);
    }


    private void dividir() {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        if(num2==0){
            tv1.setText("El segundo número no puede ser 0");

        }else {
            int division = num1 / num2;
            String resultado = String.valueOf(division);
            tv1.setText(resultado);
        }
    }
}