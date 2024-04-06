package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear variables y Scanner
		Scanner sc = new Scanner(System.in);
		int numero;
		
		// Pedimos el número y se verifica el rango
		System.out.println("Ingrese un número entre 1 y 9 para mostrar su tabla de multiplicación: ");
        numero = sc.nextInt();
        
        while (numero < 1 || numero > 9) {
            System.out.println("El número introducido es mayor que 9 o menor que 1. Acción invalidada");
            System.out.print("Ingrese un número entre 1 y 9: ");
            numero = sc.nextInt();
        }
        
        // Proceso y mostrar datos
        System.out.println("Tabla de multiplicación del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Cerrar Scanner
        sc.close();
	}
}
