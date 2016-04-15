package com.example.dcr.ticosevi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Actividad04_Realizar_Prueba extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04__realizar__prueba);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new
                                                      RadioGroup.OnCheckedChangeListener() {
                                                          public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                              RadioButton rb1 = (RadioButton) findViewById(R.id.rbFacil);
                                                              RadioButton rb2 = (RadioButton) findViewById(R.id.rbMedio);
                                                              RadioButton rb3 = (RadioButton) findViewById(R.id.rbDificil);
                                                              if (rb1.isChecked()) {

                                                                  //Intent intento = new Intent(getApplicationContext(), Pregunta01.class);
                                                                  //startActivity(intento);
                                                              }
                                                              if (rb2.isChecked()) {
                                                                  //Intent intento = new Intent(getApplicationContext(), Pregunta21.class);
                                                                  //startActivity(intento);
                                                              }
                                                              if (rb3.isChecked()) {
                                                                  //Mensaje("tres");
                                                              }
                                                          }
                                                      });
    }

}
