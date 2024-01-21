import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> carros = new ArrayList<>();

        carros.add("Fusion");
        carros.add("Polo");
        carros.add("HB20");
        carros.add("Fusca");
        carros.add("Toro");
        carros.add("EcoSport");

        for (int i = 0; i < carros.size(); i++) {
            System.out.printf("Carro [%d]: \n", (i + 1));
            System.out.println(carros.get(i));
        }

        System.out.println("Carro numero 3: " + carros.get(4));
        // Apagar a lista {
        // carros.clear();
        // }
        // Vefifica se a lista esta vazia ou não
        //System.out.println(carros.isEmpty());

        // Ele retorna true ou false se o que voce deseja esta ou não na lista
        // lista.contains("Forza");


        // Lista de listas
        ArrayList<ArrayList<Integer>> listaDeLista = new ArrayList<>();

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(5);
        lista1.add(7);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(15);
        lista2.add(17);

        listaDeLista.add(lista1);
        listaDeLista.add(lista2);

        int x = listaDeLista.get(1).get(0);
        listaDeLista.get(1).add(21);
        System.out.println(x);


    }
}