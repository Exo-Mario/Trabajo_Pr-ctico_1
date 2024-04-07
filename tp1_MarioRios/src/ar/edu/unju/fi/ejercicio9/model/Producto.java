package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	// Declaración de variables privadas
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	// Constructor por defecto
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	// Métodos accesores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	// Método adicionales
	public double calcularDescuento() {
		 double resultado;
		 resultado = precio - (precio*getDescuento())/100;
		return resultado;
	 }
	
	public void mostrarDatos() {
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Código del producto: "+codigo);
		System.out.println("Precio del producto: $"+precio);
		System.out.println("Descuento del "+descuento+"% = $"+calcularDescuento());
		System.out.println("-----------------------------------");
		System.out.println();
	}
	
	
}
