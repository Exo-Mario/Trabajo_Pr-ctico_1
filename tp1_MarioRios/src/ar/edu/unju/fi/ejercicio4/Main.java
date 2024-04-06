package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar Variables y Scanner
		Scanner sc = new Scanner(System.in);
		int numero,aux;
		System.out.println("Ingrese número comprendido entre 0 y 10: ");
		numero = sc.nextInt();
		aux=1;
		
		// Verificar el rango de numero
		while(numero>10 || numero <0) {
			System.out.println("El número introducido es mayor que 10 o menor que 0. Acción invalidada");
			System.out.println("Ingrese número comprendido entre 0 y 10: ");
			numero=sc.nextInt();
		}
				
		// Procedimiento
		System.out.println("0! = 1");
		if (numero!=0) {
			int i=1;
			while(i<=numero) {
				aux*=i;
				System.out.println(i+"! = "+aux);
				i+=1;
				}
			}
				
		// Mostrar datos y cerrar el Scanner
		System.out.println();
		System.out.println("El resultado del factorial deseado es: "+aux);
		sc.close();
	}

}
