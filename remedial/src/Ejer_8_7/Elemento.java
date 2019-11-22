/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_7;

/**
 *
 * @author hp
 */
public class Elemento {
    private int Elemen;
    private Elemento siguiente;
    private Elemento anterior;
    
    public void Elemento(){
        this.siguiente=null;
        this.anterior=null;
    }
    public Elemento(int Elemen){
        this.Elemen=Elemen;
        siguiente=null;
    }

    public int getElemen() {
        return Elemen;
    }

    public void setElemen(int Elemen) {
        this.Elemen = Elemen;
    }

    public Elemento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Elemento siguiente) {
        this.siguiente = siguiente;
    }

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }
    
}
