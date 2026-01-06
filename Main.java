public class Main {
    public static void main(String[] args) {
        BingoPlayer[] players = new BingoPlayer[5];
        players[0] = new BingoPlayer("Bob");
        players[1] = new BingoPlayer("Bob");
        players[2] = new BingoPlayer("Bob");
        players[3] = new BingoPlayer("Bob");
        players[4] = new BingoPlayer("Bob");
        for (BingoPlayer player:players) {
            player.generateCard();
        }
        for (BingoPlayer player:players) {
            player.printCard();
        }
    }
}