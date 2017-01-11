package br.com.tidicas.dados;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que representa o xml de saída do job de teste do SpringBatch.
 * 
 * @author Evaldo Junior
 *
 */
@XmlRootElement(name = "record")
public class Report {

	private int id;
	private String nomeUsuario;
	private Date data;

	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name = "nomeUsuario")
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", nomeUsuario=" + nomeUsuario + "]";
	}
	

}