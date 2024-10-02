package br.com.loja.Assistec.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class LoginDAO extends GenericDAO {

	public Boolean bancoOnline() throws SQLException {
		return getConnection().isValid(0);
	}

	// Aqui vai o método autenticar
	public Usuario autenticar(String login, String senha) throws SQLException {
		String sql = "SELECT * FROM usuarios WHERE login=? AND senha=?";

		Usuario usuario = null;
		PreparedStatement pstm = getConnection().prepareStatement(sql);
		pstm.setString(1, login);
		pstm.setString(2, senha);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			usuario = new Usuario();
			usuario.setIduser(rs.getInt("iduser"));
		}
		return usuario;
	}
}