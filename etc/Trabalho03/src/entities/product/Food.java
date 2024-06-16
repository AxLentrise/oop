package entities.product;

public class Food extends Product {
	
	public Food(String name, Double price) {
		super(name, price);
	}
	
	@Override
	public Double calcDiscount(Double discount) {
		return discount <= 1 ? super.getPrice()*discount : super.getPrice()*discount/100;
	}
}
