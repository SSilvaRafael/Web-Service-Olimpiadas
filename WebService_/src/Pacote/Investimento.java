package Pacote;

public class Investimento {
	private String uf;
	private String municipio;
	private String situacao;
	private String numeroConvenioSiafi;
	
	private String numeroConvenioOriginal;
	private String objetivoConvenio;
	private String orgaoSuperior;
	private String concedente;
	
	private String convenente;
	private String valorConvenio;
	private String valorLiberado;
	private String publicacao;
	
	private String inicioVigencia;
	private String fimVigencia;
	private String valorContraPartida;
	private String dataUltimaLiberacao;
	
	private String valorUltimaLiberacao;
	
	public Investimento(){
		
	}
	
	
	public Investimento(String uf, String municipio, String situacao, String numeroConvenioSiafi, String numeroConvenioOriginal,
			String objetivoConvenio, String orgaoSuperior, String concedente, String convenente, String valorConvenio, String valorLiberado,
			String publicacao, String inicioVigencia, String fimVigencia, String valorContraPartida, String dataUltimaLiberacao, String valorUltimaLiberacao)
	{
		this.uf = uf; 
		this.municipio = municipio; 
		this.situacao = situacao;
		this.numeroConvenioSiafi = numeroConvenioSiafi; 
		this.numeroConvenioOriginal = numeroConvenioOriginal;
		this.objetivoConvenio = objetivoConvenio; 
		this.orgaoSuperior = orgaoSuperior; 
		this.concedente = concedente; 
		this.convenente = convenente; 
		this.valorConvenio = valorConvenio; 
		this.valorLiberado = valorLiberado;
		this.publicacao = publicacao; 
		this.inicioVigencia = inicioVigencia; 
		this.fimVigencia = fimVigencia; 
		this.valorContraPartida = valorContraPartida; 
		this.dataUltimaLiberacao = dataUltimaLiberacao; 
		this.valorUltimaLiberacao = valorUltimaLiberacao;
	}
	
	
	
	public void imprimirInvestimento(){
		System.out.println(getUf());
		System.out.println(getMunicipio());
		System.out.println(getSituacao());
		System.out.println(getNumeroConvenioSiafi());
		
		System.out.println(getNumeroConvenioOriginal());
		System.out.println(getObjetivoConvenio());
		System.out.println(getOrgaoSuperior());
		System.out.println(getConcedente());
		
		System.out.println(getConvenente());
		System.out.println(getValorConvenio());
		System.out.println(getValorLiberado());
		System.out.println(getInicioVigencia());
		
		System.out.println(getFimVigencia());
		System.out.println(getValorContraPartida());
		System.out.println(getDataUltimaLiberacao());
		System.out.println(getValorUltimaLiberacao());
		System.out.println(getPublicacao());
		
		System.out.println();
		
	}
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getNumeroConvenioSiafi() {
		return numeroConvenioSiafi;
	}
	public void setNumeroConvenioSiafi(String numeroConvenioSiafi) {
		this.numeroConvenioSiafi = numeroConvenioSiafi;
	}
	public String getNumeroConvenioOriginal() {
		return numeroConvenioOriginal;
	}
	public void setNumeroConvenioOriginal(String numeroConvenioOriginal) {
		this.numeroConvenioOriginal = numeroConvenioOriginal;
	}
	public String getObjetivoConvenio() {
		return objetivoConvenio;
	}
	public void setObjetivoConvenio(String objetivoConvenio) {
		this.objetivoConvenio = objetivoConvenio;
	}
	public String getOrgaoSuperior() {
		return orgaoSuperior;
	}
	public void setOrgaoSuperior(String orgaoSuperior) {
		this.orgaoSuperior = orgaoSuperior;
	}
	public String getConcedente() {
		return concedente;
	}
	public void setConcedente(String concedente) {
		this.concedente = concedente;
	}
	public String getConvenente() {
		return convenente;
	}
	public void setConvenente(String convenente) {
		this.convenente = convenente;
	}
	public String getValorConvenio() {
		return valorConvenio;
	}
	public void setValorConvenio(String valorConvenio) {
		this.valorConvenio = valorConvenio;
	}
	public String getValorLiberado() {
		return valorLiberado;
	}
	public void setValorLiberado(String valorLiberado) {
		this.valorLiberado = valorLiberado;
	}
	public String getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}
	public String getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(String inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	public String getFimVigencia() {
		return fimVigencia;
	}
	public void setFimVigencia(String fimVigencia) {
		this.fimVigencia = fimVigencia;
	}
	public String getValorContraPartida() {
		return valorContraPartida;
	}
	public void setValorContraPartida(String valorContraPartida) {
		this.valorContraPartida = valorContraPartida;
	}
	public String getDataUltimaLiberacao() {
		return dataUltimaLiberacao;
	}
	public void setDataUltimaLiberacao(String dataUltimaLiberacao) {
		this.dataUltimaLiberacao = dataUltimaLiberacao;
	}
	public String getValorUltimaLiberacao() {
		return valorUltimaLiberacao;
	}
	public void setValorUltimaLiberacao(String valorUltimaLiberacao) {
		this.valorUltimaLiberacao = valorUltimaLiberacao;
	}
	
	
}
