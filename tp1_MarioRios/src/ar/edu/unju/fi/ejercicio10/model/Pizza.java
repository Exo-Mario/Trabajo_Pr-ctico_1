package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean especias;
	public static final double especias20 = 500;
	public static final double especias30 = 750;
	public static final double especias40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isEspecias() {
		return especias;
	}

	public void setEspecias(boolean especias) {
		this.especias = especias;
	}

	public static double getEspecias20() {
		return especias20;
	}

	public static double getEspecias30() {
		return especias30;
	}

	public static double getEspecias40() {
		return especias40;
	}
	
	public double calcularPrecio() {
		
		if(diametro==20 && especias==false) {
			precio=4500;
		} else if(diametro==20 && especias==true) {
			precio=4500+especias20;
		}
		
		if(diametro==30 && especias==false) {
			precio=4800;
		} else if(diametro==30 && especias==true) {
			precio=4800+especias30;
		}
		
		if(diametro==40 && especias==false) {
			precio=5500;
		} else if(diametro==40 && especias==true) {
			precio=5500+especias40;
		}
		
		return precio;
	}
	
	public double calcularArea() {
		return area = Math.PI * ((diametro*diametro)/4);
	}
	
	public void mostrarDatos() {
		System.out.println("Diámetro: "+diametro);
		System.out.println("Ingredientes especiales: "+especias);
		System.out.println("Precio Pizza: $"+calcularPrecio());
		System.out.println("Área de la pizza: "+calcularArea());
		System.out.println("-----------------------------------");
		System.out.println();
	}
	
}
