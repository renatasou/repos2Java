package br.com.facebug;

public class Usuario {
	private String usuario;
	private String senha;
	private String mensagemStatus;
	private Mensagem [] listaMensagens;
	
	public String getMensagemStatus() {
		return mensagemStatus;
	}

	public void setMensagemStatus(String mensagemStatus) {
		this.mensagemStatus = mensagemStatus;
	}

	public Mensagem[] getListaMensagens() {
		return listaMensagens;
	}

	public void setListaMensagens(Mensagem[] listaMensagens) {
		this.listaMensagens = listaMensagens;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public Usuario (String pLogin, String pSenha, String pMensagemStatus, int pQtdMsg) {
		this.usuario = pLogin;
		this.senha = pSenha;
		this.mensagemStatus = pMensagemStatus;
		this.listaMensagens = new Mensagem [pQtdMsg];
		
	}
	
	public String getSenha() {
		return senha;
	}

	public boolean Autenticar(String pLogin, String pSenha){
		if (this.usuario == pLogin && this.senha == pSenha) {
			return true;
		}
			return false;
	}

	public boolean PublicarMensagem(Mensagem pMensagem){
		for (int i = 0; i < listaMensagens.length; i++) {
			if (listaMensagens[i] == null){
		this.listaMensagens[i] = pMensagem;
		return true;
			}
		}
		return false;
	}
	
	public boolean DeletarMensagem(int pCodigo){
		for (int i = 0; i < listaMensagens.length; i++) {
			if (listaMensagens[i] != null && listaMensagens[i].getCodigoM() == pCodigo) {
			return true	;
			}
		}
		return false;
	}

	public String getUsuario() {
		return usuario;
	}
}
