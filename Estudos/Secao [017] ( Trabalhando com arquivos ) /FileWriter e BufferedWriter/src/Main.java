import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "/Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos ) /FileWriter e BufferedWriter/src/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}