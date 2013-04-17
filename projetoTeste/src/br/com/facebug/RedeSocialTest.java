package br.com.facebug;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class RedeSocialTest {
	
	public static RedeSocial redeSocial;
	
	@BeforeClass
	public static void Inicializar() {
		redeSocial = new RedeSocial(10, 15);
	}

	@Test
	public void CriarUsuario() {
		Usuario usuario = new Usuario("jony", "ab12", "off", 5);

		boolean resultado = redeSocial.CriarUsuario(usuario);
		assertEquals(true, resultado);
	}
	
	@Test
	public void CriarUsuario2() {
		Usuario usuario = new Usuario("jack", "ab12", "off", 5);
		Usuario usuario2 = new Usuario("jony", "cb1", "on", 9);
		Usuario usuario3 = new Usuario("jack", "wsd2", "on", 20);
		redeSocial.CriarUsuario(usuario);
		boolean resultado = redeSocial.CriarUsuario(usuario2);
		assertEquals(false, resultado);
	}
	
	@Test
	public void ExcluirUsuario() {
		boolean ex = redeSocial.ExcluirUsuario("jony");
		assertEquals(true, ex);
	}

}
