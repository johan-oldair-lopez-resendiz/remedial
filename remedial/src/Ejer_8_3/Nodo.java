/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_3;

/**
 *
 * @author hp
 */
public class Nodo {

    Numero num;
    Nodo Siguiente;

    public Nodo(Numero num) {
        this.num = num;
    }

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
