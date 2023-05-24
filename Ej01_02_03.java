/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author aldan
 */
public class Ej01_02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 31;
        float num2 = (float) 3.1; // se recomienda usar double para más precisión, float ocupa menos espacio
        boolean verificar = true;
        char caracter = 'a';
        String cadena = "Aldana";
        byte num3 = 23;
        int suma = num + num3;
        int num4 = 5;
        double division = num / num4;
        boolean bandera = num > num3;
        
        System.out.println("El valor de num es " + num);
        System.out.println("El valor de num2 es " + num2);
        System.out.println("El valor de verificar es " + verificar);
        System.out.println("El valor de caracter es " + caracter);
        System.out.println("El valor de cadena es " + cadena);
        System.out.println("El valor de num3 es " + num3);
        System.out.println("El valor de suma es " + suma);
        System.out.println("El valor de division es " + division); // no se por qué me da 6.0, debería darme 6.2
        System.out.println("El valor de bandera es " + bandera);
        
    }
    
}
