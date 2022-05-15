package co.edu.unbosque.tinderproject.model;

import java.util.ArrayList;

public class User {
	private String nombre;
	private String nombreUsuario;
	private String password;
	private String genero;
	private int edad = 0;
	static private int id;
	private boolean firstTimer = true;
	private ArrayList<String> gustos = new ArrayList<String>();
	
	//Constructor
	public User(String username, String password) {
		this.nombreUsuario = username;
		this.password = password;
		id++;
	}
	
	//Add Gustos
	public void addGusto(String value) {
		gustos.add(value);
	}
	
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
	public void setFirstTimer(boolean value) {
		this.firstTimer = value;
	}
	
	//Getters
	public String getUsername() {
		return this.nombreUsuario;
	}
	public String getPassword() {
		return this.password;
	}
	public boolean getFirstTimer() {
		return this.firstTimer;
	}
	public String getGender() {
		return this.genero;
	}
	public int getAge() {
		return this.edad;
	}
	public ArrayList<String> getGustos(){
		return this.gustos;
	}
}
