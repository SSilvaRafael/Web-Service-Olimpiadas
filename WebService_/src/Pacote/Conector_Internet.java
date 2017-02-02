package Pacote;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Conector_Internet {
	private URL url;
	private URLConnection conexao;
	private BufferedReader bufferLeitura;
	private String dominio;
	
	public Conector_Internet(String dominio){
		url = null;
		conexao = null;
		bufferLeitura = null;
		this.dominio = dominio;
	}
	
	public void startConexao(){
		try{
			setUrl(new java.net.URL(dominio));
			conexao = url.openConnection(); // abrir conexão
			bufferLeitura = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
		
		}catch(java.net.MalformedURLException e){
			System.out.println("Erro ao criar URL. Formato inválido.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void finalizarBuscaHtml(){
		 try {
			bufferLeitura.close();
			bufferLeitura = null;
			url = null;
			conexao = null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public URLConnection getUrlConexao() {
		return conexao;
	}

	public void setUrlConexao(URLConnection urlConexao) {
		this.conexao = urlConexao;
	}

	public BufferedReader getBufferLeitura() {
		return bufferLeitura;
	}

	public void setBufferLeitura(BufferedReader bufferLeitura) {
		this.bufferLeitura = bufferLeitura;
	}
        
        public void setDominio(String dominio){
            this.dominio = dominio;
        }
}



