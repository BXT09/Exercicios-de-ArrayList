import java.util.ArrayList;
import java.util.Scanner;

public class Ex9_MenuDeProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        int opc;
        do {
            System.out.println("\nMenu:\n1-Adicionar\n2-Listar\n3-Listar > preço X\n4-Limpar\n0-Sair");
            opc = Integer.parseInt(sc.nextLine().trim());
            switch (opc) {
                case 1:
                    System.out.println("Digite preço a adicionar:"); 
                    try { precos.add(Double.parseDouble(sc.nextLine().trim())); } catch (Exception e) { System.out.println("Preço inválido"); }
                    break;
                case 2:
                    System.out.println("Preços:"); for (double p : precos) System.out.println(p); break;
                case 3:
                    System.out.println("Digite X:"); double x = Double.parseDouble(sc.nextLine().trim());
                    System.out.println("Preços maiores que " + x + ":"); for (double p : precos) if (p > x) System.out.println(p);
                    break;
                case 4:
                    precos.clear(); System.out.println("Lista limpa."); break;
                case 0: break;
                default: System.out.println("Opção inválida"); break;
            }
        } while (opc != 0);
        sc.close();
    }
}
