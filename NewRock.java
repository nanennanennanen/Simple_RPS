//RockPaperScissors.java

import java.util.Random;
import java.util.Scanner;

public class NewRock {

    //counter to count the total wins
    static int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int options[] = {1, 2, 3};
        String str_option[] = {"Rock", "Paper", "Scissors"};
        int number;
        // Loop until they enter either yes or no.
        while (true) {

            // ask for input
            System.out.println("Please enter correct option.\n 1. Rock \t 2.Paper \t 3. Scissors");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = sc.nextInt();
            Random rnd = new Random();
            int index = rnd.nextInt(options.length);
            int comp_option = options[index];
            String in_String = str_option[index];
            System.out.println("Computer Select:" + in_String);
            if (number == comp_option) {
                //tie
                System.out.println("Game Tie...");
            } else if (number == 1 && comp_option == 3) {
                //user enters rock and computer select scissors, then user wins
                counter++;
                System.out.println("User win...");
            } else if (number == 3 && comp_option == 2) {
                //user selects Scissors and computer select paper then user wins as Scissors beats paper
                counter++;
                System.out.println("User win...");
            } else if (number == 2 && comp_option == 1) {
                //user selects Paper and computer selects Rock the user wins as Paper beats Rock
                counter++;
                System.out.println("User win...");
            } else {
                //otherwise user loose
                System.out.println("Computer Win...");
            }

            System.out.println("Do you want to continue? Yes/No: ");
            sc = new Scanner(System.in);
            String line = sc.nextLine();
            // Use this to check if it is yes or no
            if (line.equalsIgnoreCase("no")) {
                //if want to exit print the total wins
                System.out.println("Total Wins: " + counter);
                break;
            }

        }
    }

}

//output