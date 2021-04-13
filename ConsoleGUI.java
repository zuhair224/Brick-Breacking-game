package sample;

import java.lang.management.LockInfo;
import java.util.Random;
import java.util.Scanner;

public class ConsoleGUI {

    public static String[] colors = {"red","blue","yellow"};
    public int TILE_SIZE = 40 , TILES = 15;

    static Scanner sc = new Scanner(System.in);

    static final int borad = 15;

    static Tile[][] array_board = new Tile[borad][borad]; // array board

    int PROW = 0 ;
    static int LIVES = 3;

    static GameState gameState = GameState.PLAYING;


    public static void main(String[] args) {


        generateT();
        printBoard();
        //isGameOver();


        //print(""+array_board.length);
        //if not game over...
        while (!isGameOver()){


            try {


                getUserinput();
                useLive();



            }catch (Exception e){
                print("Message : "+e.getMessage());
            }

        }


    }



    private static void removeSameColorTiles(int row , int col){

        String color = array_board[row][col].getColor();

        for (int i = 0; i < borad; i++){
            for (int j = 0; j < borad; j++){
                if(array_board[i][j].getColor().equalsIgnoreCase(color)){
                    array_board[i][j].setValue(0);
                }
            }
        }


    }

    public static  void MoveTiles(){

    //for row 14 - 13 - colum
    for (int i = 0 ; i < borad; i++){
        if(array_board[14][i].getValue() == 0){
            array_board[14][i].setValue(array_board[13][i].getValue());
            array_board[13][i].setValue(0);
           // print("...MOVED SUCCESS...");
        }
    }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][14].getValue() == 0){
                array_board[i][14].setValue(array_board[i][13].getValue());
                array_board[i][13].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }


        //for row 13 - 12
        for (int i = 0 ; i < borad; i++){
            if(array_board[13][i].getValue() == 0){
                array_board[13][i].setValue(array_board[12][i].getValue());
                array_board[12][i].setValue(0);
               // print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][13].getValue() == 0){
                array_board[i][13].setValue(array_board[i][12].getValue());
                array_board[i][12].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 12 - 11
        for (int i = 0 ; i < borad; i++){
            if(array_board[12][i].getValue() == 0){
                array_board[12][i].setValue(array_board[11][i].getValue());
                array_board[11][i].setValue(0);
               // print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][12].getValue() == 0){
                array_board[i][12].setValue(array_board[i][11].getValue());
                array_board[i][11].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }


        //for row 11 - 10
        for (int i = 0 ; i < borad; i++){
            if(array_board[11][i].getValue() == 0){
                array_board[11][i].setValue(array_board[10][i].getValue());
                array_board[10][i].setValue(0);
               // print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][11].getValue() == 0){
                array_board[i][11].setValue(array_board[i][10].getValue());
                array_board[i][10].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 10 - 9
        for (int i = 0 ; i < borad; i++){
            if(array_board[10][i].getValue() == 0){
                array_board[10][i].setValue(array_board[9][i].getValue());
                array_board[9][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][10].getValue() == 0){
                array_board[i][10].setValue(array_board[i][9].getValue());
                array_board[i][9].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }


        //for row 9 - 8
        for (int i = 0 ; i < borad; i++){
            if(array_board[9][i].getValue() == 0){
                array_board[9][i].setValue(array_board[8][i].getValue());
                array_board[8][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][9].getValue() == 0){
                array_board[i][9].setValue(array_board[i][8].getValue());
                array_board[i][8].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }


        //for row 8 - 7
        for (int i = 0 ; i < borad; i++){
            if(array_board[8][i].getValue() == 0){
                array_board[8][i].setValue(array_board[7][i].getValue());
                array_board[7][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][8].getValue() == 0){
                array_board[i][8].setValue(array_board[i][7].getValue());
                array_board[i][7].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 7 - 6
        for (int i = 0 ; i < borad; i++){
            if(array_board[7][i].getValue() == 0){
                array_board[7][i].setValue(array_board[6][i].getValue());
                array_board[6][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][7].getValue() == 0){
                array_board[i][7].setValue(array_board[i][6].getValue());
                array_board[i][6].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 5 - 4
        for (int i = 0 ; i < borad; i++){
            if(array_board[5][i].getValue() == 0){
                array_board[5][i].setValue(array_board[4][i].getValue());
                array_board[4][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][5].getValue() == 0){
                array_board[i][5].setValue(array_board[i][4].getValue());
                array_board[i][4].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 4 - 3
        for (int i = 0 ; i < borad; i++){
            if(array_board[4][i].getValue() == 0){
                array_board[4][i].setValue(array_board[3][i].getValue());
                array_board[3][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][4].getValue() == 0){
                array_board[i][4].setValue(array_board[i][3].getValue());
                array_board[i][3].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 3 - 2
        for (int i = 0 ; i < borad; i++){
            if(array_board[3][i].getValue() == 0){
                array_board[3][i].setValue(array_board[2][i].getValue());
                array_board[2][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][3].getValue() == 0){
                array_board[i][3].setValue(array_board[i][2].getValue());
                array_board[i][2].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 2 - 1
        for (int i = 0 ; i < borad; i++){
            if(array_board[2][i].getValue() == 0){
                array_board[2][i].setValue(array_board[1][i].getValue());
                array_board[1][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][2].getValue() == 0){
                array_board[i][2].setValue(array_board[i][1].getValue());
                array_board[i][1].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }

        //for row 1 - 0
        for (int i = 0 ; i < borad; i++){
            if(array_board[1][i].getValue() == 0){
                array_board[1][i].setValue(array_board[0][i].getValue());
                array_board[0][i].setValue(0);
                //print("...MOVED SUCCESS...");
            }
        }

        //for row 14 - 13 - row
        for (int i = 0 ; i < borad; i++){
            if(array_board[i][1].getValue() == 0){
                array_board[i][1].setValue(array_board[i][0].getValue());
                array_board[i][0].setValue(0);
                // print("...MOVED SUCCESS...");
            }
        }



    }

    private static void getUserinput() {

        print("Enter valid row and column :");
        int row = sc.nextInt();
        int col = sc.nextInt();

        if(!isValidIndex(row) && !isValidIndex(col)) {

            array_board[row][col].setValue(0);

            MoveTiles();

            printBoard();

            //if game is over...
            if(isGameOver()){
                print("****************************************");
                print("* YOU WON , there are no tiles left... *");
                print("****************************************");
                return;
            }


        }else{
            print("Please enter valid index between 0 - 14 ");
            print("Please enter valid row and column : ");

        }

    }

    private static void useLive() {

        if(LIVES > 0) {

            print("YOU CAN USE ONLY 3 LIVES: ");
            print("WANNA USE LIVE ? ");
            print("Enter 1 to use Live: ");
            print("Enter 0 to avoid : ");

            int choice = sc.nextInt();
            if(choice == 1){
                LIVES--;
                print("Your remaining lives: "+LIVES);
                print("Enter row and column : ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                removeSameColorTiles(row,col);

                getUserinput();


            }else {

               getUserinput();



            }

        }

    }

    public  static boolean isValidIndex(int index){
        if(index > 14){
            return  true;
        }
        return false;
    }

    //check if game is over...
    public static boolean isGameOver(){
        int count = 0;

        for (int i =0 ; i < borad; i ++){
            for (int j =0 ; j < borad; j ++){

                if(array_board[i][j].getValue() == 0){
                    count ++;
                }

            }
        }


        if(count == 225){
            return true;
        }


        //print("EMPTY BOARD : " + count);


        return false;
    }

    public static void  generateT(){

        //setAllEmpty();


        //1 = red : 2 = blue : 3 = yellow
        print("Brick Breaking - GAME");
        print("----------------------------------------");
        print("Instructions:");
        print("It has 3 colors , mentioned below.");
        print("1 = red : 2 = blue : 3 = yellow : 0 = empty");
        print("GAME RULES");
        print("This game has the board of 15 X 15 rows and columns.");
        print("This game removes the same color tiles on the same row ,column and diagonally.");
        print("Enter the indexes between (0-14) to play...");
        print("If you want to remove the same color on the whole board , you can use live.");
        print("If all board gets empty : player wins ! ");
        print("LIVES : 3");
        print("----------------------------------------");


        for (int i =0 ; i < borad; i ++){
            for (int j =0 ; j < borad; j ++){
                array_board[i][j] = new Tile();

                    String c = colors[(new Random()).nextInt(colors.length)];
                    //print(c);

                    if (c.equalsIgnoreCase("red")) {
                        array_board[i][j].setValue(1);
                        array_board[i][j].setColor("red");
                    } else if (c.equalsIgnoreCase("blue")) {
                        array_board[i][j].setValue(2);
                        array_board[i][j].setColor("blue");
                    } else if (c.equalsIgnoreCase("yellow")) {
                        array_board[i][j].setValue(3);
                        array_board[i][j].setColor("yellow");
                    }



            }
        }

        //printBoard();


    }

    public static void setAllEmpty(){
        for (int i =0 ; i < borad; i ++){
            for (int j =0 ; j < borad; j ++){
                array_board[i][j].setValue(0);
            }}
    }


    public static String toStringM(){

        String dt = "[";
        for (int i =0 ; i < borad; i++){
            dt+= "\n";
            for (int j =0 ; j < borad; j ++){
                dt+= array_board[i][j].getValue() + " | ";
            }
        }
        dt += "\n]";

        return dt;
    }


    static void printBoard(){
        System.out.println(toStringM());
    }


    //to display message
    public static void print(String sting){
        System.out.println(sting);
    }

}
