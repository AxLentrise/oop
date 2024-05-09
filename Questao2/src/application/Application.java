package application;

import entities.Circulo;
import entities.Forma;
import entities.Quadrado;
import entities.Triangulo;

public class Application {

	public static void main(String [] args) {
		Forma quadrado = new Quadrado("Quadrado", "Azul", 2.5);
		Forma circulo = new Circulo("Circulo", "Vermelho", 4.0);
		Forma triangulo = new Triangulo("Triangulo", "Amarelo", 2.0, 2.0, 2.0);
		
		System.out.println("\u001B[4;37mFigura    |Area      |Perimetro\u001B[0m|");
		System.out.printf("Quadrado  |%-10.2f|%-9.1f|\n", quadrado.calcArea(), quadrado.calcPerimeter());
		System.out.printf("Circulo   |%-10.2f|%-9.1f|\n", circulo.calcArea(), circulo.calcPerimeter());
		System.out.printf("Triangulo |%-10.2f|%-9.1f|\n", triangulo.calcArea(), triangulo.calcPerimeter());
	}
}
