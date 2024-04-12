package estudantes;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

	private String name;
	private Integer idade;
	private String turma;
	private List<Double> notas = new ArrayList<>();

	public Estudante(String name, Integer idade, String turma) {
		this.name = name;
		this.idade = idade;
		this.turma = turma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void addNota(Double nota) {
		notas.add(nota);
	}

	public Double calcularMedia() {
		int iterator = 0;
		Double sum = 0.0;
		for(Double nota : notas) {
			sum += nota;
			iterator++;
		}
		return sum/iterator;
	}
}
