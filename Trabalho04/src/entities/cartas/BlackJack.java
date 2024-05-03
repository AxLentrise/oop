package entities.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackJack extends JogoDeCartas {

	private static final StringBuilder sb = new StringBuilder();
	private List<Carta> cartas = new ArrayList<>();
	private List<Carta> userCards = new ArrayList<>();
	private List<Carta> dealerCards = new ArrayList<>();
	private Integer index = 0;
	
	private int userPoints = 0;
	private int dealerPoints = 0;
	
	private Boolean executing = true;
	
	public BlackJack() {
		innitialize();
		
		calcUserPoints();
		calcDealerPoints();
	}
	
	@Override
	public Boolean getExec() {
		return executing;
	}
	
	private void innitialize() {
		cartas.removeAll(cartas);
		
		String card = "";
		for(Integer i = 2; i < 15; i++) {
			
			if(i < 11) {
				card = i.toString();
			} else {
				switch(i){
					case 11: card = "Q"; break;
					case 12: card = "J"; break;
					case 13: card = "K"; break;
					case 14: card = "A"; break;
				}
			}
			
			for(Naipes naipe : Naipes.values()) {
				cartas.add(new Carta(card, naipe));
			}
		}
		
		Collections.shuffle(cartas);
		
		// Inicializa as cartas do usuário
		for(int u = 0; u < 2; u++) {
			userCards.add(cartas.get(0));
			cartas.remove(0);
		}
		
		// Inicializa as cartas do dealer
		for(int d = 0; d < 2; d++) {
			dealerCards.add(cartas.get(0));
			cartas.remove(0);
		}
	}
	
	private void calcUserPoints() {
		userPoints = 0;
		
		for(Carta c : userCards) {
			if(Character.isDigit(c.getCard().charAt(0))) {
				userPoints += Integer.parseInt(c.getCard());
			} else if(c.getCard() == "A") {
				userPoints += 11;
			} else userPoints += 10;
		
			if(userPoints > 21 && c.getCard() == "A") {
				userPoints -= 10;
			}
		}
				
		System.out.printf("Pontos: %d\n", userPoints);
		if(userPoints > 21) {
			executing = false;
			System.out.println("Você perdeu.");
		}
		
		if(userPoints == 21) {
			executing = false;
			System.out.println("Blackjack! Você venceu.");			
		}
	}
	
	private void calcDealerPoints() {
		dealerPoints = 0;
		
		for(Carta c : dealerCards) {
			if(Character.isDigit(c.getCard().charAt(0))) {
				dealerPoints += Integer.parseInt(c.getCard());
			} else if(c.getCard() == "A") {
				dealerPoints += 11;
			} else dealerPoints += 10;
		
			if(dealerPoints > 21 && c.getCard() == "A") {
				dealerPoints -= 10;
			}
		}
		
		
		if(dealerPoints > 21) {
			executing = false;
			System.out.println("Dealer perdeu.");
		}
		
		if(dealerPoints == 21) {
			executing = false;			
			System.out.println("Dealer vendeu");
		}
	}
	
	@Override
	public void showCards() {
		cartas.forEach(System.out::println);
	}
	
	@Override
	public void showCardsInOrder() {
		List<Carta> inOrder = cartas;
		Collections.sort(inOrder);
		inOrder.forEach(System.out::println);
	}
	
	@Override
	public void virar() {
		if(index < 52) {
			userCards.add(cartas.get(0));
			cartas.remove(0);
			index++;
			calcUserPoints();
		} else {
			System.out.println("Não tem mais cartas no jogo.");
		}
	}

	@Override
	public void jogar() {
		System.out.println("Jogo finalizado, calculando resultado:");
		calcUserPoints();
		calcDealerPoints();
		
		System.out.printf("Dealer Points: %d\n", dealerPoints);
		System.out.printf("Player Points: %d\n", userPoints);
		
		if(userPoints == dealerPoints) {
			System.out.println("Empate!");			
		} else if(userPoints > dealerPoints) {
			System.out.println("Jogador venceu!");
		} else System.out.println("Dealer venceu!");
		
		executing = false;
	}

	
	// Em black jack ninguem pode descartar cartas, mas para usar todos os métodos vou adicionar
	@Override
	public void descartar() {
		userCards.remove(0);
	}
}
