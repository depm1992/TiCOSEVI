package com.example.dcr.ticosevi;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by dCR on 14/04/2016.
 */
public class Base extends AppCompatActivity {
    private static int nivel;//1 -> 10, 2-> 20, 3-> 40
    private static ArrayList<Pregunta> preguntas; //el array debe ser de obejtos preguta o de lo que se cargue de la base de datos
    private static int buenas;
    private static int malas;
    private static int estado;

    public static int getNivel() {
        return nivel;
    }

    public static void setNivel(int nivel) {
        Base.nivel = nivel;
    }

    public static ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public static void setPreguntas(ArrayList<Pregunta> preguntas) {
        Base.preguntas = preguntas;
    }

    public static int getBuenas() {
        return buenas;
    }

    public static void setBuenas(int buenas) {
        Base.buenas = buenas;
    }

    public static int getMalas() {
        return malas;
    }

    public static void setMalas(int malas) {
        Base.malas = malas;
    }

    public static int getEstado() {
        return estado;
    }

    public static void setEstado(int estado) {
        Base.estado = estado;
    }


    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
