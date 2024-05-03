package entities.cartas;

public class Carta implements Comparable<Carta> {
	
	private String card;
	private Naipes naipe;
	
	public Carta(String card, Naipes naipe) {
		this.card = card;
		this.naipe = naipe;
	}

	public String getCard() {
		return card;
	}

	public Naipes getNaipe() {
		return naipe;
	}
	
	@Override
	public String toString() {
		return String.format("%s de %s", card, naipe.toString());
	}

	@Override
	public int compareTo(Carta o) {
		return card.compareTo(o.card);
	}
}
