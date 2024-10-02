package br.com.loja.Assistec.controller;

import java.sql.SQLException;

import br.com.loja.Assistec.model.LoginDAO;

public class LoginController {

	public LoginController() {
	
		
	}
	
	public Boolean verificarBancoOnline() throws SQLException {
		LoginDAO dao = new LoginDAO();
		
		return dao.bancoOnline();
	}
}