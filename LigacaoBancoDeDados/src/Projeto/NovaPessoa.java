package Projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args)throws SQLException  {
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Informe seu nome: ");
			String nome = scan.nextLine();
			
			Connection conexao = FabricaConexao.getConexao();
			
			String sql = "insert INTO pessoas (nome) VALUES(?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.execute();
			
			System.out.println("Pessoa incluida com sucesso" + sql);
			
			scan.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
