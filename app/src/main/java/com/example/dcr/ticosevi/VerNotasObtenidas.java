package com.example.dcr.ticosevi;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VerNotasObtenidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_notas_obtenidas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button MiButton = (Button) findViewById(R.id.btnpuntos);
        MiButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View arg0) {
                notaObtenida();
            }

        });

    }

    public void Mensaje(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    };

    public String notaObtenida(){
        Preguntas vg = Preguntas.getInstance();
        String[] notasAltas= new String[30];
        String res="";

        for (int i=0; i<=vg.getBuenas();i++){
            res=notasAltas[i];
            Mensaje("La nota es: "+res);
        }
        return res;
    }

   /* //Colocar en la clase Base
    DBAdapter db;

    public void CrearBD() {
        db = new DBAdapter(this);
        db = new DBAdapter(this);
    }

    public void Mensaje(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    };

    public void AgregarDato() {
        Preguntas vg = Preguntas.getInstance();
        String nota = vg.getBuenas()+"";
        db.open();
        if (db.insertDato(nota) >= 0){
            Mensaje("La nota es: "+nota);
        }
        db.close();
    }
    public void ObtenerDatos() {
        //--cargamos todos los datos---
        db.open();
        Cursor c = db.CargarTodosLosDatos();
        if (c.moveToFirst())
        {
            do {
                MostarDato(c);
            } while (c.moveToNext());
        }
        db.close();
    }
    public void ObtenerDato() {
        //---cargar un contacto ---
        db.open();
        Cursor c = db.ObtenerDato(2);
        if (c.moveToFirst())
            MostarDato(c);
        else
            Mensaje("No se encontró el dato");
        db.close();
    }
    public void ActualizarDato() {
        //---update a contact---
        db.open();
        if (db.ActualizarDato(1, "Juan Félix Avila", "Alajuela, Costa Rica"))
            Mensaje("Se actualizó a JF");
        else
            Mensaje( "Fallo al actualizar JF");
        db.close();
    }
    public void BorrarDato() {
        db.open();
        if (db.BorrarDato(1))
            Mensaje("Borrado exitoso");
        else
            Mensaje("Fallo al intentar borrar");
        db.close();
    }
    public void MostarDato(Cursor c)
    {
        Mensaje("id: " + c.getString(0) + "\n" +
                "Nombre: " + c.getString(1) + "\n" +
                "Dir:  " + c.getString(2));
    }*/

}
