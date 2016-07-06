package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.Date;

public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1436961543951419652L;
	
	private String titulo;
	private Date data;
	private Integer cargaHoraria;
	private String cidade;
	private String local;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	

}
