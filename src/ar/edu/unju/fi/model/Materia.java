package ar.edu.unju.fi.model;

public class Materia {
	private String cod;
	private String nombre;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String cod, String nombre) {
		super();
		this.cod = cod;
		this.nombre = nombre;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
