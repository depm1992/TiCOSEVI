package com.example.dcr.ticosevi;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Actividad08_Pregunta extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad08__pregunta);

        Preguntas vg = Preguntas.getInstance();
        Mensaje("El Nivel es: " + vg.getNivel());

        Button btnRregresar = (Button) findViewById(R.id.btnRregresar);
        btnRregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intento = new Intent(getApplicationContext(), Actividad01.class);
                startActivity(intento);
            }
        });

        TextView tVPregunta = (TextView) findViewById(R.id.tVPregunta);
        int num = vg.getEstado() + 1;
        Pregunta pre = vg.getPregunta(vg.getEstado());
        tVPregunta.setText(num + ". " + pre.getPregunta());

        TextView tVBuenas = (TextView) findViewById(R.id.tVBuenas);
        tVBuenas.setText(vg.getBuenas() + "");

        TextView tVMalas = (TextView) findViewById(R.id.tVMalas);
        tVMalas.setText(vg.getMalas() + "");

        ProgressBar proge = (ProgressBar) findViewById(R.id.proBarPregunta);
        proge.setProgress((int) (vg.getEstado() * 100 / vg.getSize()));
        //int color = 0xFF00FF00;
        //proge.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        //proge.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);

        if (!pre.getImagen().equals("N/D")) {
            ImageView iVPre = (ImageView) findViewById(R.id.iVPregunta);
            String aux = pre.getImagen();
            int res_imagen = getResources().getIdentifier(aux, "drawable", getPackageName());
            iVPre.setImageResource(res_imagen);
        }

        if (!pre.getRespuestas(0).equals("N/D")) {
            RadioButton rb1 = (RadioButton) findViewById(R.id.rbRes1);
            rb1.setText(pre.getRespuestas(0));
            rb1.setVisibility(View.VISIBLE);
        }

        if (!pre.getRespuestas(1).equals("N/D")) {
            RadioButton rb2 = (RadioButton) findViewById(R.id.rbRes2);
            rb2.setText(pre.getRespuestas(1));
            rb2.setVisibility(View.VISIBLE);
        }

        if (!pre.getRespuestas(2).equals("N/D")) {
            RadioButton rb2 = (RadioButton) findViewById(R.id.rbRes3);
            rb2.setText(pre.getRespuestas(2));
            rb2.setVisibility(View.VISIBLE);
        }


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGPreguntas);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rbRes1);
                RadioButton rb2 = (RadioButton) findViewById(R.id.rbRes2);
                RadioButton rb3 = (RadioButton) findViewById(R.id.rbRes3);
                Preguntas vg = Preguntas.getInstance();
                Pregunta pre = vg.getPregunta(vg.getEstado());
                if (rb1.isChecked()) {
                    if (pre.getRespuestas(0).equals(pre.getCorrecta())) {
                        vg.setBuenas(vg.getBuenas() + 1);
                    } else {
                        vg.setMalas(vg.getMalas() + 1);
                    }
                }
                if (rb2.isChecked()) {
                    if (pre.getRespuestas(1).equals(pre.getCorrecta())) {
                        vg.setBuenas(vg.getBuenas() + 1);
                    } else {
                        vg.setMalas(vg.getMalas() + 1);
                    }
                }

                if (rb3.isChecked()) {
                    if (pre.getRespuestas(2).equals(pre.getCorrecta())) {
                        vg.setBuenas(vg.getBuenas() + 1);
                    } else {
                        vg.setMalas(vg.getMalas() + 1);
                    }
                }
                vg.setEstado(vg.getEstado() + 1);
                Intent intento = new Intent(getApplicationContext(), Actividad08_Pregunta.class);
                startActivity(intento);
            }
        });
        //fin de oncreate

        //fin onCreate
    }

}
