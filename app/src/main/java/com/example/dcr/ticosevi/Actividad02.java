package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Actividad02 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        OnclickDelButton(R.id.button4);
        OnclickDelButton(R.id.button6);
        OnclickDelButton(R.id.button8);
        OnclickDelButton(R.id.button5);
        OnclickDelButton(R.id.button7);
        //OnclickDelButton(R.id.button5);

    }

    public void OnclickDelButton(int ref) {

        // Ejemplo  OnclickDelButton(R.id.MiButton);
        // 1 Doy referencia al Button
        View view =findViewById(ref);
        Button miButton = (Button) view;
        //  final String msg = miButton.getText().toString();
        // 2.  Programar el evento onclick
        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if(msg.equals("Texto")){Mensaje("Texto en el botón ");};
                switch (v.getId()) {

                    case R.id.button4:
                        startActivity(new Intent(Actividad02.this, Actividad05_Pasos_de_Licencia.class));
                        break;

                    case R.id.button6:
                        startActivity(new Intent(Actividad02.this, Actividad04_Realizar_Prueba.class));
                        break;

                    case R.id.button8:
                        /*startActivity(new Intent(Actividad02.this, Actividad07_Mapa.class)); */
                        break;

                    case R.id.button5:
                        startActivity(new Intent(Actividad02.this, Actividad06_Estudiar_Manual.class));
                        break;
                    case R.id.button7:
                        startActivity(new Intent(Actividad02.this, VerNotasObtenidas.class));
                        break;
                   /* case R.id.Subutton5:
                        Mensaje("Implementar Button5");
                        break;
                        */
                    default:
                        break;
                }// fin de casos
            }// fin del onclick
            //
        });
    }// fin de OnclickDelButton

}
