import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Recebendo do usuario um caminho para a pasta desejada\\
        System.out.println("Enter a folder path: ");
        // Caminho exemplo:
     //   /Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos )
     //   /Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos
        String strPath = sc.nextLine();
        File path = new File(strPath);

        // Recebendo baseando-se na pasta fornecida todas as PASTAS do local e as exibindo
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Recebendo baseando-se na pasta fornecida todos os ARQUIVOS do local e os exibindo
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        // Criando uma subpasta apartir da pasta fornecida pelo usuario.
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}