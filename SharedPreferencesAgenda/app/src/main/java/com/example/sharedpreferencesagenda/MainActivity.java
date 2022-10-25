package com.example.sharedpreferencesagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eNombre;
    private EditText eDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eNombre = (EditText)findViewById(R.id.nombre);
        eDatos = (EditText)findViewById(R.id.datos);

    }

    public void guardar(View view){
        String nombre = eNombre.getText().toString();
        String datos = eDatos.getText().toString();

        SharedPreferences preferences = getSharedPreferences("agenda" , Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferences.edit();
        objEditor.putString(nombre, datos);
        objEditor.commit();
        Toast.makeText(this, "El contacto ha sido guardado.", Toast.LENGTH_SHORT).show();
    }

    public void buscar(View view){
        String nombre = eNombre.getText().toString();

        SharedPreferences preferences = getSharedPreferences("agenda" , Context.MODE_PRIVATE);
        String datos = preferences.getString(nombre, "");

        if(datos.length() == 0){
            Toast.makeText(this, "No se ha encontrado ningún registro.", Toast.LENGTH_SHORT).show();

        }else{
        eDatos.setText(datos);
        }

    }


}