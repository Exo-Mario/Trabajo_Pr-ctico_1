package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Creación de objeto Persona utilizando constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese el DNI:");
        persona1.setDni(sc.nextLine());
        System.out.println("Ingrese el nombre:");
        persona1.setNombre(sc.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        persona1.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
        System.out.println("Ingrese la provincia:");
        persona1.setProvincia(sc.nextLine());
        System.out.println("-------- DATOS --------");
        persona1.mostrarDatos();

        System.out.println();

        // Creación de objeto Persona utilizando constructor parametrizado
        System.out.println("Ingrese el DNI:");
        String dni = sc.nextLine();
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
        System.out.println("Ingrese la provincia:");
        String provincia = sc.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        System.out.println("-------- DATOS --------");
        persona2.mostrarDatos();

        System.out.println();

        // Creación de objeto Persona utilizando constructor con dni, nombre y fecha de nacimiento
        System.out.println("Ingrese el DNI:");
        dni = sc.nextLine();
        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        fechaNacimiento = LocalDate.parse(sc.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        System.out.println("-------- DATOS --------");
        persona3.mostrarDatos();

        sc.close();
	}

}
