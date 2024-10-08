package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Segundo {

	public static void main(String[] args) {
		// executa operaçõe no BD
		Statement stm1 = null; // permite fazer consultas no banco de dados
		
		Connection conn = ConexaoBD.getConexaoMySQL(); // fazer a conexao com o BD
		
		try {
			stm1 = (Statement) conn.createStatement(); // traz o resultados da consulta SQL
			ResultSet res1 = null;
			res1 = stm1.executeQuery("SELECT * FROM CLIENTES");
			System.out.println("ID      NOME       E-MAIL");
			while (res1.next()) {
				System.out.println(res1.getInt("id") + "      " + res1.getString("nome") + "       " + res1.getString("email"));
				// mostra a primeira coluna
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
