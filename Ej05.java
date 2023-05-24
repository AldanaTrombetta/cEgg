/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author aldan
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Define una variable de tipo boolean, double y char. Guarda información
        a través del Scanner
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor booleano(true/false):");
        boolean valorBooleano = leer.nextBoolean();
        System.out.println("El valor booleano ingresado es " + valorBooleano);
        
        System.out.println("Ingrese un valor con decimales:");
        double valorDecimal = leer.nextDouble();
        System.out.println("El valor double ingresado es " + valorDecimal);
        
        System.out.println("Ingrese un caracter:");
        char caracter = leer.next().charAt(0);
        System.out.println("El valor char ingresado es " + caracter);
    }
    
}
