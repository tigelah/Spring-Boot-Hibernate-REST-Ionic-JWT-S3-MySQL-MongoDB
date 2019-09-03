 package br.com.rodrigo.cursomc.domain.enums;

public enum TypeClient {
	PESSOAFISICA(1,"Pessoa Fisica"),
	PESSOAJURIDICA(2,"Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TypeClient(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TypeClient toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (TypeClient x : TypeClient.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
