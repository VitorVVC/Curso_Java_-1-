package Application;

import Model.Entities.Account;
import Model.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Teste
        /*Account account = new Account(8021,"Bob Brown",500.00,300.00);
        System.out.print("Enter amount for withdraw: ");
        Double withdraw = sc.nextDouble();

        account.withdraw(withdraw);
        System.out.println(account.getBalance());
         */

        // Progama:
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);
        System.out.print("\nEnter amount for withdraw: ");
        Double withdraw = sc.nextDouble();
        try {
            account.withdraw(withdraw);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }


    }
}