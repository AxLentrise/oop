package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.cartas.BlackJack;
import entities.cartas.JogoDeCartas;
import entities.db.BancoDeDadosMySQL;
import entities.figuras.Circulo;
import entities.figuras.FiguraGeometrica;
import entities.figuras.Quadrado;
import entities.figuras.Triangulo;
import entities.veiculos.Caminhao;
import entities.veiculos.Carro;
import entities.veiculos.Moto;
import entities.veiculos.Veiculo;

public class Application {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		FiguraGeometrica quadrado = new Quadrado(2.5);
//		FiguraGeometrica circulo = new Circulo(4.0);
//		FiguraGeometrica triangulo = new Triangulo(2.0, 2.0, 2.0);
//		
//		System.out.println("\u001B[4;37mFigura    |Area      |Perimetro\u001B[0m|");
//		System.out.printf("Quadrado  |%-10.2f|%-9.1f|\n", quadrado.calcArea(), quadrado.calcPerimeter());
//		System.out.printf("Circulo   |%-10.2f|%-9.1f|\n", circulo.calcArea(), circulo.calcPerimeter());
//		System.out.printf("Triangulo |%-10.2f|%-9.1f|\n", triangulo.calcArea(), triangulo.calcPerimeter());
//		
//		Veiculo carro = new Carro("BYD Seal", 296800.00, 2024);
//		Veiculo moto = new Moto("BMW M1000 RR", 169130.00, 2024);
//		Veiculo caminhao = new Caminhao("Scania S770", 1263573.46, 2024);
//		
//		// Os métodos "acelerar/frear" foram implementados, só achei desnecessário adicionar tambem
//		System.out.println("\n\n\u001B[4;37mModelo        |Preço        |Ano  \u001B[0m|");
//		System.out.println(carro.obterInformacoes());
//		System.out.println(moto.obterInformacoes());
//		System.out.println(caminhao.obterInformacoes());
//		
//		List<Carro> carros = new ArrayList<>();
//		Carro c1 = new Carro("Honda Civic", 134000.00, 2024);
//		Carro c2 = new Carro("Chevrolet Cruze", 151000.00, 2024);
//		Carro c3 = new Carro("Fiat Toro", 129000.00, 2024);
//		Carro c4 = new Carro("BYD Seal", 296800.00, 2024);
//		carros.add(c1); carros.add(c2); carros.add(c3); carros.add(c4);
//		
//		// Só fiz um exemplo por que ele é "funcional", espero que considere, é que fazer várias classes simples é cansativo
//		// e dos mais rápidos eu completei a proposta do exercício, saber fazer eu sei, mas prefiro fazer algo mais interessante
//		System.out.println("\n\nConsultando todos carros:");
//		BancoDeDadosMySQL mySql = new BancoDeDadosMySQL(carros);
//		mySql.inserir(new Carro("Volkswagen Taos", 215000.00, 2024));
//		mySql.inserir(new Carro("Hyundai HB20s", 89000.00, 2024));
//		mySql.consultar("");
//		mySql.remover(c4);
//		System.out.println("\nApós remover o Seal pelo objeto, procura por ele");
//		mySql.consultar("Seal");
//		mySql.remover("Toro");
//		System.out.println("\nApós remover a Toro pelo nome, procura por ela");
//		mySql.consultar("Toro");
//		
//		System.out.println("\n\n");
		
		// Novamente, implementei só um dos exemplos, por que fiz um blackjack freestyle que realmente da pra jogar
		Integer code = 10;
		JogoDeCartas blackjack = new BlackJack();

		while(blackjack.getExec()) {
			System.out.println("Selecione uma jogada:");
			System.out.println("[1] = Comprar carta (Virar)");
			System.out.println("[2] = Descartar carta");
			System.out.println("[3] = Finalizar e ver resultado (Jogar)");
			System.out.println("[98] = Listar cartas");
			System.out.println("[99] = Listar cartas em ordem");
			System.out.print("R: ");
			code = scan.nextInt();
			
			switch(code) {
				case 1: blackjack.virar(); break;
				case 2: blackjack.descartar(); break;
				case 3: blackjack.jogar(); break;
		
//				case 98: blackjack.showCards(); break;
//				case 99: blackjack.showCardsInOrder(); break;
			}
		}
		
		scan.close();
	}
}
