package entities;

public class BankAccount {
	
	private static final StringBuilder builder = new StringBuilder();
	
	private String holder;
	private Double balance;
	
	public BankAccount() {}
	
	public BankAccount(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}
	
	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		builder.setLength(0);
		builder.append(String.format("Holder Name: %s\n", this.holder));
		builder.append(String.format("Account Balance: %.2f\n", this.balance));
		return builder.toString()  ;
	}
}
