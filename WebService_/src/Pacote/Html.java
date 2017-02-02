package Pacote;
public class Html {
	private String conteudo;
	
        /*Construtores*/
        
    public Html(){
    	setConteudo(null);
	}
	
	public Html(String html){
		this.conteudo = html;
	}
        
        
        
        
   
       
        
        
        
        /*get e set*/
        
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	
}
