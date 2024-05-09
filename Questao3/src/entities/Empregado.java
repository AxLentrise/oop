package entities;

public abstract class Empregado {

	private String nome;
	private String departamento;
	private Integer id;
	
	public Empregado(String nome, String departamento, Integer id) {
		this.nome = nome;
		this.departamento = departamento;
		this.id = id;
	}

	public abstract Double calcSalario();
	public abstract Double calcSalario(Double v);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
