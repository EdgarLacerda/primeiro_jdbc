package Projeto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasPessoas {
	
	public static void main(String[] args) throws SQLException {

			try { Connection conexao = FabricaConexao.getConexao();
			Statement stmt = conexao.createStatement();
				String sql = "CREATE TABLE IF NOT EXISTS pessoas("
						+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
						+ "nome VARCHAR(80) NOT NULL"
						+ ")";
				
				//Statement stmt = conexao.createStatement();
				stmt.execute(sql);
				
				System.out.println("Tabela Criada");
				conexao.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}


}
