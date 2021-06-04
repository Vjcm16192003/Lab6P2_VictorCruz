/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_victorcruz;

import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Docentes extends Personas {
     private String Titulo;
    private String Titulo_post;
    private int cant_clases;
    private String facultad;
    private ArrayList<Proyectos>p=new ArrayList();

    public Docentes(String Titulo, String Titulo_post, int cant_clases, String facultad, String nom, String apellido, String num_registro, String username, String password) {
        super(nom, apellido, num_registro, username, password);
        this.Titulo = Titulo;
        this.Titulo_post = Titulo_post;
        this.cant_clases = cant_clases;
        this.facultad = facultad;
    }

    public Docentes(String Titulo, String Titulo_post, int cant_clases, String facultad) {
        this.Titulo = Titulo;
        this.Titulo_post = Titulo_post;
        this.cant_clases = cant_clases;
        this.facultad = facultad;
    }
    
    

    public Docentes() {
    super();
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTitulo_post() {
        return Titulo_post;
    }

    public void setTitulo_post(String Titulo_post) {
        this.Titulo_post = Titulo_post;
    }

    public int getCant_clases() {
        return cant_clases;
    }

    public void setCant_clases(int cant_clases) {
        this.cant_clases = cant_clases;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Proyectos> getP() {
        return p;
    }

    public void setP(ArrayList<Proyectos> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Docentes:  " + "Titulo: " + Titulo + " , Titulo de postgrado: " + Titulo_post + " , cantidad de clases: " + cant_clases + " , Facultad: " + facultad + " , Lista de Proyectos: " + p;
    }
    
    
    
    
}
