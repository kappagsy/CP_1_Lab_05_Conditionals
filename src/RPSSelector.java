public class RPSSelector
{
    public static void main(String[] args)
    {
        String playerMove = "R"; //must be R, P, or S

        playerMove.toUpperCase(); //forces user's input to be upper case

        //closed set can only be R, P, or S
        if(playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P"))
        {
            System.out.println("Paper!");
        }
        else //if it's not Rock or Paper it must be Scissors
        {
            System.out.println("Scissors!");
        }
        //open set can be R,P,S or anything else
        if(playerMove.equalsIgnoreCase("R"))
        {
            System.out.println("Rock!");
        }
        else if (playerMove.equalsIgnoreCase("P"))
        {
            System.out.println("Paper!");
        }
        else if (playerMove.equalsIgnoreCase("S"))
        {
            System.out.println("Scissors!");
        }
        else //error occurs
        {
            System.out.println("This is not a valid move!");
        }

    }


}
