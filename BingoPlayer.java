import java.util.ArrayList;

public class BingoPlayer {
    public static boolean simpleNumbers = true;
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
                                       "dP'   `Yb",
                                       "8)  |  (8",
                                       "Yb  |  dP",
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

    public void printCard(String args) {
        if (!simpleNumbers) {
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
            for (int y = 0; y < 5; y++) {
                for (int i = 0; i < 8; i++) {
                    String toPrint = "  ";
                    for (int x = 0; x < 5; x++) { 
                        if (y == 2 && x == 2) {
                            toPrint += freeSpace[i];
                        } else if (boardIsChecked[y][x]) {
                            String tempItem = Integer.toString(card[y][x]);
                            if (tempItem.length() == 1) {
                                toPrint += goodLookingNums[10][i];
                                toPrint += checkedNums[Integer.parseInt(tempItem)-1][i];
                                toPrint += goodLookingNums[11][i];
                            } else {
                                toPrint += checkedNums[Integer.parseInt(tempItem.substring(0, 1)) + 8][i] + checkedNums[Integer.parseInt(tempItem.substring(1, 2)) + 18][i];
                            }
                        } else {
                            String tempItem = Integer.toString(card[y][x]);
                            if (tempItem.length() == 1) {
                                toPrint += goodLookingNums[10][i];
                                toPrint += goodLookingNums[Integer.parseInt(tempItem)][i];
                                toPrint += goodLookingNums[11][i];
                            } else {
                                for(int j = 0; j < tempItem.length(); j++) {
                                    toPrint += goodLookingNums[Integer.parseInt(tempItem.substring(j, j+1))][i];
                                }
                            }
                        }
                        toPrint += "     ";
                    }
                    System.out.println(toPrint);
                }
            }
        } else {
            System.out.println("  B\t I\t N\t G\t O\n");
            for (int y = 0; y < 5; y++) {
                String toPrint = " ";
                for (int x = 0; x < 5; x++) {
                    if (y == 2 && x == 2) {
                        toPrint += "F";
                    } else if (boardIsChecked[y][x]) {
                        toPrint += "[]";
                    } else {
                        if ((card[y][x]) / 10 == 0) {
                            toPrint += " ";
                        }
                        toPrint += card[y][x];
                    }
                    toPrint += "\t";
                }
                System.out.println(toPrint + "\n");
            }
        }
        System.out.println();
        System.out.print(args);
    }

    public boolean markCard(int num) {
        for (int i = 0; i < 5; i++) {
            if (card[i][(num-1)/15] == num) {
                boardIsChecked[i][(num-1)/15] = true;
                return true;
            }
        }
        return false;
    }

    /*public boolean hasBingo() {
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
    }*/

    public int numOfMarks() {
        int count = 0;
        for (boolean[] bool:boardIsChecked) {
            for (boolean b:bool) {
                if (b) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printMarks(String args) {
        System.out.println("  B\t I\t N\t G\t O\n");
        for (int y = 0; y < 5; y++) {
            String toPrint = " ";
            for (int x = 0; x < 5; x++) {
                if (y == 2 && x == 2) {
                    toPrint += "F";
                } else if (boardIsChecked[y][x]) {
                    toPrint += "[]";
                } else {
                    if ((card[y][x]) / 10 == 0) {
                        toPrint += " ";
                    }
                    toPrint += card[y][x];
                }
                toPrint += "\t";
            }
            System.out.println(toPrint + "\n");
        }
        System.out.println();
        System.out.print(args);
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