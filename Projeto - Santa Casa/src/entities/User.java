package entities;

public class User {
	
	private String nome;
	private Long cpf;
	private Integer idade;
	
	public User(String nome, Long cpf, Integer idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public Integer getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s | CPF: %d | Idade: %d", nome, cpf, idade);
	}
}
