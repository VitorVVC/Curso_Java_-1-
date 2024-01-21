package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// alt + a + enter = criar um constructor
		// alt + r + enter = criar um get set pra os metodos que eu quiser
		// Ctrl + espaco = constructor sem parametro

		// Exemplos de aula
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter product data: "); System.out.print("Name: ");
		 * String name = sc.nextLine(); System.out.print("Price: "); double price =
		 * sc.nextDouble(); System.out.print("Quantity in stock: "); int quantity =
		 * sc.nextInt(); Product product = new Product(name,price,quantity);
		 * 
		 * 
		 * System.out.println("Product data: " + product); System.out.println();
		 * 
		 * 
		 * System.out.print("Enter the number of products to be added in stock: ");
		 * quantity = sc.nextInt(); product.addProducts(quantity); System.out.println();
		 * 
		 * System.out.println("Updated data: " + product); System.out.println();
		 * 
		 * System.out.print("Enter the number of products to be removed from stock: ");
		 * quantity = sc.nextInt(); product.removeProducts(quantity);
		 * System.out.println(); System.out.println("Updated data: " + product);
		 * sc.close();
		 */

		// Exercicio ( 1 ) Fixacao

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account Account;
		
		
		System.out.print("Enter account number: ");
		int ID = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.printf("Is there na initial deposit? Use (y/n) for response: ");
		char response = sc.next().charAt(0);

		if (response == 'y'|| response == 'Y') {
			System.out.printf("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			Account = new Account(ID, name, initialDeposit);
		} else {
			Account = new Account(ID,name);
		}
		
		System.out.println("Account Data:");
		System.out.println(Account);

		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		Account.deposit(deposit);
		System.out.println("Uptade Account Data: ");
		System.out.println(Account);
		
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		Account.withdraw(withdraw);
		System.out.println("Uptade Account Data: ");
		System.out.println(Account);
		
		sc.close();
	}

}
