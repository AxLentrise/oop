package produtos;

public class Produto {

	private String name;
	private Double price;
	private Integer stockQuantity;
	
	public Produto(String name, Double price, Integer stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	public Double calcularValorTotalEstoque() {
		return price*stockQuantity;
	}
}
