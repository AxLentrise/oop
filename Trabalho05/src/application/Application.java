package application;

import agregacao.exerc1.Biblioteca;
import agregacao.exerc1.Livro;
import agregacao.exerc2.Departamento;
import agregacao.exerc2.Funcionario;
import agregacao.exerc5.Endereco;
import agregacao.exerc5.Pessoa;
import composicao.exerc3.Computador;
import composicao.exerc4.Carro;

public class Application {
	public static void main(String [] args) {
		
		// Exercício 1: Biblioteca e Livros (Agregação)
		
		System.out.print("Biblioteca");
		Livro livro1 = new Livro("György Lukács", "Para uma Ontologia do ser Social I", 857559639);
		Livro livro2 = new Livro("William Blum", "Killing Hope", 1350348198);
		Livro livro3 = new Livro("Toby Ord", "The Precipice", 316484911);
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.add(livro1);
		biblioteca.add(livro2);
		biblioteca.add(livro3);
		biblioteca.show();
		System.out.println("\n");
		
		// Exercício 2: Departamento de Funcionários (Agregação)
		
		System.out.print("Departamento");
		Funcionario func1 = new Funcionario("György Lukács", "Escritor", 23500.0);
		Funcionario func2 = new Funcionario("William Blum", "Escritor", 7680.0);
		Funcionario func3 = new Funcionario("Toby Ord", "Escritor", 10000.0);
		
		Departamento departamento = new Departamento();
		departamento.add(func1);
		departamento.add(func2);
		departamento.add(func3);
		departamento.show();
		System.out.println("\n");
		
		// Exercício 3: Computador e Componentes (Composição)
		
		System.out.print("Computador");
		Computador computador = new Computador();
		computador.show();
		System.out.println("\n");
		
		// Exercício 4: Carro e Motor (Composição)
		
		System.out.print("Carro");
		Carro carro = new Carro("Civic");
		carro.show();
		System.out.println("\n");
		
		// Exercício 5: Pessoa e Endereço (Agregação)
		
		System.out.print("Pessoa");
		Endereco endereco = new Endereco("Av. Paulista", "São Paulo", 1311200);
		Pessoa pessoa = new Pessoa("Marcos", endereco);
		System.out.println(pessoa);
		
	}
}
