package br.com.digithobrasil.selecao.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;

import br.com.digithobrasil.selecao.enumerations.CargoEnum;
import br.com.digithobrasil.selecao.enumerations.CustoEnum;
import br.com.digithobrasil.selecao.model.Alimentacao;
import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.Curso;
import br.com.digithobrasil.selecao.model.Custo;
import br.com.digithobrasil.selecao.model.DadosBancarios;
import br.com.digithobrasil.selecao.model.Hospedagem;
import br.com.digithobrasil.selecao.model.Inscricao;
import br.com.digithobrasil.selecao.model.Passagem;
import br.com.digithobrasil.selecao.model.Solicitacao;
import br.com.digithobrasil.selecao.model.Transporte;
import br.com.digithobrasil.selecao.service.SolicitacaoService;

@ViewAccessScoped
@Named
public class SolicitacaoController implements Serializable {

	private static final long serialVersionUID = -3980582597514042133L;
	
	@Inject
	private Solicitacao solicitacao;
	@Inject
	private Colaborador colaborador;
	@Inject
	private DadosBancarios dadosBancarios;
	@Inject
	private Curso curso;
	@Inject
	private SolicitacaoService solicitacaoService;
	
	private String tipoCusto;
	private double valorCusto;
	
	private List<Custo> custos = new ArrayList<Custo>();
	
	public void efetuarSolicitacao() {
		solicitacao.preencherSolicitacao(colaborador, curso, custos);
		solicitacaoService.salvar(solicitacao);
	}
	
	public void adicionarCusto() {
		Custo custo = null;
		switch (tipoCusto) {
		case "ALIMENTACAO":
			custo = new Alimentacao();
			break;
		case "HOSPEDAGEM":
			custo = new Hospedagem();
			break;
		case "INSCRICAO":
			custo = new Inscricao();
			break;
		case "TRANSPORTE":
			custo = new Transporte();
			break;
		case "PASSAGEM":
			custo = new Passagem();
			break;
		default:
			break;
		}
		
		custo.setValor(valorCusto);
		custos.add(custo);
		custo.getTipoCusto();
	}
	
	public void onChange() {
		
	}
	
	public void handleKeyEvent() {
	}
	
	
	public CargoEnum[] getCargos() {
		return CargoEnum.values();
	}
	
	public CustoEnum[] getTipoCustos() {
		return CustoEnum.values();
	}
	
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Custo> getCustos() {
		return custos;
	}
	public void setCustos(List<Custo> custos) {
		this.custos = custos;
	}


	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}


	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}


	public String getTipoCusto() {
		return tipoCusto;
	}


	public void setTipoCusto(String tipoCusto) {
		this.tipoCusto = tipoCusto;
	}


	public double getValorCusto() {
		return valorCusto;
	}


	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}
	
	
	
	
	

}