package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Actividad06_Estudiar_Manual extends Base {

    private static int pos = 0;
    private static String[] imagenes = new String[224];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad06__estudiar__manual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cargarImangenes();

        findViewById(R.id.btnanterior).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if (pos != 0) {
                    ImageView iVPre = (ImageView) findViewById(R.id.iVEstudiarManual);
                    String aux = imagenes[pos];
                    int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
                    iVPre.setImageResource(res_imagen);
                }
            }
        });

        findViewById(R.id.btnsiguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (pos != 224) {
                    ImageView iVPre = (ImageView) findViewById(R.id.iVEstudiarManual);
                    String aux = imagenes[pos];
                    int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
                    iVPre.setImageResource(res_imagen);
                }
            }
        });

        findViewById(R.id.btnregresar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Actividad06_Estudiar_Manual.this, Actividad02.class));
            }
        });
    }

    public void cargarImangenes() {
        imagenes[0] = "a1";
        imagenes[1] = "a2";
    }
}
