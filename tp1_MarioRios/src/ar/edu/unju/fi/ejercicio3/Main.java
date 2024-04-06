package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar el Scanner y la variable
		Scanner sc = new Scanner(System.in);
		int numAlmacenado;
		
		numAlmacenado = sc.nextInt();
		
		// Condición y Resultados
		if (numAlmacenado % 2 == 0) {
			System.out.println(numAlmacenado+" es un número par. Su triple es: "+numAlmacenado*3);
		} else {
			System.out.println(numAlmacenado+" es un número impar. Su doble es "+numAlmacenado*2);
		}
		
		// Cerrar el Scanner
		sc.close();

	}
}
