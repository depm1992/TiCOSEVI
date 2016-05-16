package com.example.dcr.ticosevi;

import java.util.ArrayList;

/**
 * Created by dCR on 15/05/2016.
 */
public class Preguntas {

    private static Preguntas instance = null;
    private int nivel = 0;//1 -> 10, 2-> 20, 3-> 40
    private ArrayList<Pregunta> preguntas = new ArrayList<>(); //el array debe ser de obejtos preguta o de lo que se cargue de la base de datos
    private int buenas = 0;
    private int malas = 0;
    private int estado = 0;

    protected Preguntas(){
    }

    public static Preguntas getInstance() {
        if(instance == null) {
            instance = new Preguntas();
            instance.cargarPrueba();
        }
        return instance;
    }

    public void cargarPrueba(){
        Pregunta pre1 = new Pregunta();
        Pregunta pre2 = new Pregunta(0, "Pregunta 2", "p", "Respuesta pregunta 2.1", "Respuesta pregunta 2.2", "Respuesta pregunta 2.3", "Respuesta pregunta 2.1");
        this.preguntas.add(pre1);
        this.preguntas.add(pre2);

    }

    public int getSize(){
        return this.preguntas.size();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pregunta getPregunta(int i) {
        return preguntas.get(i);
    }


    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        preguntas = preguntas;
    }

    public int getBuenas() {
        return buenas;
    }

    public void setBuenas(int buenas) {
        this.buenas = buenas;
    }

    public int getMalas() {
        return malas;
    }

    public void setMalas(int malas) {
        this.malas = malas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
