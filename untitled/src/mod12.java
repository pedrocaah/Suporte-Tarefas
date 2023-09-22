import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class mod12 {

    public static void main(String[] args) {
        Tarefa1();
        Tarefa2();
    }

    private static void Tarefa1() {
        System.out.println("****Tarefa 1****");
        String[] nomes = {"Pedro", "Julia", "Jorge", "Laura", "Simone"};

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void Tarefa2() {
        System.out.println("****Tarefa 2****");
        //Map<String, String> lista = new TreeMap<>();
        //String String = lista.put("Pedro - M", "Laura - F", "Jorge - M", "Simone - F", "Julia - F");
        String[] nomesGenero = {"Pedro - M, Julia - F, Jorge - M, Laura - F, Simone - F"};
        for (String generos : nomesGenero) {
            String[] partes = generos.split(",");
            String nomes = partes[0];
            String genero = partes[1];
            System.out.println(Arrays.toString(partes));
        }
    }
}



