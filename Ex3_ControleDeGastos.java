import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ControleDeGastos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> gastos = new ArrayList<>();
        System.out.println("Digite valores de gastos (digite 0 para encerrar):");
        while (true) {
            double v = 0;
            try { v = Double.parseDouble(sc.nextLine().trim()); } catch (Exception e) { System.out.println("Entrada inválida"); continue; }
            if (v == 0.0) break;
            gastos.add(v);
        }
        double soma = 0;
        System.out.println("Gastos:"); 
        for (double g : gastos) { System.out.println(g); soma += g; }
        double media = gastos.isEmpty() ? 0 : soma / gastos.size();
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);
        sc.close();
    }
}
