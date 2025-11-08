import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_TemperaturasSemanaisAlertas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temps = new ArrayList<>();
        System.out.println("Digite 7 temperaturas (uma por linha):");
        for (int i = 0; i < 7; i++) {
            try { temps.add(Double.parseDouble(sc.nextLine().trim())); } catch (Exception e) { System.out.println("Entrada inválida, tente novamente"); i--; }
        }
        System.out.println("Temperaturas:"); 
        for (double t : temps) {
            System.out.print(t);
            if (t >= 35.0) System.out.print(" - Alerta de calor");
            System.out.println();
        }
        sc.close();
    }
}
