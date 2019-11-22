/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_1;

/**
 *
 * @author remix
 */
public class nodo {

    private int dato;
    private nodo siguiente;

    public nodo(int dato, nodo siguiente) {
        this.dato = dato;

        this.siguiente = siguiente;
    }

    public nodo(int datos) {
        this.dato = datos;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
