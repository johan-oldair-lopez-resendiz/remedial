/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author remix
 */
public class Lista {

    Nodo inicio;
    Nodo fin;

    public Lista() {

        inicio = fin = null;
    }

    public void agregarNodoFinal(String dato) {
        Nodo nuevo = new Nodo(dato, null);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;

        }

    }

    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getPalabra());
            aux = aux.getSiguiente();
        }
    }

    public String leerArchivo(String path) {

        String total = "";
        try {
            FileReader fr = new FileReader(new File(path));

            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while ((linea = br.readLine()) != null) {
                total = total + linea + "\n";
            }

        } catch (FileNotFoundException e) {

            System.out.println("Problemas de archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problemas en la lectura del archivo: " + e.getMessage());
        }

        return total;
    }

    public Lista separar(String total) {
        System.out.println(total);
        Lista coleccion = new Lista();
        StringTokenizer st = new StringTokenizer(total, " \n,");
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            coleccion.agregarNodoFinal(palabra);
        }
        return coleccion;

    }
}
