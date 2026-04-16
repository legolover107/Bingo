import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
        try {
            File f = new File("birthdayFile.txt");
            Scanner scan = new Scanner(f);
            ArrayList<ArrayList<String>> students = new ArrayList<>();
            while (scan.hasNextLine()) {
                ArrayList<String> temp = new ArrayList<>();
                String str = scan.nextLine();
                String[] temp1 = str.split(" ");
                for (String str1:temp1) {
                    if (str1.equals("II,")) {

                    } if (str1.endsWith(",")) {
                        temp.add(str1.substring(0, str1.length() - 1));
                    } else {
                        temp.add(str1);
                    }
                }
                students.add(temp);
            }
            String[] names = new String[students.size()];
            for (int i = 0; i < students.size(); i++) {
                names[i] = students.get(i).get(1);
            }
            //BingoPlayer.simpleNumbers = false;
            String[] selectedNames = new String[5];
            //for (i = 0;)
            BingoPlayer[] players = new BingoPlayer[5];
            players[0] = new BingoPlayer();
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
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
        }
    }
}