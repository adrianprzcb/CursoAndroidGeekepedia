package com.example.sd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText nombreT, datosT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreT = (EditText)findViewById(R.id.editTextTextPersonName);
        datosT = (EditText)findViewById(R.id.multiline);
    }

    public void guardar(View view){
        String nombre = nombreT.getText().toString();
        String datos = datosT.getText().toString();

        try{
            File tarjetaSD = Environment.getExternalStorageDirectory();
            Toast.makeText(this, tarjetaSD.getPath(), Toast.LENGTH_SHORT);
            File rutaArchivo = new File(tarjetaSD.getPath(), nombre);
            OutputStreamWriter crearArchivo = new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));

            crearArchivo.write(datos);
            crearArchivo.flush();
            crearArchivo.close();

            nombreT.setText("");
            datosT.setText("");

            Toast.makeText(this, "Guardado correctamente", Toast.LENGTH_SHORT).show();

        }catch (IOException e){
            Toast.makeText(this, "No se pudo guardar", Toast.LENGTH_SHORT).show();

        }
    }

    public void consultar(View view){

        String nombre = nombreT.getText().toString();
        String datos = datosT.getText().toString();
        try {
            File tarjetaSD = Environment.getExternalStorageDirectory();
            File rutaArchivo = new File(tarjetaSD.getPath(), nombre);

            InputStreamReader abrirArchivo = new InputStreamReader(openFileInput(nombre));

            BufferedReader leerArchivo = new BufferedReader(abrirArchivo);
            String linea = leerArchivo.readLine();
            String contenidoCompleto = "";

                while(linea!=null){
                    contenidoCompleto = contenidoCompleto + linea + "\n";
                    linea = leerArchivo.readLine();
                }
        leerArchivo.close();
        abrirArchivo.close();
        datosT.setText(contenidoCompleto);
        }catch (IOException t){
            Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_SHORT).show();
        }
    }


}