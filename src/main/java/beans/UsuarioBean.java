package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.inject.Named;

import com.sun.faces.facelets.tag.jsf.core.ViewHandler;


@Named
@SessionScoped    
public class UsuarioBean implements Serializable {

		private Usuario usuario= new Usuario();
		private List<Usuario> listaUsuarios = new ArrayList<>();
		
		
		public UsuarioBean() {
			this.listaUsuarios.add(new Usuario("João","Joaosilva33","1234"));
			this.listaUsuarios.add(new Usuario("Maria","Mariasilva33","1234"));
			
		}
		
		public String addUsuario() {
			listaUsuarios.add(usuario);
			
			usuario = new Usuario();
		    
		    addMessagem("Success", "Novo usuário salvo");
		     
		    return "aluno2primefaces.xhtml";
		}
		
		
		
		private void addMessagem(String string, String string2) {
			// TODO Auto-generated method stub
			
		}



		public Usuario getUsuario() {
			return usuario;
		}
		
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public List<Usuario> getListaUsuarios(){
			
			return listaUsuarios;
		}
}
