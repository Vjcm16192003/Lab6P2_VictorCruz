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
public class Administrar_Proyectos {
    private ArrayList<Proyectos> listaProyectos = new ArrayList();
    private File archivo = null;
//Constructor
    public Administrar_Proyectos(String path) {
        archivo= new File(path);
    }
    //Mutador

    public ArrayList<Proyectos> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(ArrayList<Proyectos> listaProyectos) {
        this.listaProyectos = listaProyectos;
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
        return "Lista Proyectos: " + listaProyectos ;
    }
    //Metodos Administrativos
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyectos t : listaProyectos) {
                /*
                private String titulo;
    private String descrip;
    private int punta;
    private int dificultad;
    private String tiempo;
    private int cant_max;
    private String fecha;
                */
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getDescrip()+ ";");
                bw.write(t.getPunta()+ ";");
                bw.write(t.getDificultad()+ ";");
                bw.write(t.getTiempo()+ ";");
                bw.write(t.getCant_max()+ ";");
                bw.write(t.getFecha()+ ";");
                
                
                
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProyectos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProyectos.add(new Proyectos(sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.next(),
                                    sc.nextInt(),
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
