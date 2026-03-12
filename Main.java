import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int getMostMarks(BingoPlayer[] bingoPlayers) {
        int[] mostMarks = {0, -1}; // num, index
        for (int i = 0; i < bingoPlayers.length; i++) {
            if (bingoPlayers[i].numOfMarks() > mostMarks[0]) {
                mostMarks[0] = bingoPlayers[i].numOfMarks();
                mostMarks[1] = i;
            }
        }
        return mostMarks[1];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //BingoPlayer.simpleNumbers = false;
        BingoPlayer[] players = new BingoPlayer[5];
        players[0] = new BingoPlayer("Bob");
        players[1] = new BingoPlayer("Fred");
        players[2] = new BingoPlayer("Ben");
        players[3] = new BingoPlayer("Jason");
        players[4] = new BingoPlayer("Aiden");

        for (BingoPlayer player:players) {
            player.generateCard();
        }

        ArrayList<Integer> hopper = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            hopper.add(i);
        }
        String[] BINGO = {"B", "I", "N", "G", "O"};
        int count = 0;
        while (count < 75) {
            int ind = (int)(Math.random() * hopper.size());
            int num = hopper.get(ind);
            hopper.remove(ind);
            System.out.println("Caller:\t" + BINGO[(num-1)/15] + " " + num);
            for (BingoPlayer player:players) {
                player.markCard(num);
            }
            System.out.println(getMostMarks(players));
            for (BingoPlayer player:players) {
                if (player.winnerFound()) {
                    System.out.println("BINGO: " + player.getName());
                    player.printCard();
                    System.exit(0);
                }
            }
            count++;
        }
        scan.close();
    }
}