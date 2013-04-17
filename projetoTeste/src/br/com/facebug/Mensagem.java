package br.com.facebug;

public class Mensagem {
	private int codigoM;
	private String texto; 


	public Mensagem(String pMensagem){
		this.codigoM = ++codigoM;
		this.texto = pMensagem;
	}


	public int getCodigoM() {
		return codigoM;
	}


}