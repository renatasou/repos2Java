package br.com.facebug;

public class Propaganda {
	private int codigoP;
	private String descri�ao;
	
	
	public Propaganda(String pPropaganda) {
		this.codigoP = ++codigoP;
		this.descri�ao = pPropaganda;
	}


	public int getCodigoP() {
		return codigoP;
	}
}
