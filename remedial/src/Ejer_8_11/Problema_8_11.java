/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Vianey
 */
public class Problema_8_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader fr, fr2;
        try {
            fr = new FileReader(new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\remedial\\src\\Ejer_8_11\\Lista1.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            fr2 = new FileReader(new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\remedial\\src\\Ejer_8_11\\Lista2.txt"));
            BufferedReader br2 = new BufferedReader(fr2);
            String linea2 = br2.readLine();

            StringTokenizer st = new StringTokenizer(linea, ", ");
            int dimension = st.countTokens();
            int suma = 0;
            int suma2 = 0;

            int[] arrNumeros = new int[dimension];

            while (st.hasMoreTokens()) {
                System.out.print("Lista 1: ");
                for (int i = 0; i < arrNumeros.length; i++) {
                    arrNumeros[i] = Integer.parseInt(st.nextToken());
                    System.out.print(arrNumeros[i] + ", ");
                    suma += arrNumeros[i];
                }
            }
            System.out.println("\nla suma de la primer lista es: " + suma + "\n");

            StringTokenizer st2 = new StringTokenizer(linea2, ", ");
            int dimension2 = st2.countTokens();

            int[] arrNumeros2 = new int[dimension2];

            while (st2.hasMoreTokens()) {
                System.out.print("Lista 2: ");
                for (int j = 0; j < arrNumeros2.length; j++) {
                    arrNumeros2[j] = Integer.parseInt(st2.nextToken());
                    System.out.print(arrNumeros2[j] + ", ");
                    suma2 += arrNumeros2[j];
                }
            }
            System.out.println("\nLa suma de la segunda lista es: " + suma2);

            int[] arrNumeros3 = new int[suma + suma2];

            System.out.println("\nLa suma de las listas es: " + arrNumeros3.length);

            br.close();
            br2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
