/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer_8_4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ejercicio4 {

    public static int ingresarEntero(String mensaje, int min, int max) {
        Scanner ingreso = new Scanner(System.in);
        int dato;
        do {
            System.out.println(mensaje + " entre " + min + " y " + max);
            dato = ingreso.nextInt();
        } while (dato < min || dato > max);
        return dato;
    }

    public static String ingresarString(String mensaje) {
        Scanner ingreso = new Scanner(System.in);
        String texto = "";
        System.out.println(mensaje);
        texto = ingreso.nextLine();
        return texto;
    }

    public static void main(String[] args) {
        int resp = 0, num = 0, grado = 0, op = 0;
        Lista coleccion = new Lista();
        Scanner Entrada = new Scanner(System.in);
        do {
            System.out.println("1Ingresar terminos \n2Reemplazar terminos(varios valores)\n3reemplazar con un valor determinado\nSeleccione una: ");
            op = Entrada.nextInt();
            switch (op) {

                case 1: {
                    do {
                        coleccion.agregarNodoAlFinal(new Numero(ingresarString("Ingrese el signo del termino \n Positivo  +\n Negativo --> -"),
                                ingresarEntero("Ingrese el termino: ", 1, 100),
                                ingresarEntero("Ingrese el grado deltermino ", 0, 100)));
                        System.out.println("¿Desea ingresar un termino adicional?");
                        resp = Entrada.nextInt();
                    } while (resp != 0);
                    coleccion.recorreLista();
                }
                break;
                case 2:
                    coleccion.reemplazo(0.5);
                    coleccion.reemplazo(1.0);
                    coleccion.reemplazo(1.5);
                    coleccion.reemplazo(2.0);
                    coleccion.reemplazo(2.5);
                    coleccion.reemplazo(3.0);
                    coleccion.reemplazo(3.5);
                    coleccion.reemplazo(4.0);
                    coleccion.reemplazo(4.5);
                    coleccion.reemplazo(5.0);
                    break;
                case 3:
                    coleccion.reemplazo(ingresarEntero("Ingrese un numero ", -100, 100));
                    break;
            }
            System.out.println("\n¿Desea ingresar otro termino? 1 Si 0 No");
            resp = Entrada.nextInt();
        } while (resp == 0);
        System.out.println("\nEl polinomio es: ");
        coleccion.recorreLista();
    }

}
