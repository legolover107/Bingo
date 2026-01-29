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
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP'   `Yb",
                                       "8)   | (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)  _| (8",
                                       "Yb |_  dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)  _| (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP'   `Yb",
                                       "8) |_| (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_  (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_  (8",
                                       "Yb |_| dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8)   | (8",
                                       "Yb   | dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_| (8",
                                       "Yb |_| dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       " ,gPPRg, ",
                                       "dP' _ `Yb",
                                       "8) |_| (8",
                                       "Yb  _| dP",
                                       " \"8ggg8\" ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)| |",
                                       "    Yb|_|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'  ",
                                       "    8)  |",
                                       "    Yb  |",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8) _|",
                                       "    Yb|_ ",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8) _|",
                                       "    Yb _|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'  ",
                                       "    8)|_|",
                                       "    Yb  |",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)|_ ",
                                       "    Yb _|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)|_ ",
                                       "    Yb|_|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)  |",
                                       "    Yb  |",
                                       "     \"8gg",
                                       "         ",
                                       "         "},

                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)|_|",
                                       "    Yb|_|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},

                                      {"         ",
                                       "     ,gPP",
                                       "    dP'_ ",
                                       "    8)|_|",
                                       "    Yb _|",
                                       "     \"8gg",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "| |8     ",
                                       "|_|P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " `Yb     ",
                                       " |(8     ",
                                       " |dP     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       " _|8     ",
                                       "|_ P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       " _|8     ",
                                       " _|P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " `Yb     ",
                                       "|_|8     ",
                                       "  |P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "|_ 8     ",
                                       " _|P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "|_ 8     ",
                                       "|_|P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "  |8     ",
                                       "  |P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "|_|8     ",
                                       "|_|P     ",
                                       "g8\"      ",
                                       "         ",
                                       "         "},
                                      {"         ",
                                       "Rg,      ",
                                       " _Yb     ",
                                       "|_|8     ",
                                       " _|P     ",
                                       "g8\"      ",
                                       "         ",
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
                                printedRow += checkedNums[Integer.parseInt(tempItem)][i];
                                printedRow += goodLookingNums[11][i];
                            } else {
                                for(int j = 0; j < tempItem.length(); j++) {
                                    if (j%2 == 0) {
                                        printedRow += checkedNums[Integer.parseInt(tempItem.substring(j, j+1)) + 10][i];
                                    } else {
                                        printedRow += checkedNums[Integer.parseInt(tempItem.substring(j, j+1)) + 20][i];
                                    }
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

    public boolean markCard(int num) {
        for (int i = 0; i < 5; i++) {
            if (card[(num-1)/15][i] == num) {
                boardIsChecked[(num-1)/15][i] = true;
                return true;
            }
        }
        return false;
    }

    public boolean hasBingo() {
        boolean[] checkFor = {true, true, true, true, true};
        for (boolean[] col:boardIsChecked) {
            if (col.equals(checkFor)) {
                return true;
            }
        }
        for (int i = 0; i < boardIsChecked[0].length; i++) {
            for (int j = 0; j < boardIsChecked.length; j++) {
                if (!boardIsChecked[j][i]) {
                    break;
                }
                if (j == boardIsChecked.length - 1) {
                    return true;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (!boardIsChecked[i][i]) {
                break;
            }
            if (i == 4) {
                return true;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (!boardIsChecked[4-i][i]) {
                break;
            }
            if (i == 4) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String toReturn = "  B   I   N   G   O \n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (boardIsChecked[j][i]) {
                    toReturn += "(";
                } else {
                    toReturn += " ";
                }

                if (card[i][j] / 10 == 0) {
                    toReturn += " " + card[i][j];
                } else {
                    toReturn += card[i][j];
                }

                if (boardIsChecked[i][j]) {
                    toReturn += ")";
                } else {
                    toReturn += " ";
                }
            }
            toReturn += "\n";
        }
        return toReturn;
    }

}