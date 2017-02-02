package Pacote;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;



public  class CRUD_Modalidade extends CRUD{
		
	public CRUD_Modalidade(){
		super();
	}

	public static void inserirModalidade(Modalidade m) throws SQLException{
		Banco.abrirConexao();
	
		query = "insert into modalidades (nome, introducao) values (?, ?)";
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		
		ps.setString(1, m.getNome());
		ps.setString(2, m.getIntroducao());

		
		if(ps.executeUpdate() > 0){
			System.out.println("Modalidade: " + m.getNome() +", inserida com sucesso.");
		}
		
		Banco.fecharConexao();
	}
	
	
	
	
	/*
	public static Modalidade buscarModalidade(String valor) throws SQLException{
		Banco.abrirConexao();
		query = "select * from modalidades where nome_modalidade = " + "'" + valor + "'";
		Modalidade modalidade = null;
		
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		ResultSet resultado = ps.executeQuery();
			
		if(resultado != null){
			String id = null;
			String nome_modalidade = null;
			String introducao_modalidade = null;
				
			while(resultado.next()){
				id  = resultado.getString(1);
				nome_modalidade = resultado.getString(2);
				introducao_modalidade = resultado.getString(3);
			}
				
			modalidade = new Modalidade(id, nome_modalidade, introducao_modalidade);
			id = null;
			nome_modalidade = null;
			introducao_modalidade = null;
			
		}
	
		Banco.fecharConexao();
		
		return modalidade;
	}
	*/
	/*
	public static  ArrayList<Modalidade> buscarTodasModalidades() throws SQLException{
		Banco.abrirConexao();
		ArrayList<Modalidade> lista = null;
		query = "select * from modalidades";
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		ResultSet resultado = ps.executeQuery();
		
		if(resultado != null){
			lista = new ArrayList<Modalidade>();
			while(resultado.next()){
				Modalidade m = new Modalidade(resultado.getString(1), resultado.getString(2), resultado.getString(3));
				lista.add(m);
				m = null;
			}
		
		}
		
		Banco.fecharConexao();
		return lista;
	}
	
	*/
	
	public static String buscarChavePrimaria(String valor) throws SQLException{
			Banco.abrirConexao();
			
			String pk = null;
			query = "select id_modalidade from modalidades where nome = " + "'" + valor + "'";
			ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
				
			ResultSet resultado = ps.executeQuery();
			
			if(resultado != null){
				while(resultado.next()){
					pk = resultado.getString(1);
				}
			}
			
			Banco.fecharConexao();
			return pk;
	}
	
	
	

}
