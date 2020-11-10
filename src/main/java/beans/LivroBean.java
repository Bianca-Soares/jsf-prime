package beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@RequestScoped
public class LivroBean implements Serializable {
	
	private Livro livro= new Livro();
	private List<Livro> listaLivro= new ArrayList<Livro>();
	Date dataLan = new Date();
	Calendar cal = new GregorianCalendar();
	
	
	public LivroBean() {
		formatarData(dataLan);
		this.listaLivro.add(new Livro("As aventuras","1233", "12", dataLan ));
		livro= new Livro();
	}
	
	private void formatarData(Date dataLan2) {
		String strData = "000";  
	 
		
	}

	public String addLivro() {
		formatarData(dataLan);
		
		listaLivro.add(livro);
		
		livro = new Livro();
	    
	    addMessagem("Success", "Novo livro salvo");
	     
	    return "questao2Inicial.xhtml";
	}

	
	public String removerLivro() {
		listaLivro.remove(livro);
	     
		livro= new Livro();
	    return "questao2Inicial.xhtml";
	}
	
	public String alterarLivro() {
		listaLivro.remove(livro);
	     
		livro= new Livro();
	    return "questao2Inicial.xhtml";
	}
	
	private void addMessagem(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getListaLivro(){
		
		return listaLivro;
	}
}
