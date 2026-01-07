import java.util.ArrayList;

public class BingoPlayer {
    private String name;
    private int[][] card = new int[5][5];
    private boolean[][] boardIsChecked = new boolean[5][5];
    private String[][] goodLookingNums = {{ "   ###   ",
                                            "  #   #  ",
                                            " #     # ",
                                            " #     # ",
                                            " #     # ",
                                            "  #   #  ",
                                            "   ###   ",
                                            "         "},
                                           {"    #    ",
                                            "   ##    ",
                                            "  # #    ",
                                            "    #    ",
                                            "    #    ",
                                            "    #    ",
                                            "  #####  ",
                                            "         "},
                                           {"  #####  ",
                                            " #     # ",
                                            "       # ",
                                            "  #####  ",
                                            " #       ",
                                            " #       ",
                                            " ####### ",
                                            "         "},
                                           {"  #####  ",
                                            " #     # ",
                                            "       # ",
                                            "  #####  ",
                                            "       # ",
                                            " #     # ",
                                            "  #####  ",
                                            "         "},
                                           {" #       ",
                                            " #    #  ",
                                            " #    #  ",
                                            " #    #  ",
                                            " ####### ",
                                            "      #  ",
                                            "      #  ",
                                            "         "},
                                           {" ####### ",
                                            " #       ",
                                            " #       ",
                                            " ######  ",
                                            "       # ",
                                            " #     # ",
                                            "  #####  ",
                                            "         "},
                                           {"  #####  ",
                                            " #     # ",
                                            " #       ",
                                            " ######  ",
                                            " #     # ",
                                            " #     # ",
                                            "  #####  ",
                                            "         "},
                                           {" ####### ",
                                            " #    #  ",
                                            "     #   ",
                                            "    #    ",
                                            "   #     ",
                                            "   #     ",
                                            "   #     ",
                                            "         "},
                                           {"  #####  ",
                                            " #     # ",
                                            " #     # ",
                                            "  #####  ",
                                            " #     # ",
                                            " #     # ",
                                            "  #####  ",
                                            "         "},
                                           {"  #####  ",//0
                                            " #     # ",//1
                                            " #     # ",//2
                                            "  ###### ",//3
                                            "       # ",//4
                                            " #     # ",//5
                                            "  #####  ",//6
                                            "         "},
                                           {"     ",
                                            "     ",
                                            "     ",
                                            "     ",
                                            "     ",
                                            "     ",
                                            "     ",
                                            "     "},
                                           {"    ",
                                            "    ",
                                            "    ",
                                            "    ",
                                            "    ",
                                            "    ",
                                            "    ",
                                            "    "}};//7
    private String[][] checkedNums = {{"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) | | (8",
                                       "Yb |_| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP'   `Yb",
                                       "8)   | (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)  _| (8",
                                       "Yb |_  dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)  _| (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP'   `Yb",
                                       "8) |_| (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_  (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_  (8",
                                       "Yb |_| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)   | (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_| (8",
                                       "Yb |_| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_| (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)| |",
                                       "    Yb|_|",
                                       "     \"8gg",
                                       "         "},
                                      {"         ",
                                       "Rg, ",
                                       " `Yb",
                                       "8) | | (8",
                                       "Yb.|_|,dP",
                                       " \"8ggg8\" ",
                                       "         "}};
    private String[] freeSpace = {"  .------------.  ",//0
                                  "  |   _________|  ",//1
                                  "  |  |            ",//2
                                  "  |  '-----.      ",//3
                                  "  |  .-----'      ",//4
                                  "  |  |            ",//5
                                  "  |  |            ",//6
                                  "  '--'            "};//7

    public BingoPlayer(String name) {
        this.name = name;
        card = new int[5][5];
        boardIsChecked = new boolean[5][5];
        boardIsChecked[2][2] = true;
    }

    public String getName() {
        return name;
    }

