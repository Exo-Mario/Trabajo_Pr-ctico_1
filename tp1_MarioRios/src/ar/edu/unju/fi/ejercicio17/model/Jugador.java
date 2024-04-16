package ar.edu.unju.fi.ejercicio17.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Jugador implements Comparable<Jugador> {
	
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador(String nombre, String apellido, Date fechaNac, String nacionalidad, double estatura, double peso,
			String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	public int calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(this.fechaNac);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH) ||
           (fechaActual.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH) &&
            fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public int compareTo(Jugador otroJugador) {
		return this.apellido.compareTo(otroJugador.apellido);
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNacimientoStr = sdf.format(this.fechaNac);
		return "Jugador [nombre= " + nombre + " , apellido= " + apellido + " , fechaNac= " + fechaNacimientoStr + " , nacionalidad= "
				+ nacionalidad + " , estatura= " + estatura + " , peso= " + peso + " , posicion= " + posicion + " ]";
	}
	
}
