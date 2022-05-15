package co.edu.unbosque.tinderproject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.tinderproject.model.*;
import co.edu.unbosque.tinderproject.view.*;

public class MainController {

	private MainView View;
	private MainModel Model;
	private User ActualUser;
	
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
			//RegisterMenu Button
			view.getSignUpJButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getVentanaJFrame().getContentPane().removeAll();
				view.getVentanaJFrame().repaint();
				view.showRegisterMenu();
			}
		});
		//End of StartMenu Buttons
		
			
		//LoginMenu Buttons
		view.getSendCredsButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getResponseLabel().setText("Verificando...");
				boolean isValid = model.ValidateUser(view.getUsernameField().getText(), view.getPasswordField().getText());
				if(isValid) {
					view.getResponseLabel().setText("");
					view.getUsernameField().setText("");
					view.getPasswordField().setText("");
					//ActualUser = model.getWorkingUser();
					if(model.checkFirstTimer()) {
						view.getVentanaJFrame().getContentPane().removeAll();
						view.getVentanaJFrame().repaint();
						view.showFirstTimerMenu();
					}
					else{
						
					}
				}
				else {
					view.getUsernameField().setText("");
					view.getPasswordField().setText("");
					view.getResponseLabel().setText("Credenciales incorrectas");
				}
					
			}
		});
			//Back Button
		view.getBackButtonLogin().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getVentanaJFrame().getContentPane().removeAll();
				view.getVentanaJFrame().repaint();
				view.showStartMenu();
			}
		});
		//End of LogIn menu buttons
		
		//Register menu Buttons
			//SendCreds
		view.getSendCredsRegisterButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean Repeated = model.checkUsername(view.getUsernameFieldRegister().getText());
				
				if(Repeated == false) {
					model.addNewUser(view.getUsernameFieldRegister().getText(), view.getPasswordFieldRegister().getText());
					view.getVentanaJFrame().getContentPane().removeAll();
					view.getVentanaJFrame().repaint();
					view.showLogInMenu();
					view.getResponseLabel().setText("Usuario registrado");
				}
				else {
					view.getResponseLabelRegister().setText("Ese nombre de usuario ya existe");
				}
			}
		});
			//BackButton
		view.getBackButtonRegister().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getVentanaJFrame().getContentPane().removeAll();
				view.getVentanaJFrame().repaint();
				view.showStartMenu();
			}
		});
		//End of Register menu Buttons
		
		//FirstTimerMenu buttons section
		
		view.getBackButtonFirstTimer().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getVentanaJFrame().getContentPane().removeAll();
				view.getVentanaJFrame().repaint();
				view.showStartMenu();
			}
		});
		//End of FirstTimerMenu buttons
	}
}
