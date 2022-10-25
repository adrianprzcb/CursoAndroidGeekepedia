package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.mates);
        et2 = (EditText)findViewById(R.id.quimica);
        et3 = (EditText)findViewById(R.id.fisica);
        tv = (TextView)findViewById(R.id.status);
    }

    public void darStatus(View view){
        String matesString = et1.getText().toString();
        String quimicaString = et2.getText().toString();
        String fisicaString = et3.getText().toString();


        int matesInt = Integer.parseInt(matesString);
        int quimicaInt = Integer.parseInt(quimicaString);
        int fisicaInt = Integer.parseInt(fisicaString);

        int promedio = (matesInt + quimicaInt + fisicaInt) / 3 ;

        if(promedio >= 5){
            tv.setText("APROBADO con un " + promedio);
        }else if (promedio <=4){
            tv.setText("SUSPENSO con un " + promedio);
        }

    }
}