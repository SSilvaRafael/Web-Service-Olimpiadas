package Pacote;

import java.sql.SQLException;

public class Play {

	public static void main(String[] args) throws SQLException {
		
		Extrair_Modalidade em = new Extrair_Modalidade();
		Extrair_Investimento ei = new Extrair_Investimento();
		Modalidade m1 = null;
		Investimento e1 = null;
		Investimento e2 = null;
		Investimento e3 = null;
		Investimento e4 = null;
		Investimento e5 = null;
		Investimento e6 = null;
		Investimento e7 = null;
		Investimento e8 = null;
		Investimento e9 = null;
		Investimento e10 = null;
		Investimento e11 = null;
		
		

		
		/*
		m1 = em.extrairDados("Atletismo", "Atletismo", "O <b>atletismo</b>");
		e1 = ei.extrairDados("761283");
		e2 = ei.extrairDados("751778");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		
		
		
		m1 = em.extrairDados("Badminton", "Badminton", "<b>Badminton</b>");
		e1 = ei.extrairDados("751780");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1); 
		*/						
		/*
		m1 = em.extrairDados("Basketball", "Basquetebol", "<b>basquetebol</b>");
		e1 = ei.extrairDados("778137");
		e2 = ei.extrairDados("778129");
		e3 = ei.extrairDados("778073");
		e4 = ei.extrairDados("777907");
		e5 = ei.extrairDados("777901");
		e6 = ei.extrairDados("776485");
		e7 = ei.extrairDados("752279");
		e8 = ei.extrairDados("751777");
		
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		CRUD_Investimento.inserirInvestimento(e4, m1);
		CRUD_Investimento.inserirInvestimento(e5, m1);
		CRUD_Investimento.inserirInvestimento(e6, m1);
		CRUD_Investimento.inserirInvestimento(e7, m1);
		CRUD_Investimento.inserirInvestimento(e8, m1);
		*/

		/*
		m1 = em.extrairDados("Canoagem", "Canoagem", "<b>canoagem</b>");
		e1 = ei.extrairDados("752247");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("Ciclismo", "Ciclismo", "<b>Ciclismo</b>");
		e1 = ei.extrairDados("751774");
		e2 = ei.extrairDados("751771");
		e3 = ei.extrairDados("751631");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		
		m1 = em.extrairDados("Esgrima", "Esgrima", "<b>esgrima</b>");
		e1 = ei.extrairDados("778122");
		e2 = ei.extrairDados("761299");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		*/
		
		/*
		m1 = em.extrairDados("Futebol paral�mpico", "Futebol_paral�mpico", "<b>O</b>", "</h2>");
		e1 = ei.extrairDados("751775");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		*/
		/*
		m1 = em.extrairDados("Gin�stica", "Gin�stica", "A <b>ginástica</b>");
		e1 = ei.extrairDados("776542");
		e2 = ei.extrairDados("751781");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		
		m1 = em.extrairDados("Golbol", "Golbol", "<b>golbol</b>");
		e1 = ei.extrairDados("755699");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("Andebol", "Andebol", "é uma modalidade");
		e1 = ei.extrairDados("761290");
		e2 = ei.extrairDados("752190");
		e3 = ei.extrairDados("752189");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		*/
	
		
		/*
		m1 = em.extrairDados("Hipismo", "Hipismo", "Hipismo é a arte ");
		e1 = ei.extrairDados("778134");
		e2 = ei.extrairDados("777904");
		e3 = ei.extrairDados("777902");
		e4 = ei.extrairDados("751952");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		CRUD_Investimento.inserirInvestimento(e4, m1);
	
		
		m1 = em.extrairDados("H�quei em campo", "H�quei_em_campo", "O <b>hóquei em campo</b>");
		e1 = ei.extrairDados("751769");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		
		m1 = em.extrairDados("Jud�", "Jud�", "<b>Judô</b>");
		e1 = ei.extrairDados("777893");
		e2 = ei.extrairDados("777892");
		e3 = ei.extrairDados("752298");
		e4 = ei.extrairDados("755940");
		e5 = ei.extrairDados("750922");
		
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		CRUD_Investimento.inserirInvestimento(e4, m1);
		CRUD_Investimento.inserirInvestimento(e5, m1);
		*/
		/*
		m1 = em.extrairDados("Luta Ol�mpica", "Luta_ol�mpica", "<b>Luta olímpica</b>", "</p>");
		e1 = ei.extrairDados("775275");
		e2 = ei.extrairDados("775118");
		e3 = ei.extrairDados("752307");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		
		m1 = em.extrairDados("Nata��o", "Nata��o", "<b>Natação</b>");
		e1 = ei.extrairDados("751772");
		m1.adicionarInvestimento(e1);
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		
		m1 = em.extrairDados("Pentatlo moderno", "Pentatlo_moderno", "<b>Pentatlo moderno</b>");
		e1 = ei.extrairDados("777914");
		e2 = ei.extrairDados("776589");
		e3 = ei.extrairDados("760717");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		*/
		/*
		m1 = em.extrairDados("Polo aqu�tico", "Polo_aqu�tico", "O <b>Pólo Aquático</b>");
		e1 = ei.extrairDados("755882");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("Rugby", "Rugby", "<b>rugby</b>");
		e1 = ei.extrairDados("761161");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("Salto ornamental", "Salto_ornamental", "<b>Saltos ornamentais</b>");
		e1 = ei.extrairDados("760939");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("Taekwondo", "Taekwondo", "<b>Taekwondo</b>");
		e1 = ei.extrairDados("761166");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		m1 = em.extrairDados("T�nis", "T�nis", "Ténis</span>");
		e1 = ei.extrairDados("755461");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		*/
		/*
		m1 = em.extrairDados("T�nis de Mesa", "T�nis_de_mesa", "tênis de mesa</span>");
		e1 = ei.extrairDados("778138");
		e2 = ei.extrairDados("777876");
		e3 = ei.extrairDados("776456");
		e4 = ei.extrairDados("777907");
		e5 = ei.extrairDados("751770");
		e6 = ei.extrairDados("751711");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		CRUD_Investimento.inserirInvestimento(e4, m1);
		CRUD_Investimento.inserirInvestimento(e5, m1);
		CRUD_Investimento.inserirInvestimento(e6, m1);
		
		
		m1 = em.extrairDados("Tiro com arco", "Tiro_desportivo", "O <b>tiro desportivo</b>", "<h2>");
		e1 = ei.extrairDados("777082");
		e2 = ei.extrairDados("776541");
		e3 = ei.extrairDados("761297");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		*/
		/*
		m1 = em.extrairDados("Tiro desportivo", "Tiro_desportivo", "O <b>tiro desportivo</b>", "</p>");
		e1 = ei.extrairDados("778135");
		e2 = ei.extrairDados("752255");
		e3 = ei.extrairDados("751718");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		
		m1 = em.extrairDados("Voleibol", "Voleibol", "<b>Voleibol</b>");
		e1 = ei.extrairDados("778126");
		e2 = ei.extrairDados("778121");
		e3 = ei.extrairDados("777900");
		e4 = ei.extrairDados("776592");
		e5 = ei.extrairDados("776591");
		e6 = ei.extrairDados("761160");
		e7 = ei.extrairDados("761159");
		e8 = ei.extrairDados("760936");
		e9 = ei.extrairDados("752251");
		e10 = ei.extrairDados("751951");
		
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		CRUD_Investimento.inserirInvestimento(e2, m1);
		CRUD_Investimento.inserirInvestimento(e3, m1);
		CRUD_Investimento.inserirInvestimento(e4, m1);
		CRUD_Investimento.inserirInvestimento(e5, m1);
		CRUD_Investimento.inserirInvestimento(e6, m1);
		CRUD_Investimento.inserirInvestimento(e7, m1);
		CRUD_Investimento.inserirInvestimento(e8, m1);
		CRUD_Investimento.inserirInvestimento(e9, m1);
		CRUD_Investimento.inserirInvestimento(e10, m1);
		*/
		
		m1 = em.extrairDados("Voleibol paral�mpico", "Voleibol_paral�mpico", "O <b>Voleibol para atletas");
		e1 = ei.extrairDados("751950");
		CRUD_Modalidade.inserirModalidade(m1);
		CRUD_Investimento.inserirInvestimento(e1, m1);
		
		System.out.println("Programa finalizado.");
		
		
		
		
		
		
	}
	
        
        
}   
        
    


	 
