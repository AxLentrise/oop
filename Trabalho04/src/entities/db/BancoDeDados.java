package entities.db;

import entities.veiculos.Carro;

public abstract class BancoDeDados {
	
	public abstract void inserir(Carro c);
	public abstract void atualizar(String text);
	public abstract void remover(String name);
	public abstract void remover(Carro c);
	public abstract void consultar(String name);
}
