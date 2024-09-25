package br.com.loja.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JFrame {
	private JPasswordField passwordField_1;
	private JTextField txtUsuarios;

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setBounds(100, 100, 703, 453);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][grow][][]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		getContentPane().add(lblNewLabel, "cell 7 6");
		
		txtUsuarios = new JTextField();
		getContentPane().add(txtUsuarios, "cell 9 6,growx");
		txtUsuarios.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		getContentPane().add(lblNewLabel_1, "cell 7 9");
		
		passwordField_1 = new JPasswordField();
		getContentPane().add(passwordField_1, "cell 9 9,growx");
		
		JLabel lblStatus = new JLabel("");
		getContentPane().add(lblStatus, "cell 7 11");
		
		JButton btnLogin = new JButton("Login");
		getContentPane().add(btnLogin, "cell 9 13");

	}

}
