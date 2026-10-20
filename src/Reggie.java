import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(console, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");

        System.out.println("Collected " + ssn + " from the user!");

        mNumber = SafeInput.getRegExString(console, "Enter your M number", "^(M|m)\\d{5}$");

        System.out.println("Collected " + mNumber + " from the user!");

        menuChoice = SafeInput.getRegExString(console, "Enter your choice\n\tO - Open\n\tS - Save\n\tV - Quit", "^[OoSsVvQq]$");

        System.out.println("Collected " + menuChoice + " from the user!");
    }
}