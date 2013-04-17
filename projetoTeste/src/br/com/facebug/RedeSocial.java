package br.com.facebug;


public class RedeSocial {
	private Usuario [] listaUsuarios;
	private Propaganda [] listaPropagandas;
	
	public Usuario[] getListaUsuarios() {
		return listaUsuarios;
	}


	public void setListaUsuarios(Usuario[] listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}


	public Propaganda[] getListaPropagandas() {
		return listaPropagandas;
	}


	public void setListaPropagandas(Propaganda[] listaPropagandas) {
		this.listaPropagandas = listaPropagandas;
	}
	
	
	public RedeSocial(int pQtdMaxUsuario, int pQtdMaxPropaganda){
		this.listaUsuarios = new Usuario[pQtdMaxUsuario];
		//this.listaPropagandas = new Propaganda[pQtdMaxPropaganda];
	}
	
	
	public boolean CriarUsuario(Usuario pUsuario) {
		boolean busca = BuscarUsuario(pUsuario.getUsuario());
		if (busca == false) {
			for (int i = 0; i < listaUsuarios.length; i++) {
				if(listaUsuarios[i] == null) {
					listaUsuarios[i] = pUsuario;
					return true;
				}
			}
		
		}
		return false;
	}
	
	
	
	public boolean BuscarUsuario(String pUsuario)
	{
		for (int i = 0; i < listaUsuarios.length; i++) {
			if (listaUsuarios[i] != null &&
					listaUsuarios[i].getUsuario().equals(pUsuario))
			{
				return true;
			}	
		}
		return false;
	}
	
	public boolean ExcluirUsuario(String pLogin) {
		for (int i = 0; i < listaUsuarios.length; i++) {
			if (listaUsuarios[i] != null && listaUsuarios[i].getUsuario().equals(pLogin)) {
			listaUsuarios[i] = null;
			return true	;
			}
		}
		return false;
	}
	
	public Usuario AcessarConta(String pLogin, String pSenha) {
		for (int i = 0; i < listaUsuarios.length; i++) {
			if ( listaUsuarios[i]!= null && 
				 listaUsuarios[i].getUsuario().equals(pLogin) &&
				 listaUsuarios[i].getSenha().equals(pSenha)) {
				return listaUsuarios[i];
			}
		}
		return null;
	}
	
	public boolean CriarPropaganda(Propaganda pPropaganda) {
		for (int i = 0; i < listaPropagandas.length; i++) {
			if (listaPropagandas[i] == null) {
				listaPropagandas[i] = pPropaganda;
				return true;
			}
		}
		return false;
	}
	
	public boolean DeletarPropaganda(int pCodigo) {
		for (int i = 0; i < listaPropagandas.length; i++) {
			if (listaPropagandas[i] != null && listaPropagandas[i].getCodigoP() == pCodigo) {
				listaPropagandas[i] = null;
				return true;
			}
		}
		return false;
	}
}
