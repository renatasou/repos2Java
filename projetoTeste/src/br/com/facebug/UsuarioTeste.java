package br.com.facebug;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTeste {
	
	
	public static Usuario usuario;
	
	@BeforeClass
	public static void Inicializar() {
		usuario = new Usuario("bruno", "abc123", "off", 5);
	}

	@Test
	public void PublicarTest() {
		Mensagem Mensagem = new Mensagem;
	}

}
