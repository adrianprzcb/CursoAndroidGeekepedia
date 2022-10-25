package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Adrián" , "José" , "Juan", "Adrián" , "José" , "Juan" ,"Adrián" , "José" , "Juan",
            "Adrián" , "José" , "Juan" ,"Adrián" , "José" , "Juan"};
    private String edades [] = {"16" , "17" , "18" ,"16" , "17" , "18" ,"16" , "17" , "18",
            "16" , "17" , "18" ,"16" , "17" , "18"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.texto) ;
        lv1 = (ListView)findViewById(R.id.listview);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.listview_layout , nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i]);
            }
        });
    }
}