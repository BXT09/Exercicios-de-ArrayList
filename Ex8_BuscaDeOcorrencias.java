import java.util.ArrayList;
import java.util.Scanner;

public class Ex8_BuscaDeOcorrencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> codigos = new ArrayList<>();
        System.out.println("Digite códigos (um por linha). Digite FIM para terminar:"); 
        while (true) {
            String l = sc.nextLine().trim();
            if (l.equalsIgnoreCase("FIM")) break;
            if (!l.isEmpty()) codigos.add(l);
        }
        String alvo;
        do {
            System.out.println("Digite alvo para contar (ou SAIR para encerrar):");
            alvo = sc.nextLine().trim();
            if (alvo.equalsIgnoreCase("SAIR")) break;
            int count = 0;
            for (String c : codigos) if (c.equals(alvo)) count++;
            System.out.println("O código '" + alvo + "' aparece " + count + " vezes.");
        } while (true);
        sc.close();
    }
}
