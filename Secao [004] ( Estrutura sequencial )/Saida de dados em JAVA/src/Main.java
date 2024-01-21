import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Assim na exibicão passará as virgulas para PONTOS


        // Nesta aula aprendemos a escrever na tela um texto qualquer , como:

        System.out.print("Bom dia"); // Sem quebrar linha
        System.out.println("Bom dia"); // Com quebra de linha


        // Para exibir algo ja instanciado na memoria:

        int x = 32;
        System.out.println(x);

        // Para escrever o conteúdo de uma variavel com ponto flutuante:

        double x2 = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x2);
        System.out.printf("%.4f%n", x2);

        // Para concatenar varios elementos em uma mesma linha de comando:

        System.out.println("Olá! " + x + " estou concatenando");

        // Concatenar com printf:
        String nome = "Maria";
        int idade = 32;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        // (%s --> String || %d --> Inteiros || %.Nf --> Double || %n --> Quebrar linha )

    }
}
