package com.example.scrollingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void seleccion(View view){
        switch (view.getId()){
            case R.id.bananas:
                Toast.makeText(this, "Son Bananas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cerezas:  Toast.makeText(this, "Son cerezas", Toast.LENGTH_SHORT).show(); break;
            case R.id.frambuesas:  Toast.makeText(this, "Son frambuesas", Toast.LENGTH_SHORT).show(); break;
            case R.id.fresas:  Toast.makeText(this, "Son fresas", Toast.LENGTH_SHORT).show(); break;
            case R.id.kiwis:  Toast.makeText(this, "Son kiwis", Toast.LENGTH_SHORT).show(); break;
            case R.id.mangos:  Toast.makeText(this, "Son mangos", Toast.LENGTH_SHORT).show(); break;
            case R.id.manzanas:  Toast.makeText(this, "Son manzanas", Toast.LENGTH_SHORT).show(); break;
            case R.id.melon:  Toast.makeText(this, "Son melones", Toast.LENGTH_SHORT).show(); break;
            case R.id.naranjas:  Toast.makeText(this, "Son naranjas", Toast.LENGTH_SHORT).show(); break;
            case R.id.pera:  Toast.makeText(this, "Son peras", Toast.LENGTH_SHORT).show(); break;
            case R.id.pina:  Toast.makeText(this, "Son pinas", Toast.LENGTH_SHORT).show(); break;
            case R.id.sandia:  Toast.makeText(this, "Son sandias", Toast.LENGTH_SHORT).show(); break;
            case R.id.uvas:  Toast.makeText(this, "Son uvas", Toast.LENGTH_SHORT).show(); break;
            case R.id.zarzamora:  Toast.makeText(this, "Son zarzamoras", Toast.LENGTH_SHORT).show(); break;


        }
    }
}