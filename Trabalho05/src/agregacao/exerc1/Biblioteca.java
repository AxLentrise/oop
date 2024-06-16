package agregacao.exerc1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Livro> acervo = new ArrayList<>();
	
	public Biblioteca() {
		
	}
	
	public void add(Livro livro) {
		if(acervo.contains(livro)) {
			System.out.println("Livro já cadastrado.");
		} else acervo.add(livro);
	}
	
	public void remove(Livro livro) {
		if(!acervo.contains(livro)) {
			System.out.println("Livro não existe no Sistema.");
		} else acervo.remove(livro);
	}
	
	public void show() {
		if(acervo.isEmpty()) {
			System.out.println("Nenhum livro cadastrado ao Sistema.");
		} else for(Livro livro : acervo) System.out.print(livro);
	}
}
