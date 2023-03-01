import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player caio = new Player("Caio");
        Player bia = new Player("Bia");
        Player mazzuco = new Player("Mazzuco");
        Player luca = new Player("Luca");

        Ranking ranking = new Ranking();

        ranking.addToRanking(caio);
        ranking.addToRanking(bia);
        ranking.addToRanking(mazzuco);
        ranking.addToRanking(luca);

        Scanner scanner = new Scanner(System.in);

        System.out.println(".".repeat(40));
        System.out.println("   ESTATÍSTICAS PRODUTIVAS SEMANAIS");

        for(var p: ranking.getRanking()) {
            System.out.println("\n" + " ".repeat(16) + p.getName().toUpperCase());
            System.out.println("=".repeat(40));
            boolean repeat = false;

            while(!repeat) {
                System.out.print("Quantidade de horas em rede social: ");
                repeat = p.setSocialMediaTime(scanner.nextLine());
            }

            while(repeat) {
                System.out.print("Quantidade de horas no WhatsApp: ");
                repeat = !(p.setWhatsappTime(scanner.nextLine()));
            }

            while(!repeat) {
                System.out.print("Faltas na academia: ");
                repeat = p.setWorkoutAbsences(Integer.parseInt(scanner.nextLine()));
            }

            System.out.print("Leu 50 páginas? (s/n): ");
            p.setReadBook(scanner.nextLine());

        }

        ranking.showRanking();

    }

}