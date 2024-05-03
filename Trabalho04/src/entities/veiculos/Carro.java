package entities.veiculos;

import java.util.Objects;

public class Carro extends Veiculo {
	
	private static final StringBuilder sb = new StringBuilder();

	private String model;
	private Double price;
	private Integer year;
	
	public Carro(String model, Double price, Integer year) {
		this.model = model;
		this.price = price;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro acelerando.\n");
	}

	@Override
	public void frear() {
		System.out.println("Carro freando.\n");
	}

	@Override
	public String obterInformacoes() {
		sb.setLength(0);
		sb.append(String.format("%-14s|%-12.2f |%d |", this.model, this.price, this.year));
		return sb.toString();
	}
}
