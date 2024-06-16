package entities.cartas;

public abstract class JogoDeCartas {
	
	public abstract Boolean getExec();
	public abstract void virar();
	public abstract void jogar();
	public abstract void descartar();
	public abstract void showCards();
	public abstract void showCardsInOrder();
}
