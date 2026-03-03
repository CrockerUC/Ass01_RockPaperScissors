import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;

        do {
            System.out.println("Player A - Enter R, P, or S: ");
            playerA = in.nextLine();
            if (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")))
            {
                System.out.println("Invalid input. Please enter R, P, or S.");
            }
            while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")))
            {
                System.out.println("Player A - Enter R, P, or S: ");
                playerA = in.nextLine();
            }
            do {
                System.out.println("Player B - Enter R, P, or S: ");
                playerB = in.nextLine();
                if (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")))
                {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            } while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")));
            System.out.println();

            if (playerA.equalsIgnoreCase(playerB))
            {
                if(playerA.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock: It's a tie!");
                }
                else if(playerA.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper: It's a tie!");
                }
                else if(playerA.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors: It's a tie!");
                }
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors: Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock: Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper: Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors: Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock: Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors cuts Paper: Player B wins!");
            }
            System.out.println("Play again? (Y/N)");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}
