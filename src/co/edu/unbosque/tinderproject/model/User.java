package co.edu.unbosque.tinderproject.model;

import java.util.ArrayList;

public class User {
	private String nombre;
	private String genero;
	private int edad;
	private ArrayList<String> gustos;
	
	//Setters
	public void setNombre(String value) {
		this.nombre = value;
	}
	public void setGenero(String value) {
		this.genero = value;
	}
	public void setEdad(int value) {
		this.edad = value;
	}
	public void setGustos(ArrayList<String> value) {
		this.gustos = value;
	}
}