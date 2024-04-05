package ar.edu.unju.fi.model;

public class RegistroNota {
	private String cod;
	private Alumno alumno;
	private Materia materia;
	private Float notafinal;
	
	public RegistroNota() {
		
		// TODO Auto-generated constructor stub
	}

	public RegistroNota(String cod, Alumno alumno, Materia materia, Float notafinal) {
		this.cod = cod;
		this.alumno = alumno;
		this.materia = materia;
		this.notafinal = notafinal;
	}

	
	
	@Override
	public String toString() {
		return "\ncod: " + cod + 
				"\nalumno: " + alumno.getApellido() + ", "+ alumno.getNombre() +
				"\nmateria: " + materia.getNombre() + " Cod.Materia: "+ materia.getCod()+ 
				"\nnotafinal:" + notafinal;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNotafinal() {
		return notafinal;
	}

	public void setNotafinal(Float notafinal) {
		this.notafinal = notafinal;
	}
	
	
	
	
}
