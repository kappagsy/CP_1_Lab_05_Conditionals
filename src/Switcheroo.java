public class Switcheroo
{
    public static void main(String[] args)
    {
        String playerA = "R";
        playerA.toUpperCase();

        switch(playerA)
        {
            case "R":
                System.out.println("It's a ROCK!");
                break;
            case "P":
                System.out.println("It's a PAPER!");
                break;
            case "S":
                System.out.println("It's a SCISSORS!");
                break;
            default:
                System.out.println("ILLEGAL MOVE");
                break;
        }

    }
}
