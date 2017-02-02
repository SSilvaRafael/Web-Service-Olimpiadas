package Pacote;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Expressao_Regular {
	private static Pattern expressao;
	private static  Matcher executaExpressao;
	
	
	public Expressao_Regular(){
	
	}
	

	public static String limparTrecho(String trecho){
		String t = trecho.replaceAll("< /br>", "\n");
		trecho = t;
		
		String t0 = trecho.replaceAll("<br>", "\n");
		trecho = t0;
		
		String t1 =  trecho.replaceAll("<[^>]*>", ""); // express�o regular tags html
        trecho = t1;
        
        String t2 = trecho.replaceAll("  ", ""); //espa�os
        trecho = t2;
        
        String t3 = trecho.replaceAll("-", "");
        trecho = t3;
        
       
        
        return trecho;
	}
	
	public static String arrumarCodificacao(String trecho){
		String t1 = trecho.replaceAll("“", "�"); // express�o regular tags html
        trecho = t1;
		
        t1 = trecho.replaceAll("�?", "�"); // express�o regular tags html
        trecho = t1;
        
        
		t1 = trecho.replaceAll("á", "�"); // express�o regular tags html
        trecho = t1;
		
        t1 = trecho.replaceAll("ã", "�"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("â", "�"); // express�o regular tags html
        trecho = t1;
        
        
        t1 = trecho.replaceAll("ç", "�"); // express�o regular tags html
        trecho = t1;
        
		t1 = trecho.replaceAll("é", "�"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("ê", "�"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("í", "�"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("ó", "�"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("ô", "�");
        trecho = t1;
        
        t1 = trecho.replaceAll("ú", "�"); // express�o regular tags html
        trecho = t1;
       
        return trecho;
	}
	
	public static String desarrumarCodificacao(String trecho){
		String t1 = trecho.replaceAll( "�", "“"); // express�o regular tags html
        trecho = t1;
		
        t1 = trecho.replaceAll("�", "�?"); // express�o regular tags html
        trecho = t1;
        
        
		t1 = trecho.replaceAll("�", "á"); // express�o regular tags html
        trecho = t1;
		
        t1 = trecho.replaceAll("�", "ã"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("�", "â"); // express�o regular tags html
        trecho = t1;
        
        
        t1 = trecho.replaceAll("�", "ç"); // express�o regular tags html
        trecho = t1;
        
		t1 = trecho.replaceAll("�", "é"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("�", "ê"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("�", "í"); // express�o regular tags html
        trecho = t1;
        
        t1 = trecho.replaceAll("�", "ó"); // express�o regular tags html
        trecho = t1;
        
        
        t1 = trecho.replaceAll("�", "ú"); // express�o regular tags html
        trecho = t1;
       
        return trecho;
	}
	
	
	public static Investimento arrumarConteudoInvestimento(Investimento investimento){
		
													/* Uf*/
		
		expressao = Pattern.compile("\\w\\w"); 
		executaExpressao = expressao.matcher(investimento.getUf());
		String texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setUf(texto);
						
													/*Municipio*/
		expressao = Pattern.compile("[A-Z][A-Z]+"); 
		executaExpressao = expressao.matcher(investimento.getMunicipio());
		texto = "";
		String c = null;
		while(executaExpressao.find()) { 
			  c = executaExpressao.group();
			  texto += c + " ";
		}  
		investimento.setMunicipio(texto);
		
													/*Situa��o*/
		
		expressao = Pattern.compile("[^\\w][A-Z][a-z�-�]*"); 
		executaExpressao = expressao.matcher(investimento.getSituacao());
		texto = "";
		c = null;
		while(executaExpressao.find()) { 
			  c = executaExpressao.group();
			  texto += c;
		}  
		investimento.setSituacao(texto);
		expressao = Pattern.compile("[A-Z][a-z�-�]+"); 
		executaExpressao = expressao.matcher(investimento.getSituacao());
		texto = "";
		c = null;
		while(executaExpressao.find()) { 
			  c = executaExpressao.group();
			  texto += c + " ";
		}  
		investimento.setSituacao(texto);
		
													/*Objetivo de Convenio*/
		texto = investimento.getObjetivoConvenio().replaceAll("Objeto do Conv�nio:", "");
		investimento.setObjetivoConvenio(texto.replaceAll("\\s\\s", ""));
		
													/*Org�o Superior*/
		expressao = Pattern.compile("[A-ZA-Z][A-Z\\s]+"); 
		executaExpressao = expressao.matcher(investimento.getOrgaoSuperior());
		texto = "";
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setOrgaoSuperior(texto);
		
													/*Concedente*/
		
		expressao = Pattern.compile("[A-ZA-Z][A-Z.\\s]+"); 
		executaExpressao = expressao.matcher(investimento.getConcedente());
		texto = "";
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setConcedente(texto);
		
													/*Convenente:*/
		expressao = Pattern.compile("[A-ZA-Z][A-Z\\s]+"); 
		executaExpressao = expressao.matcher(investimento.getConvenente());
		texto = "";
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setConvenente(texto);
		
		
													/*N� Original*/
		
		expressao = Pattern.compile("\\d+/\\d+"); 
		executaExpressao = expressao.matcher(investimento.getNumeroConvenioOriginal());
		texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setNumeroConvenioOriginal(texto);
												
													/*Valor Conv�nio*/
		expressao = Pattern.compile("[0123456789,]"); 
		executaExpressao = expressao.matcher(investimento.getValorConvenio());
		c = null;
		texto = "";
		while(executaExpressao.find()) { 
			c = executaExpressao.group();  
			texto += c; 
		}  
		investimento.setValorConvenio(texto);
													
													/*Valor Liberado*:*/
		expressao = Pattern.compile("[0123456789,]"); 
		executaExpressao = expressao.matcher(investimento.getValorLiberado());
		c = null;
		texto = "";
		while(executaExpressao.find()) { 
			c = executaExpressao.group();  
			texto += c; 
		}  
		investimento.setValorLiberado(texto);
													/*Valor Contrapartida: */	
		expressao = Pattern.compile("[0123456789,]"); 
		executaExpressao = expressao.matcher(investimento.getValorContraPartida());
		c = null;
		texto = "";
		while(executaExpressao.find()) { 
			c = executaExpressao.group();  
			texto += c; 
		}  
		investimento.setValorContraPartida(texto);
		
													/*Valor Ultima Libera��o*/
		expressao = Pattern.compile("[0123456789,]"); 
		executaExpressao = expressao.matcher(investimento.getValorUltimaLiberacao());
		c = null;
		texto = "";
		while(executaExpressao.find()) { 
			c = executaExpressao.group();  
			texto += c; 
		}  
		investimento.setValorUltimaLiberacao(texto);
		
													/*In�cio da Vig�ncia:*/
		expressao = Pattern.compile("\\d+/\\d+/\\d+"); 
		executaExpressao = expressao.matcher(investimento.getInicioVigencia());
		texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setInicioVigencia(texto);
		
													/*Fim da Vig�ncia:*/
		expressao = Pattern.compile("\\d+/\\d+/\\d+"); 
		executaExpressao = expressao.matcher(investimento.getFimVigencia());
		texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setFimVigencia(texto);
		
												/*Data �ltima Libera��o:*/	
		expressao = Pattern.compile("\\d+/\\d+/\\d+"); 
		executaExpressao = expressao.matcher(investimento.getDataUltimaLiberacao());
		texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setDataUltimaLiberacao(texto);
		
												/*Publica��o*/
		expressao = Pattern.compile("\\d+/\\d+/\\d+"); 
		executaExpressao = expressao.matcher(investimento.getPublicacao());
		texto = null;
		while(executaExpressao.find()) { 
			  texto = executaExpressao.group();
		}  
		investimento.setPublicacao(texto);
		
		
		return investimento;
	}
	
	public static  String limparEspaco(String texto){
		texto.replaceAll("  ", " ");
		return texto;
	}

	public static String arrumarValorMonetario(String valor){
		String s1 = valor.replaceAll(",", ".");
		return s1;
	}
	
	public Pattern getExpressao() {
		return expressao;
	}


	public void setExpressao(Pattern expressao) {
		Expressao_Regular.expressao = expressao;
	}


	public Matcher getExecutaExpressao() {
		return executaExpressao;
	}


	public void setExecutaExpressao(Matcher executaExpressao) {
		Expressao_Regular.executaExpressao = executaExpressao;
	}

}
