package Pacote;

import java.util.ArrayList;



public  class Modalidade {
	
	private String nome;
	private String introducao;
	private ArrayList<Investimento> investimentos;
	
	public Modalidade(String nome){
		this.nome = nome;
		introducao = "";
		investimentos = new ArrayList<Investimento>();
	}
	
	
	public void adicionarInvestimento(Investimento i){
		investimentos.add(i);
	}
	
	public void imprimirInvestimentos(){
		for(int i = 0; i < investimentos.size(); i++){
			investimentos.get(i).imprimirInvestimento();
		}
	}
	
	
	public void imprimirInfo(){
		System.out.println(nome + "\n" + introducao + "\n" + "\n" + "Investimentos:\n");
		
		imprimirInvestimentos();
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIntroducao() {
		return introducao;
	}

	
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}

	public ArrayList<Investimento> getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(ArrayList<Investimento> investimentos) {
		this.investimentos = investimentos;
	}
}
