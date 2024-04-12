package contas;

public class ContaBancaria {
	
	private static StringBuilder sb = new StringBuilder();

	private Integer accountNumber;
	private Double saldo;
	private Double limiteCredito;
	public ContaBancaria(Integer accountNumber, Double saldo, Double limiteCredito) {
		this.accountNumber = accountNumber;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	public Double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(Double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	public Double getLimiteCredito() {
		return limiteCredito;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Número da Conta: %d\n", accountNumber));
		sb.append(String.format("Saldo atual: %d", saldo));
		return sb.toString();
	}
	
}
