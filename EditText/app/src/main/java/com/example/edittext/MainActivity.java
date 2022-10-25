package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText nombreT;
    private EditText passT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreT = (EditText)findViewById(R.id.name);
        passT = (EditText)findViewById(R.id.pass);

    }

    public void registrar(View view){

        String name = nombreT.getText().toString();
        String pass = passT.getText().toString();


        if(name.length()==0){
            Toast.makeText(this, "Debes introducir un nombre" , Toast.LENGTH_LONG).show();
        }
        if(pass.length()==0){
            Toast.makeText(this, "Debes introducir una password" , Toast.LENGTH_LONG).show();
        }
        if(pass.length()!=0 && name.length()!=0){
            Toast.makeText(this, "Registro en proceso..." , Toast.LENGTH_LONG).show();
        }
    }
}