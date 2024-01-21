package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// Exercicio ( 1 )

		/*
		 * Rectangle rect = new Rectangle(); Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter rectangle with width and height");
		 * 
		 * rect.altura = sc.nextDouble(); rect.largura = sc.nextDouble();
		 * 
		 * 
		 * System.out.printf("AREA = %.2f%n",rect.area());
		 * System.out.printf("Perimeter = %.2f%n",rect.perimeter());
		 * System.out.printf("Diagonal = %.2f%n",rect.diagonal());
		 */

		// Exercicio ( 2 )

		/*
		 * Employee emp = new Employee(); Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Name: "); emp.name = sc.nextLine();
		 * System.out.println("Gross Salary: "); emp.grossSalary = sc.nextDouble();
		 * System.out.println("Tax: "); emp.tax = sc.nextDouble();
		 * 
		 * System.out.println("Employee: "+emp);
		 * System.out.println("Which percentage you to increase salary?"); double
		 * percentage = sc.nextDouble(); emp.increaseSalary(percentage);
		 * 
		 * System.out.println(); System.out.println("Uptaded data: "+emp); sc.close();
		 */

		// Exercicio ( 3 )

		/*
		 * Student stu = new Student(); Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Insira na ordem : Seu nome e notas nas provas respectivas");
		 * stu.name = sc.nextLine(); stu.av1 = sc.nextDouble(); stu.av2 =
		 * sc.nextDouble(); stu.av3 = sc.nextDouble();
		 * 
		 * System.out.println("Final Grade = "+stu.finalGrade());
		 * 
		 * if (stu.finalGrade() < 60) { System.out.println("FAILED");
		 * System.out.printf("Missing = %.2f Points%n",stu.missingPoints()); }else {
		 * System.out.println("Final Grade = "+stu.finalGrade());
		 * 
		 * }
		 */

		// Exercicio ( 1 ) = Fixacao
		/*Scanner sc = new Scanner(System.in);

		System.out.println("What is dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();

		double result = CurrencyConverter.converter(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f",result);
		
		sc.close();*/
		
		

	}

}
