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
public class Clases {
     private String nom;
    private String sec;
    private int codigo;
    private int codigo_carrera;
    private int cant_max;
    private int num_aula;
    ArrayList<Proyectos>proyectos =new ArrayList();
    ArrayList<Alumnos>alumnos =new ArrayList();

    public Clases(String nom, String sec, int codigo, int codigo_carrera, int cant_max, int num_aula) {
        this.nom = nom;
        this.sec = sec;
        this.codigo = codigo;
        this.codigo_carrera = codigo_carrera;
        this.cant_max = cant_max;
        this.num_aula = num_aula;
    }

    public Clases() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public int getCant_max() {
        return cant_max;
    }

    public void setCant_max(int cant_max) {
        this.cant_max = cant_max;
    }

    public int getNum_aula() {
        return num_aula;
    }

    public void setNum_aula(int num_aula) {
        this.num_aula = num_aula;
    }

    public ArrayList<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Clases" + ", nombre: " + nom + " , seccion: " + sec + " , Codigo: " + codigo + " , Codigo de Carrera: " + codigo_carrera + " , Cantidad max: " + cant_max + " , numero de Aula: " + num_aula + " , Lista de proyectos: " + proyectos + " , Lista de alumnos: " + alumnos;
    }
    
    
    
}
