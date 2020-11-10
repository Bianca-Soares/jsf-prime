package beans;

public class Usuario {
	private String nome;
	private String usuarioNome;
	private String senha;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String usuarioNome, String senha) {
		this.nome = nome;
		this.usuarioNome = usuarioNome;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
	

}
