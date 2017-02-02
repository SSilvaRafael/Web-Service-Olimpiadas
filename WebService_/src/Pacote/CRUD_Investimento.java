package Pacote;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;



public class CRUD_Investimento extends CRUD{

	public CRUD_Investimento(){
		super();
	}
	
	public static void inserirInvestimento(Investimento i, Modalidade m) throws SQLException{
		String s1 = CRUD_Estado.buscarChavePrimaria(i.getUf());
		int id_estado = Integer.parseInt(s1);
		
		String s2 = CRUD_Modalidade.buscarChavePrimaria(m.getNome());
		int id_modalidade = Integer.parseInt(s2);
		
		
		Banco.abrirConexao();
		
		query = "insert into investimentos(id_estado, id_modalidade, numeroConvenio, objetivoConvenio, orgaoSuperior,"
				+"concedente, convenente, publicacao, inicioVigencia, fimVigencia,"
				+"dataUltimaLiberacao, valorConvenio, valorLiberado, valorContraPartida, valorUltimaLiberacao)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		
		
		ps.setInt(1, id_estado);
		ps.setInt(2, id_modalidade);
		
		int numeroConvenio = Integer.parseInt(i.getNumeroConvenioSiafi());
		ps.setInt(3, numeroConvenio);
		
		ps.setString(4, i.getObjetivoConvenio());
		ps.setString(5, i.getOrgaoSuperior());
		ps.setString(6, i.getConvenente());
		ps.setString(7, i.getConvenente());
		ps.setString(8, i.getPublicacao());
		ps.setString(9, i.getInicioVigencia());
		ps.setString(10, i.getInicioVigencia());
		ps.setString(11, i.getFimVigencia());
		
		BigDecimal valorConvenio = new BigDecimal(i.getValorConvenio());
		ps.setBigDecimal(12, valorConvenio);
		
		BigDecimal valorLiberado = new BigDecimal(i.getValorLiberado());
		ps.setBigDecimal(13, valorLiberado);
		
		BigDecimal valorContraPartida = new BigDecimal(i.getValorContraPartida());
		ps.setBigDecimal(14, valorContraPartida);
		
		BigDecimal valorUltimaLiberacao = new BigDecimal(i.getValorUltimaLiberacao());
		ps.setBigDecimal(15, valorUltimaLiberacao);
		
		if(ps.executeUpdate() > 0){
			System.out.println("Investimento: " + i.getNumeroConvenioSiafi() +", inserido com sucesso.");
		}
		
		Banco.fecharConexao();
	}
	
	/*
	public static ArrayList<Investimento> buscarInvestimentos(String valor) throws SQLException{
		Banco.abrirConexao();
		query = "select * from investimentos where id_modalidade =  " + valor;
		ArrayList<Investimento> lista = null;
		ps = (PreparedStatement) Banco.getConexao().prepareStatement(query);
		ResultSet resultado = ps.executeQuery();
			
		if(resultado != null){
			lista = new ArrayList<Investimento>();
			while(resultado.next()){
				String id_investimento = resultado.getString(1);
				String convenio = resultado.getString(2);
				String orgaoSuperior = resultado.getString(3);
				String concedente = resultado.getString(4);
				String convenente = resultado.getString(5);
				String objetivo = resultado.getString(6);
				String inicioVigencia = resultado.getString(7);
				String valorConvenio = resultado.getString(8);
				String valorLiberado = resultado.getString(9);
				String valorContraPartida = resultado.getString(10);
				String id_modalidade = resultado.getString(11);
				
				Investimento i = new Investimento(id_investimento, convenio, orgaoSuperior, concedente, convenente, objetivo, 
				inicioVigencia, valorConvenio, valorLiberado, valorContraPartida, id_modalidade);
				lista.add(i);
				i = null;
			}
		}
		
		Banco.fecharConexao();
		
		return lista;
	}
	*/
}	
	

