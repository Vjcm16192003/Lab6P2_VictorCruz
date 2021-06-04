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
public class Administrar_Personas {
    private ArrayList<Personas> listaPersonas = new ArrayList();
    private File archivo = null;
//Constructor
    public Administrar_Personas(String path) {
        archivo= new File(path);
    }
    //Mutador

    public ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Personas> listaPersonas) {
        this.listaPersonas = listaPersonas;
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
        return "Lista Personas: " + listaPersonas ;
    }
    //Metodos Administrativos
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Personas t : listaPersonas) {
                bw.write(t.getNom()+ ";");
                bw.write(t.getApellido()+ ";");
                bw.write(t.getNum_registro()+ ";");
                bw.write(t.getUsername()+ ";");
                bw.write(t.getPassword() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Personas(sc.next(),
                                    sc.next(),
                                    sc.next(),
                                    sc.next(),
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }//fin del metodo cargar Archivo
}//fin de la clase
