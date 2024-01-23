import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String source = "/Users/vitorvargas/Desktop/Cursos/Cursos JAVA/Curso Java --> 1/Estudos/Secao [017] ( Trabalhando com arquivos ) /Aula 007 - Exercicio Proposto/src/source.csv";
        File sourceFile = new File(source);
        String sourceFolderStr = sourceFile.getParent();

        String newFolder = sourceFolderStr + File.separator + "out";
        boolean success = new File(newFolder).mkdir();
        String targetFileStr = sourceFolderStr + File.separator + "out" + File.separator + "summary.csv";

        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(source))) {
            String line = br.readLine();


            while (line != null) {
                String[] partes = line.split(",");
                String nome = partes[0];
                double preco = Double.parseDouble(partes[1]);
                int quantity = Integer.parseInt(partes[2]);

                produtos.add(new Produto(nome, preco, quantity));
                line = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Produto products : produtos) {
                    bw.write(products.getName() + "," + String.format("%.2f", products.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}