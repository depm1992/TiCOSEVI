package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Actividad08_Pregunta extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad08__pregunta);

        Mensaje("El Nivel es: " + getNivel());

        Button btnRregresar = (Button) findViewById(R.id.btnRregresar);
        btnRregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intento = new Intent(getApplicationContext(), Actividad01.class);
                startActivity(intento);
            }
        });

        //fin de oncreate
    }

}
