/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Proyectos {
    private String titulo;
    private String descrip;
    private int punta;
    private int dificultad;
    private String tiempo;
    private int cant_max;
    private String fecha;

    public Proyectos(String titulo, String descrip, int punta, int dificultad, String tiempo, int cant_max, String fecha) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.punta = punta;
        this.dificultad = dificultad;
        this.tiempo = tiempo;
        this.cant_max = cant_max;
        this.fecha = fecha;
    }

    public Proyectos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPunta() {
        return punta;
    }

    public void setPunta(int punta) {
        this.punta = punta;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getCant_max() {
        return cant_max;
    }

    public void setCant_max(int cant_max) {
        this.cant_max = cant_max;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Proyectos" + ", Titulo: " + titulo + " , Descripcion: " + descrip + " , Puntaje: " + punta + " , Dificultad: " + dificultad + " , Tiempo: " + tiempo + " , cantidad maxima: " + cant_max + " , fecha de entrega" + fecha;
    }
    
    
}
