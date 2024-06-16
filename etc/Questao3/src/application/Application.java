package application;

import entities.Empregado;
import entities.EmpregadoHoras;
import entities.EmpregadoSalario;

public class Application {

	public static void main(String [] args) {
		
		Empregado hSalario = new EmpregadoHoras("Zika", "Protozoariao", 2834, 3450.00);
		Empregado eSalario = new EmpregadoSalario("Zika", "Protozoariao", 2834, 3450.00);
		
		System.out.printf("Salário Mensal: %.2f\n", eSalario.calcSalario());
		System.out.printf("Salário equivalente as horas trabalhadas: %.2f\n", hSalario.calcSalario(48.0));
	}
}
