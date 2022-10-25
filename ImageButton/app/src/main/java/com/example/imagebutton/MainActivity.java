package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensajeGeekepedia(View view){
        Toast.makeText(this,"La gueekepedia de ernesto" , Toast.LENGTH_SHORT).show();
    }
    public void mensajeMano(View view){
        Toast.makeText(this,"LA MANO DE DIOS" , Toast.LENGTH_SHORT).show();
    }
}