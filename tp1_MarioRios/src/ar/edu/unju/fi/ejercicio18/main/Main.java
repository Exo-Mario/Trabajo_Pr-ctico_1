package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        // Precargar paises
        paises.add(new Pais("01", "Argentina"));
        paises.add(new Pais("02", "Brasil"));
        paises.add(new Pais("03", "Chile"));
        paises.add(new Pais("04", "Uruguay"));
        paises.add(new Pais("05", "Paraguay"));
        paises.add(new Pais("06", "Bolivia"));
        paises.add(new Pais("07", "Perú"));
        paises.add(new Pais("08", "Ecuador"));
        paises.add(new Pais("09", "Colombia"));
        paises.add(new Pais("10", "Venezuela"));

        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1 – Alta de destino turístico");
            System.out.println("2 – Mostrar todos los destinos turísticos");
            System.out.println("3 – Modificar el país de un destino turístico");
            System.out.println("4 – Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 – Eliminar un destino turístico");
            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 – Mostrar todos los países");
            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 – Salir");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        // Alta de destino turístico
                        System.out.println("Ingrese el código del país: ");
                        String codigoPais = scanner.next();
                        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
                        if (pais == null) {
                            throw new IllegalArgumentException("Código de país no válido.");
                        }
                        System.out.println("Ingrese el código del destino turístico: ");
                        String codigoDestino = scanner.next();
                        System.out.println("Ingrese el nombre del destino turístico: ");
                        String nombreDestino = scanner.next();
                        System.out.println("Ingrese el precio del destino turístico: ");
                        double precio = scanner.nextDouble();
                        System.out.println("Ingrese la cantidad de días: ");
                        int cantidadDias = scanner.nextInt();

                        DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precio, pais, cantidadDias);
                        destinos.add(nuevoDestino);
                        System.out.println("Destino turístico agregado correctamente.");
                        break;

                    case 2:
                        // Mostrar todos los destinos turísticos
                        for (DestinoTuristico destino : destinos) {
                            System.out.println(destino.toString());
                        }
                        break;

                    case 3:
                        // Modificar el país de un destino turístico
                        System.out.println("Ingrese el código del destino turístico a modificar: ");
                        String codigoModificar = scanner.next();
                        System.out.println("Ingrese el nuevo código del país: ");
                        String nuevoCodigoPais = scanner.next();
                        Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
                        if (nuevoPais == null) {
                            throw new IllegalArgumentException("Código de país no válido.");
                        }
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getCodigo().equals(codigoModificar)) {
                                destino.setPais(nuevoPais);
                                System.out.println("País modificado correctamente.");
                                break;
                            }
                        }
                        break;

                    case 4:
                        // Limpiar el ArrayList de destinos turísticos
                        destinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpiado.");
                        break;

                    case 5:
                        // Eliminar un destino turístico
                        System.out.println("Ingrese el código del destino turístico a eliminar: ");
                        String codigoEliminar = scanner.next();
                        Iterator<DestinoTuristico> iterator = destinos.iterator();
                        while (iterator.hasNext()) {
                            DestinoTuristico destino = iterator.next();
                            if (destino.getCodigo().equals(codigoEliminar)) {
                                iterator.remove();
                                System.out.println("Destino turístico eliminado.");
                                break;
                            }
                        }
                        break;

                    case 6:
                        // Mostrar los destinos turísticos ordenados por nombre
                        Collections.sort(destinos, (d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));
                        for (DestinoTuristico destino : destinos) {
                            System.out.println(destino.toString());
                        }
                        break;

                    case 7:
                        // Mostrar todos los países
                        for (Pais paisActual : paises) {
                            System.out.println(paisActual.toString());
                        }
                        break;

                    case 8:
                        // Mostrar los destinos turísticos que pertenecen a un país
                        System.out.println("Ingrese el código del país: ");
                        String codigoBuscar = scanner.next();
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getPais().getCodigo().equals(codigoBuscar)) {
                                System.out.println(destino.toString());
                            }
                        }
                        break;

                    case 9:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.nextLine();  // Limpiar el buffer del scanner
            }

        } while (opcion != 9);
        
        scanner.close();
    }

    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigo)) {
                return pais;
            }
        }
        return null;
    }
}
