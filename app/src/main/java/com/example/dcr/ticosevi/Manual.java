package com.example.dcr.ticosevi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Manual extends AppCompatActivity {

    private static int pos = 0;
    private static String[] imagenes = new String[224];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cargarImagenes();

        findViewById(R.id.btnsiguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if (pos <= 224) {
                    ImageView iVPre = (ImageView) findViewById(R.id.imageView3);
                    String aux = imagenes[pos];
                    int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
                    iVPre.setImageResource(res_imagen);
                }
            }
        });
    }

    public void cargarImagenes() {
        imagenes[0] = "a1";
        imagenes[1] = "a2";
    }

}
