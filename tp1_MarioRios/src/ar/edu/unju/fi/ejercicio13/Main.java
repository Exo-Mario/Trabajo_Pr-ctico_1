package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaramos el array
		int[] numero = new int[8];
		
		// Hacemos el ingreso mediante un for
		for(int i=0; i<numero.length;i++) {
			System.out.println("Ingrese el "+(i+1)+"° elemento:");
			numero[i] = sc.nextInt();
		}
		
		// Mostramos los datos
		 System.out.println("\nElementos almacenados:");
		 
	     for (int i = 0; i < numero.length; i++) {
	            System.out.println("Índice " + i + ": " + numero[i]);
	     }
	     
	     sc.close();
	}

}
