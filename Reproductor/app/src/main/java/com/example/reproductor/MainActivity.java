package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button playOpause;
    ImageButton btnRepetir;
    ImageView iv;
    int repetir = 2;
    int posicion = 0;


    MediaPlayer vectormp [] = new MediaPlayer[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playOpause = (Button)findViewById(R.id.btnPlay);
        btnRepetir = (ImageButton)findViewById(R.id.btnRepetir);
        iv = (ImageView)findViewById(R.id.imageView);

        vectormp[0] = MediaPlayer.create(this, R.raw.race);
        vectormp[1] = MediaPlayer.create(this, R.raw.sound);
        vectormp[2] = MediaPlayer.create(this, R.raw.tea);



    }

    //Metodo para el boton playpause

    public void playPause (View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            playOpause.setBackgroundResource(R.drawable.reproducir);
            Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show();
        }else{
            vectormp[posicion].start();
            playOpause.setBackgroundResource(R.drawable.pausa);
            Toast.makeText(this, "Playing", Toast.LENGTH_SHORT).show();
        }
    }


    public void stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0] = MediaPlayer.create(this, R.raw.race);
            vectormp[1] = MediaPlayer.create(this, R.raw.sound);
            vectormp[2] = MediaPlayer.create(this, R.raw.tea);

            posicion = 0;
            playOpause.setBackgroundResource(R.drawable.reproducir);
            iv.setImageResource(R.drawable.portada1);
            Toast.makeText(this, "Stopped.", Toast.LENGTH_SHORT).show();

        }
    }


    public void repetir(View view){
                if(repetir == 1){
                    btnRepetir.setBackgroundResource(R.drawable.no_repetir);
                    Toast.makeText(this, "No Repetir", Toast.LENGTH_SHORT).show();
                    vectormp[posicion].setLooping(false);
                    repetir = 2;
                } else{
                    btnRepetir.setBackgroundResource(R.drawable.repetir);
                    Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
                    vectormp[posicion].setLooping(true);
                    repetir = 1;
                }
    }

    //Método para saltar a la siguiente canción.
    public void siguiente(View view){
        if(posicion < vectormp.length -1){

            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }

            } else {
                posicion++;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }


    //Método para regresar a la canción anterior
    public void anterior(View view){
        if(posicion >= 1){

            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0] = MediaPlayer.create(this, R.raw.race);
                vectormp[1] = MediaPlayer.create(this, R.raw.sound);
                vectormp[2] = MediaPlayer.create(this, R.raw.tea);
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }

                vectormp[posicion].start();

            } else {
                posicion--;

                if(posicion == 0){
                    iv.setImageResource(R.drawable.portada1);
                } else if(posicion == 1){
                    iv.setImageResource(R.drawable.portada2);
                }else if(posicion == 2){
                    iv.setImageResource(R.drawable.portada3);
                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }




}