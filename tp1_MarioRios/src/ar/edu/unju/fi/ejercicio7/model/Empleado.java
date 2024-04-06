package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	// Declaración de los atributos y las constantes
	private String nombre;
	private int legajo;
	private double salario;
	public static final double SALARIO_MINIMO = 210000.00;
	public static final double AUMENTO_POR_MERITOS = 20000.00;
	
	// Constructor con condicional en el salario
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	// Métodos adicionales
	
	public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario: $" + salario);
    }
	
	public void aumentoSalarial() {
		 salario += AUMENTO_POR_MERITOS;
	}
	
}
