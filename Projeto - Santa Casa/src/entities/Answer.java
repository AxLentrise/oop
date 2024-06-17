package entities;

import java.util.ArrayList;
import java.util.List;

import services.AnswerResult;

public class Answer implements AnswerResult {

	private User user;
	private List<Choices> choices = new ArrayList<>();
	
	private Double finalResult;
	private Choices finalClassification;
	
	public Answer(User user, List<Choices> choices) {
		this.user = user;
		this.choices = choices;
	}
	
	public User getUser() {
		return user;
	}
	
	public List<Choices> getChoices() {
		return choices;
	}
	
	@Override
	public void getResult() {
		// TODO Auto-generated method stub
		
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
