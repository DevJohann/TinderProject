package co.edu.unbosque.tinderproject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.tinderproject.model.*;
import co.edu.unbosque.tinderproject.view.*;

public class MainController {

	private MainView View;
	private MainModel Model;
	
	public MainController(MainView view, MainModel model){
		this.View = view;
		this.Model = model;
		
		//StartMenu Buttons
		view.getSignInJButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getVentanaJFrame().getContentPane().removeAll();
				view.getVentanaJFrame().repaint();
				view.getVentanaJFrame().setSize(500, 500);
				view.showLogInMenu();
			}
		});
		//End of StartMenu Buttons
		
		//LoginMenu Buttons
		view.getSendCredsButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getResponseLabel().setText("Verificando...");
				boolean isValid = model.ValidateUser(view.getUsernameField().getText(), view.getPasswordField().getText());
				if(isValid)
					view.getResponseLabel().setText("OK");
				else {
					view.getUsernameField().setText("");
					view.getPasswordField().setText("");
					view.getResponseLabel().setText("Credenciales incorrectas");
				}
					
			}
		});
	}
}
