import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Caminho exemplo:
        //   /Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos )/Aula 006 - Informacoes do caminho do arquivo
        //   /Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos

        // Recebendo do usuario um caminho para a pasta desejada\\
        System.out.println("Enter a folder path: ");

        // Receber o arquivo
        String strPath = sc.nextLine();
        // Criar um "arquivo" baseado no dado fornecido pelo usuario
        File path = new File(strPath);

        System.out.println("getname: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}