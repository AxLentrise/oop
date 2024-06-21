package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Answer;
import entities.Choices;
import entities.User;

public class Application {
	
	static final String PATH = "log.txt";
	static final boolean WRITE_LOG = false;
	
	private static int CONTROL = 5;
	private static Integer input = -1;
	private static boolean completed = false;
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Answer> answers = new ArrayList<>();
		
		do {
			User user = null;
			List<Choices> choices = new ArrayList<>();
			if(!choices.isEmpty()) choices.removeAll(choices);
			
			System.out.println("---------- Pesquisa Santa Casa ----------");
			System.out.println("Deseja responder a pesquisa anonimamente?");
			do {
				System.out.print("[0 = Não/1 = Sim]: ");
				
				try {
					input = Integer.parseInt(scan.nextLine());
					if(WRITE_LOG) updateLog("System input: " + input, false);
				} catch(NumberFormatException e) {
					if(WRITE_LOG) updateLog(e.toString(), true);
				}
				
				if(input != 1 && input != 0) {
					System.err.println("Resposta inválida. Insira novamente.");
				}
			} while(input != 1 && input != 0);
			
			// Também é uma forma de debugar rapidamente, sem precisar
			// ficar colocando dados atoa
			if(input == 1) {
				user = new User("Anônimo", 0L, 0);
				if(WRITE_LOG) updateLog("System input[user]: " + user.toString(), false);
			} else do {
				completed = true;
				String nome;
				Long cpf = 0L;
				Integer idade = 0;
				
				System.out.println("---------- Cadastro de usuário ----------");
				System.out.print("Nome: ");
				nome = scan.nextLine();
				if(WRITE_LOG) updateLog("System input[nome]: " + nome, false);
				
				System.out.print("CPF: ");
				
				try {
					cpf = Long.parseLong(scan.nextLine());
					if(WRITE_LOG) updateLog("System input[cpf]: " + cpf, false);
				} catch(NumberFormatException e) {
					if(WRITE_LOG) updateLog(e.toString(), true);
					completed = false;
				}
				
				System.out.print("Idade: ");
				
				try {
					idade = Integer.parseInt(scan.nextLine());
					if(WRITE_LOG) updateLog("System input[idade]: " + idade, false);
				} catch(NumberFormatException e) {
					if(WRITE_LOG) updateLog(e.toString(), true);
					completed = false;
				}
				
				if(completed) {
					user = new User(nome, cpf, idade);
					if(WRITE_LOG) updateLog("System New User: " + user.toString(), false);
				}
			} while(!completed);
			
			System.out.println("\n\n---------- Responda as Questões ----------");
			System.out.println("[1] = Excelente\n[2] - Satifastório\n[3] - Razoável");
			System.out.println("\n");
			System.out.println("Como você avalia a eficiência no atendimento da recepção:");
			System.out.print("Resposta:");
			
			// Q1
			try {
				input = Integer.parseInt(scan.nextLine());
				if(WRITE_LOG) updateLog("System input: " + input, false);
				switch(input) {
					case 1:
						choices.add(Choices.EXCELENTE);
						if(WRITE_LOG) updateLog("System input: " + Choices.EXCELENTE, false);
						break;
					case 2:
						choices.add(Choices.SATISFATORIO);
						if(WRITE_LOG) updateLog("System input: " + Choices.SATISFATORIO, false);
						break;
					case 3:
						choices.add(Choices.RAZOAVEL);
						if(WRITE_LOG) updateLog("System input: " + Choices.RAZOAVEL, false);
						break;
					default:
						choices.add(Choices.INVALIDA);
						if(WRITE_LOG) updateLog("System input: resposta anulada", true);
						break;
				}
			} catch(NumberFormatException e) {
				if(WRITE_LOG) updateLog(e.toString(), true);
			}
			
			System.out.println("\n");
			System.out.println("Como você avalia o ambiente de espera para o atendimento:");
			System.out.print("Resposta:");
			
			// Q2
			try {
				input = Integer.parseInt(scan.nextLine());
				if(WRITE_LOG) updateLog("System input: " + input, false);
				switch(input) {
					case 1:
						choices.add(Choices.EXCELENTE);
						if(WRITE_LOG) updateLog("System input: " + Choices.EXCELENTE, false);
						break;
					case 2:
						choices.add(Choices.SATISFATORIO);
						if(WRITE_LOG) updateLog("System input: " + Choices.SATISFATORIO, false);
						break;
					case 3:
						choices.add(Choices.RAZOAVEL);
						if(WRITE_LOG) updateLog("System input: " + Choices.RAZOAVEL, false);
						break;
					default:
						choices.add(Choices.INVALIDA);
						if(WRITE_LOG) updateLog("System input: resposta anulada", true);
						break;
				}
			} catch(NumberFormatException e) {
				if(WRITE_LOG) updateLog(e.toString(), true);
			}
			
			System.out.println("\n");
			System.out.println("Como você avalia o serviço prestado pelo profissional de saúde que fez seu atendimento:");
			System.out.print("Resposta:");
			
			// Q3
			try {
				input = Integer.parseInt(scan.nextLine());
				if(WRITE_LOG) updateLog("System input: " + input, false);
				switch(input) {
					case 1:
						choices.add(Choices.EXCELENTE);
						if(WRITE_LOG) updateLog("System input: " + Choices.EXCELENTE, false);
						break;
					case 2:
						choices.add(Choices.SATISFATORIO);
						if(WRITE_LOG) updateLog("System input: " + Choices.SATISFATORIO, false);
						break;
					case 3:
						choices.add(Choices.RAZOAVEL);
						if(WRITE_LOG) updateLog("System input: " + Choices.RAZOAVEL, false);
						break;
					default:
						choices.add(Choices.INVALIDA);
						if(WRITE_LOG) updateLog("System input: resposta anulada", true);
						break;
				}
			} catch(NumberFormatException e) {
				if(WRITE_LOG) updateLog(e.toString(), true);
			}
			
			System.out.println("\n");
			System.out.println("Como você avalia os custos em relação com o atendimento recebido:");
			System.out.print("Resposta:");
			
			// Q4
			try {
				input = Integer.parseInt(scan.nextLine());
				if(WRITE_LOG) updateLog("System input: " + input, false);
				switch(input) {
					case 1:
						choices.add(Choices.EXCELENTE);
						if(WRITE_LOG) updateLog("System input: " + Choices.EXCELENTE, false);
						break;
					case 2:
						choices.add(Choices.SATISFATORIO);
						if(WRITE_LOG) updateLog("System input: " + Choices.SATISFATORIO, false);
						break;
					case 3:
						choices.add(Choices.RAZOAVEL);
						if(WRITE_LOG) updateLog("System input: " + Choices.RAZOAVEL, false);
						break;
					default:
						choices.add(Choices.INVALIDA);
						if(WRITE_LOG) updateLog("System input: resposta anulada", true);
						break;
				}
			} catch(NumberFormatException e) {
				if(WRITE_LOG) updateLog(e.toString(), true);
			}
			
			System.out.println("\n");
			System.out.println("Como avalia sua satisfação em relação a solução prescrita pelo profissional de saúde que lhe atendeu:");
			System.out.print("Resposta:");
			
			// Q5
			try {
				input = Integer.parseInt(scan.nextLine());
				if(WRITE_LOG) updateLog("System input: " + input, false);
				switch(input) {
					case 1:
						choices.add(Choices.EXCELENTE);
						if(WRITE_LOG) updateLog("System input: " + Choices.EXCELENTE, false);
						break;
					case 2:
						choices.add(Choices.SATISFATORIO);
						if(WRITE_LOG) updateLog("System input: " + Choices.SATISFATORIO, false);
						break;
					case 3:
						choices.add(Choices.RAZOAVEL);
						if(WRITE_LOG) updateLog("System input: " + Choices.RAZOAVEL, false);
						break;
					default:
						choices.add(Choices.INVALIDA);
						if(WRITE_LOG) updateLog("System input: resposta anulada", true);
						break;
				}
			} catch(NumberFormatException e) {
				if(WRITE_LOG) updateLog(e.toString(), true);
			}
			
			Answer answer = new Answer(user, choices);
			answers.add(answer);
			if(WRITE_LOG) updateLog("System [new Answer]:" + answer, false);
			
			CONTROL--;
		} while(CONTROL > 0);
		
