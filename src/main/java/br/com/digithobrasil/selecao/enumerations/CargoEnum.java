package br.com.digithobrasil.selecao.enumerations;

public enum CargoEnum {
	
	DEV("DEV", "Desenvolvedor"),
	SM("SM", "Scrum Master"),
	PO("PO", "Product Owner");
	
	private final String chave;
	private final String titulo;
	
	private CargoEnum(String valor, String titulo) {
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
