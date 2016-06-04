package com.example.dcr.ticosevi;

import java.util.ArrayList;

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
        Pregunta pre2 = new Pregunta(0, "Significa aumentar la contaminación de nuestro planeta, el consumo de combustible y atentar contra la salud:\n",
                "", "Comprobar el buen estado de los dispositivos del sistema de control de emisiones del motor.\n",
                "La alteración de los elementos de control de emisiones del motor.\n",
                "Conservar en el mejor estado o sustituir los componentes del sistema de control de emisiones del motor.\n",
                "La alteración de los elementos de control de emisiones del motor.");
        Pregunta pre3 = new Pregunta(1, "¿Es posible adelantar en una rotonda?", "", "Falso.",
                "Verdadero.", "", "Falso.");
        Pregunta pre4 = new Pregunta(2, "La imagen que se muestra corresponde a una señal de:", "limitelargo", "Información.",
                "Reglamentación.", "Prevención.", "Reglamentación.");
        Pregunta pre5 = new Pregunta(3, "Facilita el control de aceleración y potencia del motor dentro del rango que se determina como conducción económica y eficiente:",
                "", "El medidor de velocidad.", "El medidor de temperatura.", "El tacómetro.", "El tacómetro.");
        Pregunta pre6 = new Pregunta(4, "Cuál es un componente del sistema de escape?:",
                "", "Catalizador.", "Carburador.", "Bobina.", "Catalizador.");
        Pregunta pre7 = new Pregunta(5, "Se suspenderá la licencia a aquel conductor que en categoría común o profesional:",
                "", "Acumule 6 puntos.", "Acumule 12 puntos o más.", "Acumule 6 puntos o más.", "Acumule 12 puntos o más.");
        Pregunta pre8 = new Pregunta(6, "En las curvas:", "", "Durante la noche utilizar la luz alta para tener mayor visibilidad.",
                "Nunca se debe adelantar y se debe mantener el mismo carril.", "Se debe mantener la velocidad con la que se ingresó.",
                "Nunca se debe adelantar y se debe mantener el mismo carril.");
        Pregunta pre9 = new Pregunta(7, "Además de aire y calor(chispa), que más se necesita para que el motor funcione:", "",
                "Agua.", "Aceite.", "Combustible.", "Combustible.");
        Pregunta pre10 = new Pregunta(8, "Son elementos físicos que se utilizan en la regulación del tránsito. Sirven para que el usuario, guiándose por sus indicaciones, se comporte con corrección y seguridad en las vías, disminuyendo así el riesgo de que ocurran accidentes.\n", "",
                "Las señales.", "Líneas en la calzada (de centro, de vía, de barrera, de borde).", "Semáforos y capta luces.", "Las señales.");
        Pregunta pre11 = new Pregunta(9, "Asegurarse de las buenas condiciones del vehículo y del conductor es una norma primordial que se debe observar y cumplir:", "",
                "Cuando se ha iniciado la marcha en carretera.", "Antes de iniciar la circulación.", "Después de iniciada la circulación vehicular.", "Antes de iniciar la circulación.");
        Pregunta pre12 = new Pregunta(10, "La imagen que se muestra corresponde a una señal de:", "obras",
                "Información general.", "Prevención de obras.", "Recomendación.", "Prevención de obras.");
        Pregunta pre13 = new Pregunta(11, "La imagen que se muestra corresponde a una señal de:", "prevencion",
                "Prevención de obras.", "Prevención.", "Información.", "Prevención.");
        Pregunta pre14 = new Pregunta(12, "¿Para obtener una licencia de conducir clase C se necesita haber obtenido la aprobación del Curso Básico de Educación Vial para Transporte Público?", "",
                "Verdadero.", "Falso.", "", "Verdadero.");
        this.preguntas.add(pre1);
        this.preguntas.add(pre2);
        this.preguntas.add(pre3);
        this.preguntas.add(pre4);
        this.preguntas.add(pre5);
        this.preguntas.add(pre6);
        this.preguntas.add(pre7);
        this.preguntas.add(pre8);
        this.preguntas.add(pre9);
        this.preguntas.add(pre10);
        this.preguntas.add(pre11);
        this.preguntas.add(pre12);
        this.preguntas.add(pre13);
        this.preguntas.add(pre14);

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
