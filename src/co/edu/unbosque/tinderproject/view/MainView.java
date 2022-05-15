package co.edu.unbosque.tinderproject.view;

import java.awt.Font;
import javax.swing.*;


public class MainView {

	JFrame ventana = new JFrame();
	JLabel mainMessage = new JLabel("Bienvenido a Tinder");
	JButton SignInButton = new JButton("Iniciar sesión");
	JButton SignUpButton = new JButton("Registrarse");
		
	public MainView() {
		showStartMenu();
		
	}
	
	//StartMenu Section
	public void showStartMenu() {
		//ventana.setSize(500, 500);
		ventana.setBounds(450, 100, 500, 500);
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
	//Getters start menu
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
	//End of StartMenu section
	
	//LoginMenu section
	JLabel LogInLabel = new JLabel("LOGIN");
	JLabel UsernameLabel = new JLabel("Usuario: ");
	JTextField UsernameField = new JTextField();
	JLabel PasswordLabel = new JLabel("Contraseña: ");
	JTextField PasswordField = new JTextField();
	JButton SendCredsButton = new JButton("Enviar");
	JLabel ResponseLabel = new JLabel();
	JButton BackButtonLogin = new JButton("Volver");
	
	public void showLogInMenu() {
		LogInLabel.setBounds(215, 30, 200, 40);
		LogInLabel.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(LogInLabel);
		
		//User name section
		UsernameLabel.setBounds(98, 80, 120, 40);
		UsernameLabel.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(UsernameLabel);
		UsernameField.setBounds(180, 88, 140, 30);
		ventana.add(UsernameField);
		
		//Password section
		PasswordLabel.setBounds(65, 140, 120, 40);
		PasswordLabel.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(PasswordLabel);
		PasswordField.setBounds(180, 148, 140, 30);
		ventana.add(PasswordField);
		
		//SendCredsButton section
		SendCredsButton.setBounds(180, 200, 100, 30);
		ventana.add(SendCredsButton);
		
		//ResponseLabel section
		ResponseLabel.setBounds(180, 350, 300, 40);
		ResponseLabel.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(ResponseLabel);
		
		//Back Button
		BackButtonLogin.setBounds(10, 420, 70, 35);
		ventana.add(BackButtonLogin);
		
	}
	public JTextField getUsernameField() {
		return this.UsernameField;
	}
	public JTextField getPasswordField() {
		return this.PasswordField;
	}
	public JButton getSendCredsButton() {
		return this.SendCredsButton;
	}
	public JLabel getResponseLabel() {
		return this.ResponseLabel;
	}
	public JButton getBackButtonLogin() {
		return this.BackButtonLogin;
	}
	//End of LoginMenu section
	
	//Register menu section
	JLabel mainLabelRegister = new JLabel("Registrarse");
	JLabel usernameLabelRegister = new JLabel("Usuario:");
	JLabel passwordLabelRegister = new JLabel("Contraseña:");
	JLabel responseLabelRegister = new JLabel("");
	JTextField usernameFieldRegister = new JTextField();
	JTextField passwordFieldRegister = new JTextField();
	JButton sendCredsRegisterButton = new JButton("Enviar");
	JButton backButtonRegister = new JButton("Volver");
	
	public void showRegisterMenu() {
		mainLabelRegister.setBounds(180, 20, 400, 40);
		mainLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(mainLabelRegister);
		
		//User name field
		usernameFieldRegister.setBounds(140, 88, 150, 30);
		ventana.add(usernameFieldRegister);
		usernameLabelRegister.setBounds(60, 80, 400, 40);
		usernameLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(usernameLabelRegister);
		
		//Password field
		passwordFieldRegister.setBounds(140, 140, 150, 30);
		ventana.add(passwordFieldRegister);
		passwordLabelRegister.setBounds(30, 132, 400, 40);
		passwordLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(passwordLabelRegister);
		
		//Send Credentials button
		sendCredsRegisterButton.setBounds(140, 180, 100, 30);
		ventana.add(sendCredsRegisterButton);

		//Response label
		responseLabelRegister.setBounds(100, 350, 400, 40);
		responseLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		ventana.add(responseLabelRegister);
			
		//Back button
		backButtonRegister.setBounds(10, 420, 70, 35);
		ventana.add(backButtonRegister);
		
		
	}
	public JLabel getResponseLabelRegister() {
		return this.responseLabelRegister;
	}
	public JTextField getUsernameFieldRegister() {
		return this.usernameFieldRegister;
	}
	public JTextField getPasswordFieldRegister() {
		return this.passwordFieldRegister;
	}
	public JButton getSendCredsRegisterButton() {
		return this.sendCredsRegisterButton;
	}
	public JButton getBackButtonRegister() {
		return this.backButtonRegister;
	}
	//End of Register menu section
	
	//FirstTimerMenu section
	JLabel mainLabel = new JLabel("Cuéntanos sobre tí, para encontrar tu pareja perfecta");
	
	JButton BackButtonFirstTimer = new JButton("Salir");
	
	public void showFirstTimerMenu() {
		mainLabel.setBounds(22, 20, 600, 40);
		mainLabel.setFont(new Font("Serif", Font.BOLD, 18));
		ventana.add(mainLabel);
		
		BackButtonFirstTimer.setBounds(10, 420, 70, 35);
		ventana.add(BackButtonFirstTimer);
	}
	public JButton getBackButtonFirstTimer() {
		return this.BackButtonFirstTimer;
	}
	//End of FirstTimerMenu section
}
