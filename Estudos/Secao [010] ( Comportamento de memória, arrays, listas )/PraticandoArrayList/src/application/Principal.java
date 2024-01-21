package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Exercicio de matrizes ( Resolvido )

		/*
		 * System.out.print("Digite o tamanho da matriz quadrada : "); int n =
		 * sc.nextInt(); int[][] matriz = new int[n][n];
		 * 
		 * int contNegativos = 0;
		 * 
		 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j <
		 * matriz[i].length; j++) { matriz[i][j] = sc.nextInt(); } }
		 * System.out.println("Diagonal Principal: "); for (int i = 0; i <
		 * matriz.length; i++) { for (int j = 0; j < matriz[i].length; j++) { if
		 * (matriz[i] == matriz[j]) { System.out.print(matriz[i][j]+ " "); } } }
		 * System.out.println();
		 * 
		 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j <
		 * matriz[i].length; j++) { if(matriz[i][j] < 0) { contNegativos ++; } } }
		 * System.out.print("Total de numeros negativos: "+contNegativos);
		 */
		

		System.out.print("Digite o tamanho da LINHA da matriz: ");
		int linha = sc.nextInt();
		System.out.print("Digite o tamanho da COLUNA da matriz: ");
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Entre agora com o numero X: ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (x == matriz[i][j]) {
					System.out.print("\nPosition: " + i + ", " + j);
					if (j > 0) {
						System.out.print("\nLeft: " + matriz[i][j - 1]);
					}
					if (i < 0) {
						System.out.print("\nUp: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.print("\nRight: " + matriz[i][j + 1]);
					}
					if (i < matriz[i].length - 1) {
						System.out.print("\nDown: " + matriz[i + 1][j]);
					}
				}

			}
		}

		sc.close();
	}

}