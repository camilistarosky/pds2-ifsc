package br.com.loja.Assistec.controller;

import br.com.loja.Assistec.model.UsuarioModel;
import br.com.loja.Assistec.view.LoginView;

public class LoginController {
	
	private LoginView view;
	private UsuarioModel model;
	
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		if(model.conexao != null) {
			// view.lblStatus.setText("Conectado com o banco de dados"); não funciona
		//	System.out.println("Conectado com o banco");
		} else {
		//	System.out.println("Não conectado");
		}
		
	}

}
