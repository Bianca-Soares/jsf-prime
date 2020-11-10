package beans;

import java.util.Date;

public class Livro {
	private String titulo;
	private String ISBN;
	private String preco;
	private Date dataLan;
	
	public Livro() {
		super();
	}
	
	public Livro(String titulo, String ISBN, String preco, Date dataLan ) {
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.preco = preco;
		this.dataLan = dataLan;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public Date getDataLan() {
		return dataLan;
	}
	public void setDataLan(Date dataLan) {
		this.dataLan = dataLan;
	}	
}
