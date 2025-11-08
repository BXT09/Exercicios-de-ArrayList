import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    Contato(String n, String t) { nome = n; telefone = t; }
}

public class Ex6_AgendaDeContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();
        System.out.println("Digite contatos no formato nome;telefone (digite FIM para terminar):");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("FIM")) break;
            String[] p = line.split(";", 2);
            if (p.length < 2) { System.out.println("Formato inválido"); continue; }
            agenda.add(new Contato(p[0].trim(), p[1].trim()));
        }
        System.out.println("Digite uma letra inicial para busca:"); 
        String inicial = sc.nextLine().trim();
        if (inicial.length() > 0) {
            char c = Character.toLowerCase(inicial.charAt(0));
            System.out.println("Contatos que começam com '" + c + "':");
            for (Contato ct : agenda) if (ct.nome.toLowerCase().startsWith(String.valueOf(c))) System.out.println(ct.nome + " - " + ct.telefone);
        } else System.out.println("Inicial vazia.");
        sc.close();
    }
}
