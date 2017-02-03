import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = "yes";
        System.out.println();


        do {
            int die1 = getDiceSize();

            rollDice(die1);


            System.out.println("Play again?");
            //input.nextLine();
            String userinput2 = input.nextLine();
        }

        while (userInput.equalsIgnoreCase("yes"));
        return;



    }

    private static void rollDice(int die1) {
        System.out.println("Roll the Dice!");

        Random rn = new Random();
        int max = die1;
        int result1 = rn.nextInt(max + 1);
        int result2 = rn.nextInt(max + 1);


        System.out.println("your first dice was " + result1);
        System.out.println("your second dice was " + result2);
    }

    private static int getDiceSize() {
        Scanner input = new Scanner(System.in);
        System.out.println("what size of dice would you like to use?");

        int die1 = input.nextInt();
        input.nextLine();
        int die2 = die1;
        return die1;
    }
}





