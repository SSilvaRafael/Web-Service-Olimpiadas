package Pacote;

public class Extrair_Modalidade extends Extrair_Html{
	 
	public Extrair_Modalidade(){
		c = null;
		html = null;
	}
	
	public Modalidade extrairDados(String nome, String busca, String ini){
		Modalidade modalidade = new Modalidade(nome);
		
		
		String url = "https://pt.wikipedia.org/wiki/" + busca;
		String fim = "<div id=\"toc\" class=\"toc\">";
		
		c = new Conector_Internet(url);
		html = buscarHtml();
		modalidade.setIntroducao(executarExtracaoIntroducao(ini, fim));
		
		url = null;
		ini = null;
		fim = null;
		
		c = null;
		html = null;
		
		return modalidade;
	}
	
	public Modalidade extrairDados(String nome, String busca, String ini, String fim){
		Modalidade modalidade = new Modalidade(nome);
		
		String url = "https://pt.wikipedia.org/wiki/" + busca;
		
		c = new Conector_Internet(url);
		html = buscarHtml();
		modalidade.setIntroducao(executarExtracaoIntroducao(ini, fim));
		
		url = null;
		ini = null;
		fim = null;
		
		c = null;
		html = null;
		
		return modalidade;
	}
	
	
	
	private String executarExtracaoIntroducao(String ini, String fim){
			String introducao = null;
		try{
			introducao = getTrechoHtml(ini, fim);
			introducao = Expressao_Regular.limparTrecho(introducao);
			introducao = Expressao_Regular.arrumarCodificacao(introducao);
			
		}catch(java.lang.NullPointerException e){
			System.err.print("Erro: Valor nulo.");
			System.exit(1);
		}
		
		return introducao;
	}
	
	
	
}
