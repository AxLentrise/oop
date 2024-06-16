package agregacao.exerc2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	private List<Funcionario> departamento = new ArrayList<>();
	
	public Departamento() {}
	
	public void add(Funcionario funcionario) {
		if(departamento.contains(funcionario)) {
			System.out.println("Funcionário já cadastrado no Sistema.");
		} else departamento.add(funcionario);
	}
	
	public void remove(Funcionario funcionario) {
		if(!departamento.contains(funcionario)) {
			System.out.println("Funcionário não existe no Sistema.");
		} else departamento.remove(funcionario);
	}
	
	public void show() {
		if(departamento.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado.");
		} else for(Funcionario funcionario : departamento) System.out.print(funcionario);
	}
}
