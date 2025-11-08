import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_RemoverItensPorCriterio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Digite palavras (digite FIM para terminar):");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("FIM")) break;
            if (!line.isEmpty()) lista.add(line);
        }
        System.out.println("Digite tamanho mínimo (inteiro):");
        int min = Integer.parseInt(sc.nextLine().trim());
        lista.removeIf(s -> s.length() < min);
        System.out.println("Lista final:"); 
        for (String s : lista) System.out.println(s);
        sc.close();
    }
}
