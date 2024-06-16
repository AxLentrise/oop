package agregacao.exerc5;

public class Pessoa {
	
	private String nome;
	private Endereco endereco;
	
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("\n%s | %s", nome, endereco);
	}
}
