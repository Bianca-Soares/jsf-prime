package login;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named("/logar")
@RequestScoped
public class LogarBean {

	private String nome;
	private String senha;

	public String logar() {
		if (autenticar(nome, senha)) {
			FacesContext.getCurrentInstance().getExternalContext()
			       .getSessionMap().put("USUARIO", nome.toUpperCase());
			return "questao2.xhtml";
		}
	    FacesMessage msgErro = new FacesMessage("Erro de Login!");
	    FacesContext.getCurrentInstance().addMessage("msg", msgErro);
		return "login";
	}
	

	public String getNome() { return nome; 	}
	public void setNome(String nome) { this.nome = nome; }
	public String getSenha() { return senha; 	}
	public void setSenha(String senha) { this.senha = senha; }

	private boolean autenticar(String nome, String senha) {
		if (nome.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin") )
			return true;
		
		return false;
	}
	
	
	   public String logout() {
		    
		      return "login"; 
	   }

	   
	   
}
