package br.com.digithobrasil.selecao.model;

import java.io.Serializable;
import java.util.Date;

public class Colaborador implements Serializable {
	
	private static final long serialVersionUID = 6510214439391054492L;
	
	private Integer id;
	private String nome;
	private String cargo;
	private String matricula;
	private Date dataNascimento;
	private String rg;
	private String cpf;
	private String email;
	private String telefone;
	private DadosBancarios dadosBancarios;
	private Equipe equipe;
	
	public Colaborador() {
		this.equipe = EquipeFactory.equipe2;
	}

	public Colaborador(String nome, String cargo, String matricula,
			Date dataNascimento, String rg, String cpf, String email,
			String telefone, DadosBancarios dadosBancarios) {
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dadosBancarios = dadosBancarios;
		this.equipe = EquipeFactory.equipe2;
	}
	
	public Colaborador(String nome, String cargo, String matricula,
			Date dataNascimento, String rg, String cpf, String email,
			String telefone) {
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.equipe = EquipeFactory.equipe2;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
