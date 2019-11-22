/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_7;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Problema8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        Conjunto ls = new Conjunto();
        int opc=0;
        int elemen = 0;
        
        do{
            
           
            System.out.println("1) Añadir Elemento al conjunto "
                    + "\n 2) Mostrar elemento del conjunto"
                    + "\n 3) Cardinalidad del conjunto"
                    + "\n 4) Pertenecia de un elemento en el conjunto"
                    + "\n 5) Salir");
            
              System.out.println("Escoje una opcion arealizar");
            System.out.println("");
            
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("");
                    System.out.println("Escribe el elemento que deseas añadir");
                    elemen=leer.nextInt();
                    ls.agregar(elemen);
                    break;
                case 2:
                    ls.mostrar();
                case 3:
                    System.out.println("");
                    System.out.println("La caedinalidad del conjunto es n(elementos)= "+ ls.getCadinal());
                    System.out.println("");
                case 4:
                    System.out.println("Escriba el elemento del cual quiere saber su pertenencia");
                    elemen = leer.nextInt();
                    ls.buscar(elemen);
                    break;
                case 5:
                    break;
        }
        }while(opc!=5);
    }
    
}
