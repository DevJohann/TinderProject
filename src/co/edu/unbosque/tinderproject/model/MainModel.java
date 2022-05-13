package co.edu.unbosque.tinderproject.model;

import java.util.ArrayList;

public class MainModel {
	ArrayList<User> UsersDB = new ArrayList<User>();
	public MainModel() {
		UsersDB.add(new User("Johann", "1234"));
	}
	
	public boolean ValidateUser(String username, String password) {
		for(User user : UsersDB) {
			if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
