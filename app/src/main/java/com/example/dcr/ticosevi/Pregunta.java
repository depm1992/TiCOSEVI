package com.example.dcr.ticosevi;

public class Pregunta {

    private int Numero;// de pregunta (Unico)->int
    private String Pregunta;// -> String
    private String imagen;//Path de imagen -> String Dice N/D no hada
    private String[] respuestas = new String[3];//Respuestas 3 -> String N/D di no aplica
    private String correcta;//Respuesta Correcta -> String

    public Pregunta(){
        this.Numero = 0;
        this.Pregunta = "Pregunta Vacia";
        this.imagen = "N/D";
        this.respuestas[0] = "Respesta vacia 1";
        this.respuestas[1] = "Respesta vacia 2";
        this.respuestas[2] = "Respesta vacia 3";
        this.correcta = "Respesta vacia 1";
    }

    public Pregunta(int n, String pre, String ima, String pre1, String pre2, String pre3, String co){
        this.Numero = n;
        this.Pregunta = pre;
        this.imagen = ima;
        this.respuestas[0] = pre1;
        this.respuestas[1] = pre2;
        this.respuestas[2] = pre3;
        this.correcta = co;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getRespuestas(int i) {
        return respuestas[i];
    }

    public void setRespuestas(int i, String respuestas) {
        this.respuestas[i] = respuestas;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
}
