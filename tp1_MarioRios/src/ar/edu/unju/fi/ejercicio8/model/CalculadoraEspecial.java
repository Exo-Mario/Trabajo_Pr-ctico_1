package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	public int n;
	
	// Constructor por defecto
	public CalculadoraEspecial() {
	}
	
	// Constructor parametrizado
	public CalculadoraEspecial(int n) {
		this.n = n;
	}
	
	// Método accesores
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	// Calculo de la sumatoria
	public double calcularSumatoria() {
		double  sumatoria = 0;
		for(int k = 1; k <= n ; k++ ) {
			sumatoria = sumatoria + Math.pow(((k*(k+1))/2), 2);
		}
		return sumatoria;
	}
		
	// Calculo de la productoria
	public double calcularProductoria() {
		double productoria=1;
	    for(int k = 1; k <= n; k++) {
	        productoria = productoria * (k*(k+4));
	    }
		return productoria;
	}
	
	
	
}
