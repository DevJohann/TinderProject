package co.edu.unbosque.tinderproject.model;

import java.util.ArrayList;

public class User {
	private String nombre;
	private String nombreUsuario;
	private String password;
	private String genero;
	private int edad;
	static private int id;
	private boolean firstTimer = true;
	private ArrayList<String> gustos = new ArrayList<String>();
	
	//Constructor
	public User(String username, String password) {
		this.nombreUsuario = username;
		this.password = password;
		id++;
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
	public ArrayList<String> getGustos(){
		return this.gustos;
	}
}
