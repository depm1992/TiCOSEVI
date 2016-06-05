package com.example.dcr.ticosevi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad07_Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad07__videos);

        OnclickDelButton(R.id.btnCinturon);
        OnclickDelButton(R.id.btnMultas1);
        OnclickDelButton(R.id.btnMultas2);
        OnclickDelButton(R.id.btnSemaforo);
        OnclickDelButton(R.id.btnVolver);
    }

    public void OnclickDelButton(int ref) {

        // Ejemplo  OnclickDelButton(R.id.MiButton);
        // 1 Doy referencia al Button
        View view =findViewById(ref);
        Button miButton = (Button) view;
        //  final String msg = miButton.getText().toString();
        // 2.  Programar el evento onclick
        miButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // if(msg.equals("Texto")){Mensaje("Texto en el botón ");};
                switch (v.getId()) {

                    case R.id.btnCinturon:
                        Intent intento = new Intent(getApplicationContext(), Reproduciendo.class);
                        startActivity(intento);

                        break;

                    case R.id.btnMultas1:
                        intento = new Intent(getApplicationContext(), Reproduciendo3.class);
                        startActivity(intento);

                        break;

                    case R.id.btnMultas2:
                        intento = new Intent(getApplicationContext(), Reproduciendo4.class);
                        startActivity(intento);

                        break;

                    case R.id.btnSemaforo:
                        intento = new Intent(getApplicationContext(), Reproduciendo2.class);
                        startActivity(intento);

                        break;

                    case R.id.btnVolver:
                        intento = new Intent(getApplicationContext(), Actividad02.class);
                        startActivity(intento);

                        break;
                    default:break; }// fin de casos
            }// fin del onclick
        });
    }// fin de OnclickDelButton
}

