/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_8;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Problema8_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lear=new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos del conjunto A: ");
        int tA=lear.nextInt();
        System.out.println("Ingrese el numero de elementos del conjunto B: ");
        int tB=lear.nextInt();
        
        int[]A=new int[tA];
        int[]B=new int[tB];
        
        System.out.println("Ingrese elementos del conjunto A");
        for (int i = 0; i < A.length; i++) {
            A[i]=lear.nextInt();
        }
        System.out.println("Ingrese elementos del conjunto B");
        for (int j = 0; j < B.length; j++) {
            B[j]=lear.nextInt();
        }
        int[]U=Union (A,B);
        System.out.println("Los elementos de la union son: ");
        for (int i = 0; i < U.length; i++) {
            System.out.println(U[i]);
        }
    }
    public static Boolean existe(int[] Conjunto, int Elemento){
        Boolean existe=false;
        for (int i = 0; i < Conjunto.length; i++) {
            if (Conjunto[i]==Elemento) {
                existe=true;
            }
        }
        return existe;
    }
    public static int[]Union (int[]A,int[]B){
        int []U=new int[A.length+B.length];
        for (int i = 0; i < A.length; i++) {
           U[i]=A[i]; 
        }
        int x=0;
        int r=0;
        for (int i = 0; i < B.length; i++) {
            if (existe(U,B[i])==false) {
                U[A.length+x]=B[i];
                x++;
            }else{
                r++;
            }
        }
        int [] Auxiliar=U;
        U= new int[Auxiliar.length-r];
        for (int i = 0; i < U.length; i++) {
            U[i]=Auxiliar[i];
        }
        return U;
    }
}
