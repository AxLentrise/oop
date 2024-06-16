package composicao.exerc3;

public class Computador {
	
	private CPU cpu;
	private Memoria memoria;
	private Disco disco;
	
	public Computador() {
		cpu = new CPU();
		memoria = new Memoria();
		disco = new Disco();
	}

	public CPU getCpu() {
		return cpu;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public Disco getDisco() {
		return disco;
	}
	
	public void show() {
		System.out.println("  CPU  | Memoria | Disco");
		System.out.printf("            %-4.2f |  %-4.1f   | %-4.1f", cpu.getFrequencia(), memoria.getCapacidade(), disco.getEspaco());
	}
}
