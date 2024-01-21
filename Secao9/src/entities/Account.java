package entities;

public class Account {

	private String name;
	private int ID;
	private double cash;

	public Account(int iD,String name, double initialDeposit) {
		this.name = name;
		ID = iD;
		deposit(initialDeposit);
	}
	public Account(int iD,String name) {
		this.name = name;
		ID = iD;
	}

	public double deposit(double amount) {
		return cash += amount;
	}

	public double withdraw(double amount) {
		return cash -= amount + 5.0;
	}

	public String toString() {
		return "Account = " + ID 
							+ ", Name = " + name
							+ ", Cash = $ " 
							+String.format("%.2f%n", cash );
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public double getID() {
		return ID;
	}

}
