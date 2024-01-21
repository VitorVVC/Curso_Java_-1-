package application;

import entities.Pessoa;
import entities.PessoaEX2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidade = sc.nextInt();

        double altura[] = new double[quantidade];
        char genero[] = new char[quantidade];

        double mediaTotalFeminina = 0;
        double mediaAlturaFeminina = 0;
        int quantidadeFemea = 0;
        int quantidadeMacho = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Altura da %da pessoa: ", (i + 1));
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", (i + 1));
            genero[i] = sc.next().charAt(0);
            if (genero[i] == 'f' || genero[i] == 'F') {
                mediaTotalFeminina += altura[i];
                quantidadeFemea++;
            }else if (genero[i] == 'm' || genero[i] == 'M'){
                quantidadeMacho++;
            }else{
                System.out.println("Entrada errada , reescreva.");
                i--;
            }
        }
        double maiorAltura = altura[0];
        double menorAltura = altura[0];

        for (int i = 0; i < quantidade; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("\nMenor altura: %.2f%n", menorAltura);
        System.out.printf("Maior altura: %.2f%n", maiorAltura);

        mediaAlturaFeminina = mediaTotalFeminina / quantidadeFemea;
        System.out.printf("Media das alturas das mulheres: %.2f%n",mediaAlturaFeminina);
        System.out.println("Numero de homens = "+quantidadeMacho);
    }
}