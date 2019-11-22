/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_3;

import static java.lang.Math.pow;

/**
 *
 * @author hp
 */
public class Lista {

    Nodo inicio;
    Nodo fin;

    public void agregarNodoAlFinal(Numero obj) {
        Nodo nuevo = new Nodo(obj);
        Nodo reco1;
        Nodo reco2;
        if (inicio == null) {
            inicio = nuevo;
            nuevo.setSiguiente(null);
        } else {
            reco1 = inicio;
            while (reco1 != null) {
                reco2 = reco1.getSiguiente();
                if (nuevo.getNum().getGrado() >= reco1.getNum().getGrado()) {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                    break;
                } else {
                    if (reco2.getNum().getGrado()<=nuevo.getNum().getGrado()){
                        reco1.setSiguiente(nuevo);
                        nuevo.setSiguiente(reco2);
                        break;
                    }
                        else{
                            reco1=reco1.getSiguiente();
                        }
                }
            }
        }
    }

    public void recorreLista() {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getNum().getGrado() >= 1) {
                System.out.printf(aux.getNum().getSigno() + aux.getNum().getNum() + "x^" + aux.getNum().getGrado());
                aux = aux.getSiguiente();
            } else {
                System.out.printf(aux.getNum().getSigno() + aux.getNum().getNum());
                aux = aux.getSiguiente();
            }
        }
        System.out.println("\n");
    }

    public void reemplazo(double n) {
        Nodo aux = inicio;
        int r = 0;
        double exp = 0, re = 0, base = 0, acu = 0;
        while (aux != null) {
            base = (double) aux.getNum().getNum();
            exp = (double) aux.getNum().getGrado();
            re = pow(n, exp);
            if (aux.getNum().getSigno().compareTo("+") == 0) {
                acu = acu + (base * re);
            }
            if (aux.getNum().getSigno().compareTo("-") == 0) {
                acu = acu - (base * re);
            }
            aux = aux.getSiguiente();
        }
        System.out.printf("\nEl resultado del reemplazo de: " + "f(" + n + ")=");
        recorreLista();
        System.out.printf("f(" + n + ")= " + acu);
    }
}
