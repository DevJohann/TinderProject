package co.edu.unbosque.tinderproject.model;

import java.util.ArrayList;

public class MainModel {
	ArrayList<User> UsersDB = new ArrayList<User>();
	User WorkingUser;
	public MainModel() {
		UsersDB.add(new User("Johann", "1234"));
	}
	
	//Login Logic
	
	public boolean ValidateUser(String username, String password) {
		for(User user : UsersDB) {
			if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				this.WorkingUser = user;
				return true;
			}
		}
		return false;
	}
	//Add new user
	public void addNewUser(String username, String password) {
		UsersDB.add(new User(username, password));
	}
	//Check repeated username
	public boolean checkUsername(String username) {
		for(User user : UsersDB) {
			if(username.equals(user.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	//FirstTimer Checker
	public boolean checkFirstTimer() {
		if(WorkingUser.getFirstTimer() == true && WorkingUser.getGustos().size() == 0) {
			WorkingUser.setFirstTimer(true);
			return true;
		}
		WorkingUser.setFirstTimer(false);
		return false;
	}
	
	//Add gustos
	public void addGustos(String value) {
		WorkingUser.addGusto(value);
	}
	
	//Check Gustos length
	public int checkGustosLength() {
		return this.WorkingUser.getGustos().size();
	}
	
	//Check age value
	public boolean isAged() {
		if(this.WorkingUser.getAge() == 0) {
			return false;
		}
		return true;
	}
	//Set age value
	public void setAge(int value) {
		WorkingUser.setEdad(value);
	}
	//Set name value
	public void setName(String value) {
		WorkingUser.setNombre(value);
	}
	//Get name of working user
	public String getName() {
		return WorkingUser.getName();
	}
}
