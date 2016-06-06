package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manual extends Base {

    private static int pos = 0;
    private static String[] imagenes = new String[224];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cargarImangenes();

        findViewById(R.id.btnanterior).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if (pos != 0) {
                    ImageView iVPre = (ImageView) findViewById(R.id.imageView3);
                    String aux = imagenes.get(pos);
                    Mensaje(imagenes.get(pos));
                    int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
                    iVPre.setImageResource(res_imagen);
                }
            }
        });

        Button btnsiguiente = (Button) findViewById(R.id.btnsiguiente);
        //Programamos el evento onclick
        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                next();
            }
        });

        findViewById(R.id.btnregresar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Manual.this, Actividad02.class));
            }
        });
    }

    public void next(){
        //pos++;
        if (pos != 224) {
            ImageView iVPre = (ImageView) findViewById(R.id.imageView3);
            String aux = "a";
            Mensaje(pos + "");
            if(pos != 0){
                aux = aux + pos;
            }
            int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
            Mensaje(res_imagen + "");
            iVPre.setImageResource(res_imagen);
        }
    }

    public void cargarImangenes() {
        imagenes.add("a");
        imagenes.add("a1");
        imagenes.add("a2");
    }

}
