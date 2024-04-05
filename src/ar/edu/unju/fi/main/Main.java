package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		Alumno alum=generarAlumno();
	
		int numMaterias=1;
		registrarNotas(alum, numMaterias);
		
	}
	
	public static Alumno generarAlumno() {
		Scanner sc=new Scanner(System.in);
		Alumno alum=new Alumno();
		System.out.print("Ingrese el legajo: ");
		Integer legajo=sc.nextInt();
		System.out.print("Ingrese nombre: ");
		String nombre=sc.next();
		System.out.print("Ingrese Apellido: ");
		String apellido=sc.next();
		
		alum.setLegajo(legajo);
		alum.setNombre(nombre);
		alum.setApellido(apellido);
		return alum;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner sc= new Scanner(System.in);
		while(numMaterias<=4)
		{
			//Cargar materias
			System.out.print("Ingrese el codigo de la materia: ");
			String codMateria=sc.next();
			System.out.print("Ingrese el nombre de la materia: ");
			String nombreMateria= sc.next();
			
			Materia materia = new Materia(codMateria,nombreMateria);
			
			System.out.print("Ingrese el codigo de registro de nota: ");
			String codNota=sc.next();
			System.out.print("Ingrese la nota final: ");
			Float notaFinal= sc.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codNota,alumno,materia,notaFinal);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
		sc.close();
	}

}
