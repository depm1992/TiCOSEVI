package com.example.dcr.ticosevi;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad10_Estudiar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad10__estudiar);


        OnclickDelButton(R.id.btnManual);
        OnclickDelButton(R.id.btnVideos);
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

                    case R.id.btnManual:
                        Intent intento = new Intent(getApplicationContext(), Manual.class);
                        startActivity(intento);
                        break;

                    case R.id.btnVideos:
                        intento = new Intent(getApplicationContext(), Actividad07_Videos.class);
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

