package agregacao.exerc5;

public class Endereco {
	
	private String rua;
	private String cidade;
	private Integer cep;
	
	public Endereco(String rua, String cidade, Integer cep) {
		this.rua = rua;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public String getCidade() {
		return cidade;
	}

	public Integer getCep() {
		return cep;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s; %s", cep, cidade, rua);
	}
}
