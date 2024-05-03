package entities.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import entities.veiculos.Carro;

public class BancoDeDadosMySQL extends BancoDeDados {

	private List<Carro> list = new ArrayList<>();
	
	public BancoDeDadosMySQL(List<Carro> list) {
		this.list = list;
	}
	
	@Override
	public void inserir(Carro c) {
		list.add(c);
	}

	@Override
	public void atualizar(String text) {
		Optional<Carro> placeholder = list.stream().filter(e -> e.getModel().contains(text)).findFirst();
		
		// TODO Código para alterar os dados, não vou fazer, já que é meio desnecessário para o exercício
		// mas a operação inicial está ai
	}

	@Override
	public void remover(String name) {
		list.removeIf(e -> e.getModel().contains(name));
		
	}

	@Override
	public void remover(Carro c) {
		list.remove(c);
	}
	
	@Override
	public void consultar(String text) {
		List<String> infos = list.stream()
			.filter(e -> e.getModel().contains(text))
			.map(e -> e.obterInformacoes())
			.collect(Collectors.toList());
		
		if(!infos.isEmpty()) {
			infos.forEach(System.out::println);			
		} else System.out.println("Não encontrou nenhum carro na busca.");
	}
}
