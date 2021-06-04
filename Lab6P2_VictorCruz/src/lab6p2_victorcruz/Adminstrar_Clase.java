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
public class Adminstrar_Clase {
    private ArrayList<Clases> listaClases = new ArrayList();
    private File archivo = null;
//Constructor
    public Adminstrar_Clase(String path) {
        archivo= new File(path);
    }
    //Mutador

    public ArrayList<Clases> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clases> listaClases) {
        this.listaClases = listaClases;
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
        return "Lista Clases: " + listaClases ;
    }
    //Metodos Administrativos
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clases t : listaClases) {
                /*
                 private String nom;
    private String sec;
    private int codigo;
    private int codigo_carrera;
    private int cant_max;
    private int num_aula;
                */
                bw.write(t.getNom()+ ";");
                bw.write(t.getSec()+ ";");
                bw.write(t.getCodigo()+ ";");
                bw.write(t.getCodigo_carrera()+ ";");
                bw.write(t.getCant_max()+ ";");
                bw.write(t.getNum_aula()+ ";");
                
                
                
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaClases = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaClases.add(new Clases(sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }//fin del metodo cargar Archivo
}
