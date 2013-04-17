package br.com.facebug;

import java.util.ArrayList;
import java.util.Iterator;

public class TestePrograma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("maria", "maria123", "online", 2);
		
		Usuario usuario2 = new Usuario("joao", "maria123", "online", 2);
		
		RedeSocial rede = new RedeSocial(2, 3);
		
//		System.out.println(usuario1.getUsuario());
//		System.out.println(usuario2.getUsuario());
		
		boolean a = rede.CriarUsuario(usuario1);
		boolean b = rede.CriarUsuario(usuario2);
		
//		System.out.println(a);
//		System.out.println(b);
		
		RedeSocial tes;
		Usuario[] it = rede.getListaUsuarios();
		for(int i = 0; i<it.length; i++){
			
			System.out.println(it[i].getUsuario().toString());	
	
		}
		
//		System.out.println(rede.getListaUsuarios(1));

	}

}
