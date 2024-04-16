package ar.edu.unju.fi.ejercicio17.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opciones;
		do {
			System.out.println("MENU DE OPCIONES");
            System.out.println("1 – Alta de jugador");
            System.out.println("2 – Mostrar los datos del jugador");
            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 – Modificar los datos de un jugador");
            System.out.println("5 – Eliminar un jugador");
            System.out.println("6 – Mostrar la cantidad total de jugadores");
            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 – Salir");
            System.out.println("Ingrese una opción: ");
            
            opciones = sc.nextInt();
            
            try {
            	
            	switch (opciones) {
                case 1:
                	System.out.println("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = sc.next();
                    System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                    
                    // Leer fecha como String y convertirla a Date
                    String fechaStr = sc.next();
                    
                    // Aquí debes convertir fechaStr a un objeto Date
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaNacimiento = null;
                    
                    try {
                        fechaNacimiento = sdf.parse(fechaStr);
                    } catch (Exception e) {
                        System.out.println("Error al convertir la fecha. Formato incorrecto.");
                        break;
                    }
                    
                    System.out.println("Ingrese la nacionalidad: ");
                    String nacionalidad = sc.next();
                    System.out.println("Ingrese la estatura (en metros): ");
                    double estatura = sc.nextDouble();
                    System.out.println("Ingrese el peso (en kilogramos): ");
                    double peso = sc.nextDouble();
                    System.out.println("Ingrese la posición (delantero, medio, defensa, arquero): ");
                    String posicion = sc.next();
                    
                    // Agregar jugador al ArrayList
                    Jugador nuevoJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                    jugadores.add(nuevoJugador);
                    System.out.println("Jugador agregado correctamente.");
                    break;
                    
                case 2:
                	// Mostrar los datos del jugador
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombreBuscado = sc.next();
                    System.out.println("Ingrese el apellido del jugador: ");
                    String apellidoBuscado = sc.next();
                    
                    boolean encontrado = false;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreBuscado) && jugador.getApellido().equalsIgnoreCase(apellidoBuscado)) {
                            System.out.println("Datos del jugador:");
                            System.out.println("Nombre: " + jugador.getNombre());
                            System.out.println("Apellido: " + jugador.getApellido());
                            System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
                            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                            System.out.println("Estatura: " + jugador.getEstatura() + " metros");
                            System.out.println("Peso: " + jugador.getPeso() + " kilogramos");
                            System.out.println("Posición: " + jugador.getPosicion());
                            System.out.println("Edad: " + jugador.calcularEdad() + " años");
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    
                case 3:
                    // Mostrar todos los jugadores ordenados por apellido
                    Collections.sort(jugadores);
                    for (Jugador jugador : jugadores) {
                        System.out.println(jugador.toString());
                    }
                    break;
                    
                case 4:
                    // Modificar los datos de un jugador
                	System.out.println("Ingrese el nombre del jugador a modificar: ");
                    String nombreModificar = sc.next();
                    System.out.println("Ingrese el apellido del jugador a modificar: ");
                    String apellidoModificar = sc.next();
                    
                    Jugador jugadorModificar = null;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombreModificar) && jugador.getApellido().equalsIgnoreCase(apellidoModificar)) {
                            jugadorModificar = jugador;
                            break;
                        }
                    }
                    
                    if (jugadorModificar != null) {
                        System.out.println("Ingrese la nueva nacionalidad (o deje en blanco para mantener el mismo): ");
                        String nuevaNacionalidad = sc.next();
                        if (!nuevaNacionalidad.isBlank()) {
                            jugadorModificar.setNacionalidad(nuevaNacionalidad);
                        }
                        
                        System.out.println("Ingrese la nueva estatura (en metros, o -1 para mantener la misma): ");
                        double nuevaEstatura = sc.nextDouble();
                        if (nuevaEstatura != -1) {
                            jugadorModificar.setEstatura(nuevaEstatura);
                        }
                        
                        System.out.println("Ingrese el nuevo peso (en kilogramos, o -1 para mantener el mismo): ");
                        double nuevoPeso = sc.nextDouble();
                        if (nuevoPeso != -1) {
                            jugadorModificar.setPeso(nuevoPeso);
                        }
                        
                        System.out.println("Ingrese la nueva posición (delantero, medio, defensa, arquero, o deje en blanco para mantener la misma): ");
                        String nuevaPosicion = sc.next();
                        if (!nuevaPosicion.isBlank()) {
                            jugadorModificar.setPosicion(nuevaPosicion);
                        }
                        
                        System.out.println("Datos modificados correctamente.");
                    } else {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                    
                case 5:
                    // Eliminar un jugador
                	System.out.println("Ingrese el nombre del jugador a eliminar: ");
                    String nombreEliminar = sc.next();
                    System.out.println("Ingrese el apellido del jugador a eliminar: ");
                    String apellidoEliminar = sc.next();
                    Iterator<Jugador> iterator = jugadores.iterator();
                    
                    while (iterator.hasNext()) {
                        Jugador jugador = iterator.next();
                        if (jugador.getNombre().equals(nombreEliminar) && jugador.getApellido().equals(apellidoEliminar)) {
                            iterator.remove();
                            System.out.println("Jugador eliminado.");
                            break;
                        }
                    }
                    break;
                    
                case 6:
                    // Mostrar la cantidad total de jugadores
                    System.out.println("Cantidad total de jugadores: " + jugadores.size());
                    break;
                    
                case 7:
                	System.out.println("Ingrese la nacionalidad a buscar: ");
                    String nacionalidadBuscar = sc.next();
                    int cantidadNacionalidad = 0;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar)) {
                            cantidadNacionalidad++;
                        }
                    }
                    System.out.println("Cantidad de jugadores de " + nacionalidadBuscar + ": " + cantidadNacionalidad);
                    break;
                    
                case 8:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
            	
				
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
                // Limpiar el buffer del scanner
                sc.nextLine();
            }
            
		} while (opciones != 8);
		
		sc.close();
	}

}
