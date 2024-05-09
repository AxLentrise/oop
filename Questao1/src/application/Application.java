package application;

import entities.Divisao;
import entities.Multiplicacao;
import entities.OperacaoMatematica;
import entities.Soma;
import entities.Subtracao;

public class Application {

	public static void main(String [] args) {
		
		OperacaoMatematica soma = new Soma();
		OperacaoMatematica subtracao = new Subtracao();
		OperacaoMatematica multiplicacao = new Multiplicacao();
		OperacaoMatematica divisao = new Divisao();
		
		System.out.printf("Soma: 10 + 22 = %.1f\n", soma.calcula(10.0, 22.0));
		System.out.printf("Subtração: 99 - 35 = %.1f\n", subtracao.calcula(99.0, 35.0));
		System.out.printf("Multiplicação: 78 * 88 = %.1f\n", multiplicacao.calcula(78.0, 88.0));
		System.out.printf("Divisao: 9 / 64 = %.1f\n\n", soma.calcula(10.0, 22.0));
		System.out.printf("Divisão: 86 / 0 = %.1f\n", divisao.calcula(86.0, 0.0));
	}
}
