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
public class Personas {
     private String nom;
    private String apellido;
    private String num_registro;
    private String username;
    private String password;

    public Personas(String nom, String apellido, String num_registro, String username, String password) {
        this.nom = nom;
        this.apellido = apellido;
        this.num_registro = num_registro;
        this.username = username;
        this.password = password;
    }

    public Personas() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(String num_registro) {
        this.num_registro = num_registro;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
