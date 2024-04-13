package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Crear un array de tamaño 5
        String[] nombres = new String[5];

        // Solicitar al usuario que ingrese nombres de personas para guardarlos en el array
        System.out.println("Ingrese " + nombres.length + " nombres de personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.next();
        }
        
        // Mostramos los datos usando una variable auxiliar y la estructura while
        System.out.println("----------- ARRAY -----------");
        int contador=0;
        while (contador<nombres.length) {
        	System.out.println("El elemento guardado en el indice "+contador+" es: "+nombres[contador]);
        	contador++;
        }
        
        System.out.println("\nEl tamaño del array es: "+nombres.length);
        byte indice;
        
        // Proceso para eliminar un indice
        do {
        	System.out.println("\nIngrese un indice del array que desee eliminar [0,4]");
        	indice = (byte) sc.nextInt();
        	
        	if(indice < 0 || indice >= nombres.length) {
        		System.out.println("El valor ingresado no es correcto, ingrese un indice existente: ");
        	}
			
		} while (indice<0 || indice>=nombres.length);
        
        // Eliminamos el elemento del array
        for (int i = indice; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        
        // Asignamos un valor nulo al final
        nombres[nombres.length-1]="";
        
        // Mostramos el array
        System.out.println("----------- ARRAY -----------");
        contador=0;
        while (contador<nombres.length) {
        	System.out.println("El elemento guardado en el indice "+contador+" es: "+nombres[contador]);
        	contador++;
        }
        
        sc.close();
        
	}

}
