package co.edu.unbosque.tinderproject;

import co.edu.unbosque.tinderproject.controller.*;
import co.edu.unbosque.tinderproject.model.*;
import co.edu.unbosque.tinderproject.view.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainModel model = new MainModel();
		MainView view = new MainView();
		MainController controller = new MainController(view, model);
	}

}
