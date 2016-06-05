package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Actividad04_Realizar_Prueba extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04__realizar__prueba);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rbFacil);
                RadioButton rb2 = (RadioButton) findViewById(R.id.rbMedio);
                RadioButton rb3 = (RadioButton) findViewById(R.id.rbDificil);
                Preguntas vg = Preguntas.getInstance();
                if (rb1.isChecked()) {
                    vg.setNivel(10);
                }
                if (rb2.isChecked()) {
                    vg.setNivel(20);
                }
                if (rb3.isChecked()) {
                    vg.setNivel(40);
                }
                Intent intento = new Intent(getApplicationContext(), Actividad08_Pregunta.class);
                startActivity(intento);
            }
        });


    }

}
