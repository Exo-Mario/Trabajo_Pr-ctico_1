package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	public int calcularEdad() {
		Calendar ahora = Calendar.getInstance();
		int edad = ahora.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
		edad--;
	    }
	    return edad;
	}
	
	public String determinarSignoZodiacal() {
		int mes = fechaNac.get(Calendar.MONTH) + 1; // Sumar 1 porque enero es 0
        int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String signo = "";
		
		switch (mes) {
        case 1:
            signo = (dia <= 20) ? "Capricornio" : "Acuario";
            break;
        case 2:
            signo = (dia <= 19) ? "Acuario" : "Piscis";
            break;
        case 3:
            signo = (dia <= 20) ? "Piscis" : "Aries";
            break;
        case 4:
            signo = (dia <= 20) ? "Aries" : "Tauro";
            break;
        case 5:
            signo = (dia <= 21) ? "Tauro" : "Géminis";
            break;
        case 6:
            signo = (dia <= 21) ? "Géminis" : "Cáncer";
            break;
        case 7:
            signo = (dia <= 22) ? "Cáncer" : "Leo";
            break;
        case 8:
            signo = (dia <= 23) ? "Leo" : "Virgo";
            break;
        case 9:
            signo = (dia <= 23) ? "Virgo" : "Libra";
            break;
        case 10:
            signo = (dia <= 23) ? "Libra" : "Escorpio";
            break;
        case 11:
            signo = (dia <= 22) ? "Escorpio" : "Sagitario";
            break;
        case 12:
            signo = (dia <= 21) ? "Sagitario" : "Capricornio";
            break;
        default:
            signo = "No se pudo determinar";
		}
		
		return signo;
		
	}
		
	public String determinarEstacion() {
		int mes = fechaNac.get(Calendar.MONTH) + 1; // Sumar 1 porque enero es 0
		String estacion="";
		
		switch (mes) {
        case 1:
        case 2:
        case 12:
            estacion = "Invierno";
            break;
        case 3:
        case 4:
        case 5:
            estacion = "Primavera";
            break;
        case 6:
        case 7:
        case 8:
            estacion = "Verano";
            break;
        case 9:
        case 10:
        case 11:
            estacion = "Otoño";
            break;
        default:
            estacion = "No se pudo determinar";
		}
		return estacion;
	}

	@Override
	public String toString() {
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
	    int mes = fechaNac.get(Calendar.MONTH) + 1; // Sumar 1 porque enero es 0
	    int anio = fechaNac.get(Calendar.YEAR);
	    return "Nombre: " + nombre + "\nFecha de nacimiento: " + String.format("%02d", dia) + "/" + String.format("%02d", mes) + "/" + anio;
	}
	
}
