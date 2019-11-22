/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_12;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del primer Vector"));
        int dato1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del segundo Vector"));
        int dato2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del Vector que almacenara la suma de los vectores"
                + "\n Recuerda que el tamaño del vector que almacenara la suma debe ser igual"
                + " o mayor\n al tamaño de los vectores anteriores "));
        if (dato > dato1) {
            JOptionPane.showMessageDialog(null, "Los Vectores no tienen las mismas dimensiones"
                    + "\n Favor de verificar! ");
        }
        if (dato2 < dato && dato2 < dato1) {
            JOptionPane.showMessageDialog(null, "El Vector que almacena la suma no puede ser menor al Tamaño de\n"
                    + "Los vectores anteriores"
                    + "\n Favor de verificar");

        } else {
            int v1[] = new int[dato];
            int v2[] = new int[dato1];
            int v3[] = new int[dato2];

            int op = 0;
            String menu = "***** Menú operaciones de vectores *****\n";
            menu += "1.- Llenar vectores\n";
            menu += "2.- Suma de vectores\n";
            menu += "3.- Salir\n";
            menu += "Digita una opción";
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op) {
                    case 1:
                        for (int i = 0; i < v1.length; i++) {
                            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vector 1" + " [" + i + "]"));
                        }
                        for (int i = 0; i < v2.length; i++) {
                            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vector 2" + " [" + i + "]"));
                        }
                        //Imprime los vectores
                        String cad1 = "",
                         cad2 = "";
                        for (int i = 0; i < v1.length; i++) {
                            cad1 += v1[i] + " ";
                            cad2 += v2[i] + " ";
                        }
                        System.out.println("vec1: " + cad1);
                        System.out.println("vec2: " + cad2);
                        break;
                    case 2:
                     
                        System.out.println("La suma es de: ");
                        for (int i = 0; i < v1.length; i++) {
                            v3[i] = v1[i] + v2[i];
                            System.out.print(v3[i] + " ");
                        }
                        System.out.println();
                        break;
                }
            } while (op != 3);
        }
    }
}
