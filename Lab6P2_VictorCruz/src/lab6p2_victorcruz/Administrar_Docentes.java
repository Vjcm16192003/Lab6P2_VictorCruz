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
public class Administrar_Docentes {
    private ArrayList<Docentes> listaDocentes = new ArrayList();
    private File archivo = null;
//Constructor
    public Administrar_Docentes(String path) {
        archivo= new File(path);
    }
    //Mutador

    public ArrayList<Docentes> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(ArrayList<Docentes> listaDocentes) {
        this.listaDocentes = listaDocentes;
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
        return "Lista Docentes: " + listaDocentes ;
    }
    //Metodos Administrativos
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Docentes t : listaDocentes) {
                /*
                private String Titulo;
    private String Titulo_post;
    private int cant_clases;
    private String facultad;
                */
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getTitulo_post()+ ";");
                bw.write(t.getCant_clases()+ ";");
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
        listaDocentes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaDocentes.add(new Docentes(sc.next(),
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
