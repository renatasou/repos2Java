package br.com.facebug;

public class Propaganda {
	private int codigoP;
	private String descriçao;
	
	
	public Propaganda(String pPropaganda) {
		this.codigoP = ++codigoP;
		this.descriçao = pPropaganda;
	}


	public int getCodigoP() {
		return codigoP;
	}
}
