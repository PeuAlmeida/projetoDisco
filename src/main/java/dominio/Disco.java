package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeDoDisco;
	private String nomeDaBanda;
	private String genero;
	private int anoDeLancamento;
	
	public Disco () {
	}

	public Disco(Integer id, String nomeDoDisco, String nomeDaBanda, String genero, int anoDeLancamento) {
		super();
		this.id = id;
		this.nomeDoDisco = nomeDoDisco;
		this.nomeDaBanda = nomeDaBanda;
		this.genero = genero;
		this.anoDeLancamento = anoDeLancamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDoDisco() {
		return nomeDoDisco;
	}

	public void setNomeDoDisco(String nomeDoDisco) {
		this.nomeDoDisco = nomeDoDisco;
	}

	public String getNomeDaBanda() {
		return nomeDaBanda;
	}

	public void setNomeDaBanda(String nomeDaBanda) {
		this.nomeDaBanda = nomeDaBanda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Disco [id = " + id + ", nomeDoDisco = " + nomeDoDisco + ", nomeDaBanda = " + nomeDaBanda + ", genero = "
				+ genero + ", anoDeLancamento = " + anoDeLancamento + "]";
	}
	
	
	
}
