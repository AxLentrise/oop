package composicao.exerc4;

public class Carro {
	
	private String modelo;
	private Motor motor;
	
	public Carro(String modelo) {
		this.modelo = modelo;
		motor = new Motor(133, 1.0, "Gasolina");
	}
		
	public String getModelo() {
		return modelo;
	}

	public void show() {
		System.out.printf("\nModelo: %-15s | Especificações do Motor: %s", modelo, motor);
	}
	
}
