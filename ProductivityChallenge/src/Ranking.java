import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ranking {
    private ArrayList<Player> ranking = new ArrayList<>();

    public void addToRanking(Player player) {
        this.ranking.add(player);
    }

    public void showRanking() {
        Collections.sort(ranking);
        int i = 1;

        System.out.println("=".repeat(30));

        for(var p: ranking) {
            System.out.printf("%dº: %s com %.2f pontos.%n", i, p.getName(), p.getPoints());
            if(i == 1) {
                System.out.println("         VENCEDOR");
                System.out.println("-".repeat(30));
            }
            i++;
        }

        System.out.println("=".repeat(30));

    }

    public ArrayList<Player> getRanking() {
        return ranking;
    }
}
