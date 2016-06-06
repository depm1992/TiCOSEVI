package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Actividad09_Resultado extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad09__resultado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Preguntas vg = Preguntas.getInstance();
        TextView tVBuenas = (TextView) findViewById(R.id.textView27);
        tVBuenas.setText(vg.getBuenas() + "");


                //vg.getBuenas();


        findViewById(R.id.button34).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Preguntas vg = Preguntas.getInstance();
                vg.reiniciar();

                startActivity(new Intent(Actividad09_Resultado.this, Actividad02.class));
            }
        });
    }

}
