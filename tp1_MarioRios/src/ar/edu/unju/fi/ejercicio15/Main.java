package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        // Solicitar tamaño al usuario con rango[5,10]
        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero en el rango [5, 10]: ");
            tamanoArray = sc.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        // Crear un array de tamaño ingresado por el usuario
        String[] nombres = new String[tamanoArray];

        // Solicitar al usuario que ingrese nombres de personas para guardarlos en el array
        System.out.println("Ingrese " + tamanoArray + " nombres de personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.next();
        }

        // Mostrar el contenido del array comenzando desde el primer índice
        System.out.println("\nContenido del array comenzando desde el primer índice:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // Mostrar el contenido del array comenzando desde el último índice
        System.out.println("\nContenido del array comenzando desde el último índice:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        sc.close();
	}

}
