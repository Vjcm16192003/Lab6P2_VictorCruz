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
public class Alumnos extends Persona{
    private int edad;
    private String ID;
    private String carrera;
    private int a_carrera;
    private double promedio;
    private String facultad;

    public Alumnos(int edad, String ID, String carrera, int a_carrera, double promedio, String facultad, String nom, String apellido, String num_registro, String username, String password) {
        super(nom, apellido, num_registro, username, password);
        this.edad = edad;
        this.ID = ID;
        this.carrera = carrera;
        this.a_carrera = a_carrera;
        this.promedio = promedio;
        this.facultad = facultad;
    }

    public Alumnos(int edad, String ID, String carrera, int a_carrera, double promedio, String facultad) {
        this.edad = edad;
        this.ID = ID;
        this.carrera = carrera;
        this.a_carrera = a_carrera;
        this.promedio = promedio;
        this.facultad = facultad;
    }

    public Alumnos() {
    super();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getA_carrera() {
        return a_carrera;
    }

    public void setA_carrera(int a_carrera) {
        this.a_carrera = a_carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Alumnos" + ", edad: " + edad + " , ID: " + ID + " , Carrera: " + carrera + " , Años de carrera: " + a_carrera + " , Promedio: " + promedio + " , Facultad=" + facultad;
    }
    
    
    
}
