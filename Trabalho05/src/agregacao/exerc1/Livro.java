package agregacao.exerc1;

public class Livro {
	
	private String autor;
	private String titulo;
	private Integer isbn;
	
	public Livro(String autor, String titulo, Integer isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	public String getAuthor() {
		return autor;
	}

	public void setAuthor(String autor) {
		this.autor = autor;
	}

	public String getTitle() {
		return titulo;
	}

	public void setTitle(String titulo) {
		this.titulo = titulo;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return String.format("\nTítulo: %-50s | Autor: %-20s | ISBN: %-12d", titulo, autor, isbn);
	}
}
