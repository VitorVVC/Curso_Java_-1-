import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Praticando o inicio de tratamento de excecoes
        metodo1();
        System.out.println("Fim do progama");
    }

    public static void metodo1() {
        System.out.println("* * Método 1 Iniciando * * ");
        metodo2();
        System.out.println("* * Método 1 Finalizando * * ");
    }

    public static void metodo2() {
        System.out.println("* * Metodo 2 Iniciando * * ");
        Scanner sc = new Scanner(System.in);

        try {
            // Escrita do vetor de String
            System.out.print("Escreva os items do vetor: ");
            String[] vect = sc.nextLine().split(" ");
            // Escreva a posicão do vetor que deseja ter acesso
            System.out.print("Qual posição do vetor você deseja acessar? ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input Error!");
            e.printStackTrace();
        }
        System.out.println("* * Metodo 2 Finalizando * * ");

    }
}