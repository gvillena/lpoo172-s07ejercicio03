/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creando nuevo objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // Mostrar mensaje al usuario 
        System.out.print("Ingresar un numero entre 0 y 1000: ");
        int number = input.nextInt();
        
        // Calcular la suma de los digitos del numero entero
        int menorQue10 = number % 10;
        number = number / 10;        
        int decenas = number % 10;
        number /= 10;        
        int centenas = number % 10;
        number /= 10;        
        int suma = centenas + decenas + menorQue10;
        
        // Mostrar resultado 
        System.out.println("La suma de los digitos es: " + suma);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
