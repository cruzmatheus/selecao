package br.com.digithobrasil.selecao.enumerations;

public enum CustoEnum {
	
	ALIMENTACAO("ALIMENTACAO", "Alimenta��o"),
	HOSPEDAGEM("HOSPEDAGEM", "Hospedagem"),
	INSCRICAO("INSCRICAO", "Inscri��o"),
	TRANSPORTE("TRANSPORTE", "Transporte"),
	PASSAGEM("PASSAGEM", "Passagem");
	
	private final String chave;
	private final String titulo;
	
	private CustoEnum(String valor, String titulo) {
		this.chave = valor;
		this.titulo = titulo;
	}

	public String getChave() {
		return chave;
	}
	
	public String getTitulo() {
		return titulo;
	}

}
