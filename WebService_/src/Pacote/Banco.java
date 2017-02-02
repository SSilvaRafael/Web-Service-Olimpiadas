package Pacote;

//responsável por abrir e fechar as conexões

import java.sql.*; 
public class Banco {
	
	private static Connection conexao = null;
	private static String caminho = "";
	
	
	public static void  abrirConexao(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance(); //informar o drive que será usado para o java
			caminho += "jdbc:mysql://127.0.0.1/vpibsi?";
			caminho += "user=root&password=root";
			conexao = DriverManager.getConnection(caminho);
			System.out.println("Conex�o aberta.");
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fecharConexao(){
		try{
			conexao.close();
			System.out.println("Conex�o fechada.");
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		Banco.caminho = caminho;
	}

	public void setConexao(Connection conexao) {
		Banco.conexao = conexao;
		
	}


	public static Connection getConexao() {
		return conexao;
	}
	



}
