package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.numero1);
        et2 = (EditText) findViewById(R.id.numero2);
        tv1 = (TextView)findViewById(R.id.resultado);
        rb1 = (RadioButton)findViewById(R.id.sumar);
        rb2 = (RadioButton)findViewById(R.id.restar);
        rb3 = (RadioButton)findViewById(R.id.multiplicar);
        rb4 = (RadioButton)findViewById(R.id.dividir);

    }

    public void elegirTipo(View view){

        if(rb1.isChecked()){
            sumar();
        }
        else if(rb2.isChecked() ){
            restar();
        }
        else if(rb3.isChecked() ){
            multiplicar();
        }
        else if(rb4.isChecked()){
            dividir();
        }
        else {
            tv1.setText("Tienes que seleccionar una opción");
        }

    }



    //Este método realiza la suma
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