package Pacote;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


public class CRUD_Estado extends CRUD{

	public CRUD_Estado(){
		super();
	}
	
	public static String buscarChavePrimaria(String valor) throws SQLException{
		Banco.abrirConexao();
		
		String pk = null;
		query = "select id_estado from estados where sigla = " + "'" + valor + "'";
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		
		
		ResultSet resultado = ps.executeQuery();
		
		if(resultado != null){
			while(resultado.next()){
				pk  = resultado.getString(1);
			}
		}
		
		Banco.fecharConexao();
		return pk;
	}
	
	
}
