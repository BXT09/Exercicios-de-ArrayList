import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_FiltrarPalavrasCurtas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:"); 
        String text = sc.nextLine();
        String[] parts = text.split("\\s+"); // split por espaços
        ArrayList<String> words = new ArrayList<>();
        for (String w : parts) if (!w.isEmpty()) words.add(w);
        System.out.println("Palavras com até 4 letras:"); 
        for (String w : words) if (w.length() <= 4) System.out.println(w);
        sc.close();
    }
}
