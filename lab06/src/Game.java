import java.util.Random;
import java.util.Scanner;

/**
 * Created by wu673 on 9/28/16.
 */
public class Game {
    private final static int ROCK = 1;
    private final static int PAPER = 2;
    private final static int SCISSORS = 3;
    private final static int EXIT = 4;
    public static String player;
    public static String computer;

    public void runGame(){
        int play =0;
        while (play==0) {
            Scanner scanner = new Scanner(System.in);
            //int random = (int) (Math.random() * 3)+1;
            Random r= new Random();
            int random = r.nextInt(3)+1;
           // System.out.println("random"+random);
            String s = "";
            s += "Please enter an option: \n";
            s += "1. Rock\n";
            s += "2. Paper\n";
            s += "3. Scissors\n";
            s += "4. Exit\n";
            System.out.println(s);
            int input = scanner.nextInt();
            if (input != 1 && input != 2 && input != 3 && input != 4) {
                System.out.println(input);
                System.out.println("Invalid input continue");
                continue;
            }
            if (input == 4) {
                System.out.println("Thanks for playing");
                break;
            }

            int ret = checkWinner(input, random);
            switch (ret) {
                case 0:

                    System.out.print("you played " + player + "\n");
                    System.out.println("the computer played " + computer);
                    System.out.println("Draw!");
                    break;

                case 1:
                    System.out.print("you played " + player + "\n");
                    System.out.println("the computer played " + computer);
                    System.out.println("You win!");
                    break;
                case 2:
                    System.out.print("you played " + player + "\n");
                    System.out.println("the computer played " + computer);
                    System.out.println("Computer win!");
                    break;
                }

            }
        }


    private static int checkWinner(int move1,int move2){
        if(move1==move2){
            if(move1==1){
                player = "Rock";
                computer = "Rock";
            }
            if(move1==2){
                player = "Paper";
                computer = "Paper";
            }
            if(move1==3){
                player = "Scissors";
                computer = "Scissors";
            }

            return 0;
        }
        else if(move1!=move2) {
            switch (move1) {
                case 1:
                    player = "Rock";
                    if (move2 == 2) {
                        computer = "Paper";
                        return 2;
                    }
                    if (move2 == 3) {
                        computer = "Scissors";
                        return 1;
                    }
                    break;

                case 2:
                    player = "paper";
                    if (move2 == 1) {
                        computer = "Rock";
                        return 1;
                    }
                    if (move2 == 3) {
                        computer = "Scissors";
                        return 2;
                    }
                    break;

                case 3:
                    player = "Scissors";
                    if (move2 == 1) {
                        computer = "Rock";
                        return 2;
                    }
                    if (move2 == 2) {
                        computer = "Paper";
                        return 1;
                    }
                    break;

            }
        }
      return 0;

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }
}
