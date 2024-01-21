public class Main {
    public static void main(String[] args) {


        // Sintaxe: ( Condição ) ? valor_se_verdadeiro : valor_se_falso;

        // Exemplos:
        // ( 2 > 4 ) ? 50 : 80;
        // ( 10 != 3 ) ? "Maria" : "Alex";

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
