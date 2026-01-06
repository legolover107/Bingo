import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BingoPlayer[] players = new BingoPlayer[5];
        players[0] = new BingoPlayer("Bob");
        players[1] = new BingoPlayer("Fred");
        players[2] = new BingoPlayer("Ben");
        players[3] = new BingoPlayer("Jason");
        players[4] = new BingoPlayer("Aiden");

        for (BingoPlayer player:players) {
            player.generateCard();
        }

        for (BingoPlayer player:players) {
            player.printCard();
        }

        ArrayList<Integer> hopper = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            hopper.add(i);
        }
        String[] BINGO = {"B", "I", "N", "G", "O"};
        while (hopper.size() != 0) {
            int ind = (int)(Math.random() * hopper.size());
            int num = hopper.get(ind);
            System.out.println(BINGO[(num-1)/15] + num);
            hopper.remove(ind);
        }

    }
}