package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 productos a continuación");
		System.out.println();
		
		for(int i=0;i<3;i++) {
			Producto producto = new Producto();
			
			System.out.println("Ingrese nombre del producto: ");
			producto.setNombre(sc.nextLine());
			System.out.println("Ingrese código del producto: ");
			producto.setCodigo(sc.nextInt());
			System.out.println("Ingrese precio del producto: $");
			producto.setPrecio(sc.nextDouble());
			System.out.println("Ingrese descuento del producto: [entre 0% y 50%]");
			producto.setDescuento(sc.nextInt());
			
		while(producto.getDescuento()>50 || producto.getDescuento()<0) {
			System.out.println("Ingrese nuevamente el valor: ");
			producto.setDescuento(sc.nextInt());
		}
		
		sc.nextLine(); //Consumir la linea que le seguiría al nextInt()
		System.out.println();
		System.out.println("----- Factura del "+(i+1)+"° producto -----");
		producto.mostrarDatos();
		}
		sc.close();
	}
}
