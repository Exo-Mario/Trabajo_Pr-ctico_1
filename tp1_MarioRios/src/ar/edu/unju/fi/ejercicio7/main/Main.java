package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Constructor parametrizado
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el legajo del empleado: ");
		int legajo = sc.nextInt();
		System.out.println("Ingrese el salario del empleado: ");
		double salario = sc.nextDouble();
		Empleado empleado1 = new Empleado(nombre, legajo, salario);
		System.out.println("-------- DATOS --------");
		empleado1.mostrarDatos();
		System.out.println("-------- AUMENTO POR MÉRTIOS --------");
		empleado1.aumentoSalarial();
		empleado1.mostrarDatos();
		
		// Cerramos el Scanner
		sc.close();
	}

}
