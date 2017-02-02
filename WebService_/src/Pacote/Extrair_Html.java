package Pacote;

import java.io.IOException;

public abstract class Extrair_Html {
	protected Conector_Internet c;
	protected Html html;
	
	
	
	
	public Html buscarHtml(){
		c.startConexao();
		String texto = ""; 
		String linha = null;
		Html html = null;
		try {
			while ((linha = c.getBufferLeitura().readLine()) != null){
                                 texto += linha + "\n";
				 linha = null;
			}
			
			html = new Html(texto);
			texto = null;
			c.finalizarBuscaHtml();
			return html;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return html;
	}
	
	
	
	public String getTrechoHtml(String i, String f){
		   int ini = html.getConteudo().indexOf(i); //depende do sistema operacional
	       int fim = 0;
	       
	       String trecho = "";
	       String copia = html.getConteudo();
	       boolean entrou = false;
	       
	       if(ini >= 0){
	    	   copia = html.getConteudo().substring(ini);
	    	   entrou = true;
	    	   ini = 0;
	       }
	       
	       if(entrou){
	    	   fim = copia.indexOf(f);
	    	   if(fim >= 0){
	    		   trecho = copia.substring(ini, fim);
	    	   }else{
	    		   System.err.println("O final do trecho não foi encontrado.");
	    		   trecho = null;
	    	   }
	       }else{
	    	   System.err.println("O ínicio do trecho não foi encontrado.");
	       }
	       
	       
	       return trecho;
	      
	    }
	        
}
	
	

