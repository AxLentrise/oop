package application;

import contas.ContaBancaria;
import estudantes.Estudante;
import funcionarios.Analista;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import funcionarios.Vendedor;
import produtos.Produto;

public class Application {
	
	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Fabio", "Gerente de TI", 4500.00);
		System.out.println(gerente.imprimirContraCheque());
		Funcionario analista = new Analista("Maria", "Analista de BD", 3780.00);
		System.out.println(analista.imprimirContraCheque());
//		System.out.println("\n");
		Funcionario vendedor = new Vendedor("Cassiano", "Vendedor de Hardware", 2450.00, 23);
		System.out.println(vendedor.imprimirContraCheque());
		
		Estudante estudante1 = new Estudante("Diogo", 22, "3ADS");
		estudante1.addNota(10.0);
		estudante1.addNota(10.0);
		estudante1.addNota(10.0);
		System.out.printf("Aluno: %s | Media: %.1f\n", estudante1.getName(), estudante1.calcularMedia());
		Estudante estudante2 = new Estudante("Klebin", 19, "1LOG");
		estudante2.addNota(9.0);
		estudante2.addNota(8.5);
		estudante2.addNota(7.3);
		System.out.printf("Aluno: %s | Media: %.1f\n", estudante2.getName(), estudante2.calcularMedia());
		
		System.out.println();
		Produto produto1 = new Produto("Manga", 12.50, 50);
		System.out.printf("Produto: %s | Valor total do estoque: %.2f\n", produto1.getName(), produto1.calcularValorTotalEstoque());
		Produto produto2 = new Produto("Iphone 15", 5600.50, 12);
		System.out.printf("Produto: %s | Valor total do estoque: %.2f\n", produto2.getName(), produto2.calcularValorTotalEstoque());
		
		System.out.println();
		ContaBancaria acc1 = new ContaBancaria(33456, 500.00, 250.00);
		System.out.printf("Conta: %d Saldo: %.2f\n", acc1.getAccountNumber(), acc1.consultarSaldo());
		acc1.sacar(100.00);
		acc1.depositar(57.25);
		System.out.printf("Conta: %d Saldo: %.2f\n", acc1.getAccountNumber(), acc1.consultarSaldo());

		ContaBancaria acc2 = new ContaBancaria(37656, 13500.00, 9250.00);
		System.out.printf("Conta: %d Saldo: %.2f\n", acc2.getAccountNumber(), acc2.consultarSaldo());
		acc2.sacar(100.00);
		acc2.depositar(57.25);
		System.out.printf("Conta: %d Saldo: %.2f\n", acc2.getAccountNumber(), acc2.consultarSaldo());
	}
}
