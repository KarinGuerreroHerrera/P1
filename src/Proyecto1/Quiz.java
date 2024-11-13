package Proyecto1;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int id;  
    private List<String> preguntas;       
    private List<String> respuestasCorrectas;
    private double calificacionMinima;    

    public Quiz(int id, double calificacionMinima) {
        this.id = id;  // Asigna el ID al inicializar
        this.preguntas = new ArrayList<>();
        this.respuestasCorrectas = new ArrayList<>();
        this.calificacionMinima = calificacionMinima;
    }

    public int getId() {  
        return id;
    }

    public void agregarPregunta(String pregunta, String respuestaCorrecta) {
        preguntas.add(pregunta);
        respuestasCorrectas.add(respuestaCorrecta);
    }

    public boolean esAprobado(double puntajeObtenido) {
        return puntajeObtenido >= calificacionMinima;
    }

    public List<String> getPreguntas() {
        return preguntas;
    }

    public List<String> getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public double getCalificacionMinima() {
        return calificacionMinima;
    }
}