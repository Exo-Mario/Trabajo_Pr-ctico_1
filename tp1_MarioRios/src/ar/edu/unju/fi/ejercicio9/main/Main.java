package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 productos a continuación");
		System.out.println();
		
		for(int i=1;i<4;i++) {
		System.out.println("Ingrese nombre del producto: ");
		String nombre = sc.next();
		System.out.println("Ingrese código del producto: ");
		int codigo = sc.nextInt();
		System.out.println("Ingrese precio del producto: $");
		double precio = sc.nextDouble();
		System.out.println("Ingrese descuento del producto: [entre 0% y 50%]");
		int descuento = sc.nextInt();
		while(descuento>50 || descuento<0) {
			System.out.println("Ingrese nuevamente el valor: ");
			descuento = sc.nextInt();
		}
		
		Producto producto = new Producto(nombre,codigo,precio,descuento);
		System.out.println();
		System.out.println("----- Factura del "+i+"° producto -----");
		producto.mostrarDatos();
		}
		
		sc.close();
	}

}
