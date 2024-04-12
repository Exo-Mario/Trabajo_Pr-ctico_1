package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la persona");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese la fecha de nacimiento (en formato dd/mm/aaaa):");
        String fechaNacimientoStr = sc.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restar 1 porque enero es 0
        int anio = Integer.parseInt(partesFecha[2]);
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);

        System.out.println("\nDatos de la persona:");
        System.out.println(persona);

        System.out.println("\nEdad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiacal());
        System.out.println("Estación del año: " + persona.determinarEstacion());

        sc.close();
	}

}
