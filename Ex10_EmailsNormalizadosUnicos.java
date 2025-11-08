import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_EmailsNormalizadosUnicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite e-mails separados por vírgula:"); 
        String line = sc.nextLine();
        String[] parts = line.split(",");
        ArrayList<String> emails = new ArrayList<>();
        for (String e : parts) {
            String n = e.trim().toLowerCase();
            if (!n.isEmpty() && !emails.contains(n)) emails.add(n);
        }
        System.out.println("E-mails únicos e normalizados:"); for (String em : emails) System.out.println(em);
        sc.close();
    }
}
