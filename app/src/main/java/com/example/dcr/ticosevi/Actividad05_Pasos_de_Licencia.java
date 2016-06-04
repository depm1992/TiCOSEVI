package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Actividad05_Pasos_de_Licencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad05__pasos_de__licencia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // alambramos el Button
        Button MiButton = (Button) findViewById(R.id.btnok);

        //Programamos el evento onclick

        MiButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View arg0) {

                Intent intento = new Intent(getApplicationContext(), Actividad02.class);
                startActivity(intento);

            }

        });
    }

}
