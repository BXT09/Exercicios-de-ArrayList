import java.util.ArrayList;
import java.util.Scanner;

public class Ex12_FilaDeAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fila = new ArrayList<>();
        System.out.println("Digite nomes para a fila (digite FIM para terminar):");
        while (true) {
            String l = sc.nextLine().trim();
            if (l.equalsIgnoreCase("FIM")) break;
            if (!l.isEmpty()) fila.add(l);
        }
        System.out.println("Digite número de rotações k (inteiro >= 0):"); 
        int k = Integer.parseInt(sc.nextLine().trim());
        k = (fila.isEmpty()) ? 0 : k % (fila.size());
        for (int i = 0; i < k; i++) {
            String first = fila.remove(0);
            fila.add(first);
        }
        System.out.println("Ordem final da fila:"); for (String s : fila) System.out.println(s);
        sc.close();
    }
}
