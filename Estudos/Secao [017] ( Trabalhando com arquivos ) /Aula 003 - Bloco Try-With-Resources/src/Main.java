import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos ) /Aula 003 - Bloco Try-With-Resources/src/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}