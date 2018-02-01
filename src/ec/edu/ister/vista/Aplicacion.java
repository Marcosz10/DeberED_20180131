/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Lista;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Aplicacion {
    public static void main(String[] args) {
  
        Lista l = new Lista();
        int menu=0 ;
        do {
            menu = leerInt("----Menu----"
                    + "\n0.Salir"
                    + "\n1.Generar Lista en base a una cadena de caracteres"
                    + "\n2.Imprimir Lista");

            switch (menu) {
                case 0: {
                    System.out.println("Programa Terminado");
                    break;
                }
                case 1: {
                    l.iniciar(leerString("Ingrese la palabra para generar la lista"));
                    break;
                }
                case 2: {
                    l.imprimir();
                    break;
                }
            }
        } while (menu != 0);
    }

    public static int leerInt(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        return leer.nextInt();
    }

    public static String leerString(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        return leer.nextLine();
    }
}
    

