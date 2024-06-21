package entities;

import java.util.ArrayList;
import java.util.List;

import services.AnswerResult;

public class Answer implements AnswerResult {

	private User user;
	private List<Choices> choices = new ArrayList<>();
	
	private float finalResult;
	private Choices finalClassification;
	
	public Answer(User user, List<Choices> choices) {
		this.user = user;
		this.choices = choices;
		
		getResult();
	}
	
	public User getUser() {
		return user;
	}
	
	public List<Choices> getChoices() {
		return choices;
	}
	
	public float getFinalResult() {
		return finalResult;
	}
	
	public Choices getFinalClassification() {
		return finalClassification;
	}
	
	@Override
	public void getResult() {
		int sum = 0;
		for(Choices choice : choices) {
			switch(choice) {
				case EXCELENTE: sum += 10; break;
				case SATISFATORIO: sum += 9; break;
				case RAZOAVEL: sum += 8; break;
				case INVALIDA: sum += 5; break;
			}
		}
		
		finalResult = sum / 5;
		
		if(finalResult == 10) finalClassification = Choices.EXCELENTE;
		if(finalResult < 10 && finalResult >= 9) finalClassification = Choices.SATISFATORIO;
		if(finalResult < 9) finalClassification = Choices.RAZOAVEL;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		int n = 1;
		sb.setLength(0);
		sb.append(String.format("\nNome: %-10s", user.getNome()));
		sb.append(String.format("\nCPF: %-14d", user.getCpf()));
		sb.append(String.format("\nIdade: %-3d", user.getIdade()));
		sb.append("\n");
		for(Choices choice : choices) {
			sb.append(String.format("Pergunta #%d - Resposta: %s\n", n, choice));
			n++;
		}
		
		return sb.toString();
	}
	
}
