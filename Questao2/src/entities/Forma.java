package entities;

public abstract class Forma {
	
	private String nome;
	private String cor;
	
	public Forma(String name, String color) {
		this.nome = name;
		this.cor = color;
	}
	
	public abstract Double calcArea();
	public abstract Double calcPerimeter();
}
