/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_victorcruz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Administrar_Alumnos {
    private ArrayList<Alumnos> listaAlumnos = new ArrayList();
    private File archivo = null;
//Constructor
    public Administrar_Alumnos(String path) {
        archivo= new File(path);
    }
    //Mutador

    public ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumnos> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //ToString

    @Override
    public String toString() {
        return "Lista Alumnos: " + listaAlumnos ;
    }
    //Metodos Administrativos
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumnos t : listaAlumnos) {
                
                bw.write(t.getEdad()+ ";");
                bw.write(t.getID()+ ";");
                bw.write(t.getCarrera()+ ";");
                bw.write(t.getA_carrera()+ ";");
                bw.write(t.getPromedio()+ ";");
                bw.write(t.getFacultad()+ ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaAlumnos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaAlumnos.add(new Alumnos(sc.nextInt(),
                                    sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextDouble(),
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }//fin del metodo cargar Archivo
}
