import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_CadastroDeNomesSemDuplicatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Digite nomes (digite FIM para encerrar):");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("FIM")) break;
            String normalized = line.trim();
            boolean exists = false;
            for (String n : nomes) {
                if (n.equalsIgnoreCase(normalized)) { exists = true; break; }
            }
            if (!exists) nomes.add(normalized);
            else System.out.println("Nome já cadastrado: " + normalized);
        }
        System.out.println("Lista de nomes cadastrados:");
        for (String n : nomes) System.out.println(n);
        sc.close();
    }
}
