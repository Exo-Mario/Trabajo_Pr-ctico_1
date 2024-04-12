package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        // Solicitar tamaño al usuario con rango[3,10]
        int tamanoArray;
        
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10]: ");
            tamanoArray = sc.nextInt();
        } while (tamanoArray < 3 || tamanoArray > 10);

        // Crear un array de tamaño ingresado por el usuario
        int[] numeros = new int[tamanoArray];

        // Solicitar al usuario que ingrese números enteros para guardarlos en el array
        System.out.println("Ingrese " + tamanoArray + " números enteros:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        // Mostrar el valor de cada posición y la suma de todos los valores
        System.out.println("\nValores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        System.out.println("La suma de todos los valores es: " + suma);

        sc.close();
	}

}
