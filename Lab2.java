import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by johndavid on 1/31/17.
 */
public class Lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;


        System.out.println("Hey whats your name");
        name = input.nextLine();

        System.out.println(name + " Please enter a number from 1-100");


        int userNum;
        userNum = input.nextInt();

        if (userNum < 0 || userNum > 101) {
            System.out.println(name + " Sorry pick a  number from 1-100");
        } else if (userNum % 2 == 0 && userNum <= 25) {
            System.out.println(name + " your number is Even less than 25");

        } else if (userNum % 2 == 0 && userNum >= 60) {
            System.out.println(name + "  your is Even");
        } else {
            System.out.println(name + " your numnber is odd");
        }

        return;


    }


}


