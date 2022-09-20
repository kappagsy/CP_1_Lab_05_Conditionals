public class RPSGame
{
    public static void main(String[] args)
    {
        String playerA = "R";
        String playerB = "R";

        if(playerA.equalsIgnoreCase("R"))
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock It's a TIE!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock! Player B wins!");
            }
            else //playerB must be Scissors
            {
                System.out.println("Rock breaks Scissors! Player A wins!");
            }
        }

        else if (playerA.equalsIgnoreCase("P"))
        {
            if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
            else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper, it's a TIE!");
                }
            else //playerB must be Scissors
                {
                    System.out.println("Scissors cuts Paper! Player B wins!");
                }
        }

        else //playerA is scissors
        {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut Paper! Player A wins!");
                }
                else //playerB must be Scissors
                {
                    System.out.println("Scissors vs Scissors, it's a TIE!");
                }
        }
    }
}
