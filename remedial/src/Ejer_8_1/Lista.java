/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_1;

/**
 *
 * @author hp
 */
public class Lista {

    private nodo inicio;
    private nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public void agregarFin(int info) {

        nodo nuevo = new nodo(info, null);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

    }

    public void imprimir() {
        nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void eliminar(int valor) {
        nodo anterior = inicio;
        nodo aux = inicio.getSiguiente();
        nodo temp;
        while (aux != null) {

            if (aux.getDato() > valor) {
                temp = aux.getSiguiente();
                anterior.setSiguiente(aux.getSiguiente());
                aux = temp;
            } else {
                anterior = anterior.getSiguiente();
                aux = aux.getSiguiente();
            }
        }
    }
}
