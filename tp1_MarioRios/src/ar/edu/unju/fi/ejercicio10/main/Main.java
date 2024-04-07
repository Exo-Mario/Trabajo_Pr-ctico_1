package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 productos a continuación");
		System.out.println();
		
		for(int i=0;i<3;i++) {
			Pizza pizza = new Pizza();
			
			do {
		        System.out.println("Ingrese el diámetro de la pizza (20, 30 o 40):");
		        pizza.setDiametro(sc.nextInt());
		    } while (pizza.getDiametro() != 20 && pizza.getDiametro() != 30 && pizza.getDiametro() != 40);
			
			System.out.println("¿Tiene ingredientes especiales? (true/false)");
			pizza.setEspecias(sc.nextBoolean());
			
			sc.nextLine(); //Consumir la linea que le seguiría al nextInt()
			System.out.println();
			System.out.println("----- Pizza "+(i+1)+" -----");
			pizza.mostrarDatos();
		}
		sc.close();
	}
}
