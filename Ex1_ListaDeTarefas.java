import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_ListaDeTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tarefas separadas por vírgula (ex: estudar,exercicios,descanso):");
        String line = sc.nextLine();
        String[] parts = line.split(",");
        ArrayList<String> tarefas = new ArrayList<>();
        for (String p : parts) {
            String t = p.trim();
            if (!t.isEmpty()) tarefas.add(t);
        }
        System.out.println("Tarefas:"); 
        int i = 1;
        for (String t : tarefas) {
            System.out.println(i++ + ") " + t);
        }
        sc.close();
    }
}