		for(Answer answer : answers) {
			int n = 1;
			System.out.println();
			System.out.println(answer.getUser());
			if(WRITE_LOG) updateLog(answer.getUser().toString(), false);
			if(WRITE_LOG) updateLog("Respostas da Pessoa:", false);
			System.out.println("Respostas da Pessoa:");
			for(Choices choice : answer.getChoices()) {
				System.out.printf("\nQuestão %d: %s", n, choice);
				if(WRITE_LOG) updateLog(String.format("Questão %d: %s", n, choice), false);
				n++;
			}
			
			System.out.printf("\n\nNota Final: %2.1f", answer.getFinalResult());
			System.out.printf("\nClassificação Final: %s", answer.getFinalClassification());
			
			if(WRITE_LOG) {
				updateLog(String.format("Nota Final: %2.1f", answer.getFinalResult()), false);
				updateLog(String.format("Classificação Final: %s", answer.getFinalClassification()), false);
			}
			
			System.out.println();
		}
		
		if(WRITE_LOG) updateLog("System Finish", false);
		scan.close();
	}
	
	private static void updateLog(String text, boolean err) {
		String color = err ? "\u001B[031m" : "\u001B[032m";
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(PATH, true))) {
			bf.write(color + text + "\u001B[0m");
			bf.newLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
