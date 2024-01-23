import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("/Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos ) /Aula 001 - Lendo arquivos de texto com classe File e Scanner/src/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { // Boa pratica: Fechar o nosso recurso em nosso finnally. Cuidando apenas se o scanner foi ou não instanciado para fugir de uma null pointer
            if (sc != null) {
                sc.close();
            }
        }
    }
}