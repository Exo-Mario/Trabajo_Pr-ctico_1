package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar variables
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		int num = sc.nextInt();
			    
		// Llamada del objeto y envio de variables
		CalculadoraEspecial C1 = new CalculadoraEspecial(num);
		
		// Calcular y mostrar la sumatoria
        double sumatoria = C1.calcularSumatoria();
        System.out.println("La sumatoria es: " + sumatoria);

        // Calcular y mostrar la productoria
        double productoria = C1.calcularProductoria();
        System.out.println("La productoria es: " + productoria);
		
		// Cerramos el Scanner
		sc.close();
	}

}
