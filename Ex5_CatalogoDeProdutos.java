import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    Produto(String nome, double preco) { this.nome = nome; this.preco = preco; }
}

public class Ex5_CatalogoDeProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();
        System.out.println("Digite produtos no formato nome;preco (digite FIM para terminar):");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("FIM")) break;
            String[] p = line.split(";", 2);
            if (p.length < 2) { System.out.println("Formato inválido"); continue; }
            try {
                double preco = Double.parseDouble(p[1].trim());
                lista.add(new Produto(p[0].trim(), preco));
            } catch (Exception e) { System.out.println("Preço inválido"); }
        }
        System.out.println("Catálogo completo:"); 
        for (Produto pr : lista) System.out.println(pr.nome + " - R$" + pr.preco);
        System.out.println("Produtos com preço > 50:"); 
        for (Produto pr : lista) if (pr.preco > 50) System.out.println(pr.nome + " - R$" + pr.preco);
        sc.close();
    }
}
