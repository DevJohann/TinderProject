package co.edu.unbosque.tinderproject.view;

import java.awt.Font;
import javax.swing.*;


public class MainView {

	JFrame ventana = new JFrame();
	JLabel mainMessage = new JLabel("Bienvenido a Tinder");
	JButton SignInButton = new JButton("Iniciar sesión");
	JButton SignUpButton = new JButton("Registrarse");
		
	public MainView() {
		ventana.setSize(500, 500);
		ventana.setLayout(null);
		ventana.setVisible(true);
		ventana.setTitle("Tinder");
		
		mainMessage.setBounds(155, 30, 200, 40);
		mainMessage.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(mainMessage);
		
		SignInButton.setBounds(80, 300, 120, 40);
		SignInButton.setFont(new Font("Serif", Font.BOLD, 14));
		ventana.add(SignInButton);
		
		SignUpButton.setBounds(280, 300, 120, 40);
		SignUpButton.setFont(new Font("Serif", Font.BOLD, 14));
		ventana.add(SignUpButton);
		
	}
	
	public JFrame getVentanaJFrame() {
		return this.ventana;
	}
	
	public JButton getSignInJButton() {
		return this.SignInButton;
	}
	public JButton getSignUpJButton() {
		return this.SignUpButton;
	}
	public JLabel getMainMessageJLabel() {
		return this.mainMessage;
	}
	
	
	
}
