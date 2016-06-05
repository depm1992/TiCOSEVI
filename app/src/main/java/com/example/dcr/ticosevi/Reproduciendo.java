package com.example.dcr.ticosevi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Reproduciendo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproduciendo);

        // alambramos el boton

        Button MiBoton = (Button) findViewById(R.id.btnVolver);

        //Programamos el evento onclick

        MiBoton.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View arg0) {

                Intent intento = new Intent(getApplicationContext(), Actividad07_Videos.class);
                startActivity(intento);


            }

        });

        ReproducirVideoEnrawCinturon();
        PararReproducionVideoEnraw();

    }


    public void ReproducirVideoEnrawCinturon() {
        VideoView videoView = (VideoView)findViewById(R.id.pantalla);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +
                R.raw.cinturon));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }

    public void PararReproducionVideoEnraw() {
        VideoView videoView = (VideoView)findViewById(R.id.pantalla);
        videoView.stopPlayback();
    }

}
