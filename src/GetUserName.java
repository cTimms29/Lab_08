import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter Your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter Your last name");

        System.out.println("\nYour full Name: " + firstName + "" + lastName);

    }
}


