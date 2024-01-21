import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Com scanner conseguimos ler a entradada de dados do usuário !
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f%n",x);
        sc.close();

        // Outro leitores:
        sc.next(); // Le a primeira STRING
        sc.nextLine(); // Le uma linha
        sc.nextInt(); // Le um INTEIRO
        sc.nextDouble(); // Le numero com ponto flutuante
        sc.next().charAt(0); // Le um caracter no inicio da escrita ( 0 )

    }
}
