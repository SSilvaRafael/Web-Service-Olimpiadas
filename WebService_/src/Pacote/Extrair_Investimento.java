package Pacote;

public class Extrair_Investimento extends Extrair_Html{

	public Extrair_Investimento(){
		c = null;
		html = null;
	}
	
	public Investimento extrairDados(String busca){
		c = new Conector_Internet("http://www.portaldatransparencia.gov.br/convenios/DetalhaConvenio"
				+ ".asp?TipoConsulta=5&CodConvenio=" + busca);
		html = buscarHtml();
		
		
		Investimento investimento = new Investimento();
		
		investimento.setUf(extrairItem("UF:", "</tr>"));
		investimento.setMunicipio(extrairItem("Município:", "</tr>"));
		investimento.setNumeroConvenioSiafi(busca);
		investimento.setSituacao(extrairItem("Situação: </td>", "</strong></td>"));
		
		investimento.setNumeroConvenioOriginal(extrairItem("N&ordm; Original: </td>", "</strong>"));
		investimento.setObjetivoConvenio(extrairItem("Objeto do Convênio: </td>", "</tr>"));
		investimento.setOrgaoSuperior(extrairItem("Orgão Superior: </td>", "</strong>"));
		investimento.setConcedente(extrairItem("Concedente: </td>", "</strong></td>"));
		
		investimento.setConvenente(extrairItem("Convenente: </td>", "</strong></td>"));
		investimento.setValorConvenio(extrairItem("Valor Convênio: </td>", "</strong>"));
		investimento.setValorLiberado(extrairItem("Valor Liberado*:  </td>", "</strong>"));
		investimento.setInicioVigencia(extrairItem("Início da Vigência: </td>", "</strong></td>"));
		
		investimento.setFimVigencia(extrairItem("Fim da Vigência: </td>", "</strong></td>"));
		investimento.setValorContraPartida(extrairItem("Valor Contrapartida: </td>", "</strong></td>"));
		investimento.setDataUltimaLiberacao(extrairItem("Data Última Liberação: </td>", "</strong></td>"));
		investimento.setValorUltimaLiberacao(extrairItem("Valor Última Liberação:</td>", "</strong></td>"));
		investimento.setPublicacao(extrairItem("Publicaç&atilde;o: </td>", "</strong>"));
	
		investimento = Expressao_Regular.arrumarConteudoInvestimento(investimento);
		
		investimento.setValorConvenio(Expressao_Regular.arrumarValorMonetario(investimento.getValorConvenio()));
		investimento.setValorLiberado(Expressao_Regular.arrumarValorMonetario(investimento.getValorLiberado()));
		investimento.setValorContraPartida(Expressao_Regular.arrumarValorMonetario(investimento.getValorContraPartida()));
		investimento.setValorUltimaLiberacao(Expressao_Regular.arrumarValorMonetario(investimento.getValorUltimaLiberacao()));
		
		return investimento;
	}
	
	private String limparTrecho(String trecho){
		String novoTrecho = Expressao_Regular.limparTrecho(trecho);
		trecho = Expressao_Regular.arrumarCodificacao(novoTrecho);
		return trecho;
	}
	
	
	
	private String extrairItem(String ini, String fim){
		String trecho = getTrechoHtml(ini, fim);
		trecho = limparTrecho(trecho);
		return trecho;
	}
	
}