    public void generateCard() {
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> I = new ArrayList<>();
        ArrayList<Integer> N = new ArrayList<>();
        ArrayList<Integer> G = new ArrayList<>();
        ArrayList<Integer> O = new ArrayList<>();
        ArrayList<ArrayList<Integer>> bingoNums = new ArrayList<>(java.util.Arrays.asList(B, I, N, G, O));
        int count = 1;
        for (int i = 0; i < 5; i++) {
            int temp = count + 14;
            for (int j = count; j <= temp; j++,count++) {
                bingoNums.get(i).add(j);
                //System.out.print(j + " ");
            }
            //System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==2&&i==2) {
                    card[j][i] = 0;
                } else {
                    int temp = (int)(Math.random()*bingoNums.get(i).size());
                    card[j][i] = bingoNums.get(i).get(temp);
                    bingoNums.get(i).remove(temp);
                }
            }
        }
    }

    public void printCard() {
        System.out.println( "  .----------------.     .----------------.     .-----------------.    .----------------.     .----------------. \n" + //
                            " | .--------------. |   | .--------------. |   | .--------------. |   | .--------------. |   | .--------------. |\n" + //
                            " | |   ______     | |   | |     _____    | |   | | ____  _____  | |   | |    ______    | |   | |     ____     | |\n" + //
                            " | |  |_   _  \\   | |   | |    |_   _|   | |   | ||_   \\|_   _| | |   | |  .' ___  |   | |   | |   .'    '.   | |\n" + //
                            " | |    | |_) |   | |   | |      | |     | |   | |  |   \\ | |   | |   | | / .'   \\_|   | |   | |  /  .--.  \\  | |\n" + //
                            " | |    |  __'.   | |   | |      | |     | |   | |  | |\\ \\| |   | |   | | | |    ____  | |   | | {  |    |  } | |\n" + //
                            " | |   _| |__) |  | |   | |     _| |_    | |   | | _| |_\\   |_  | |   | | \\ `.___]  _| | |   | |  \\  '--'  /  | |\n" + //
                            " | |  |_______/   | |   | |    |_____|   | |   | ||_____|\\____| | |   | |  `._____.'   | |   | |   '.____.'   | |\n" + //
                            " | |              | |   | |              | |   | |              | |   | |              | |   | |              | |\n" + //
                            " | '--------------' |   | '--------------' |   | '--------------' |   | '--------------' |   | '--------------' |\n" + //
                            "  '----------------'     '----------------'     '----------------'     '----------------'     '----------------' \n");
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i <= 7; i++) {
                String printedRow = "  ";
                for (int col = 0; col < 5; col++) {
                    if (card[col][row] == 0) {
                        printedRow += freeSpace[i];
                    } else {
                        String tempItem = Integer.toString(card[row][col]);
                        if (boardIsChecked[row][col]) {
                            if (tempItem.length() == 1) {
                                printedRow += goodLookingNums[10][i];
                                printedRow += goodLookingNums[Integer.parseInt(tempItem)][i];
                                printedRow += goodLookingNums[11][i];
                            } else {
                                for(int j = 0; j < tempItem.length(); j++) {
                                    printedRow += goodLookingNums[Integer.parseInt(tempItem.substring(j, j+1))][i];
                                }
                            }
                        } else {
                            if (tempItem.length() == 1) {
                                printedRow += goodLookingNums[10][i];
                                printedRow += goodLookingNums[Integer.parseInt(tempItem)][i];
                                printedRow += goodLookingNums[11][i];
                            } else {
                                for(int j = 0; j < tempItem.length(); j++) {
                                    printedRow += goodLookingNums[Integer.parseInt(tempItem.substring(j, j+1))][i];
                                }
                            }
                        }
                    }
                    printedRow += "     ";
                }
                System.out.println(printedRow);
            }
            System.out.println();
        }

        /*for (int[] row:card) {
            for (int col:row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();*/
    }

    public void markCard(int num) {
        for (int i = 0; i < 5; i++) {
            if (card[(num-1)/15][i] == num && !boardIsChecked[(num-1)/15][i]) {
                boardIsChecked[(num-1)/15][i] = true;
            }
        }
    }

}