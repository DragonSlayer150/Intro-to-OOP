import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Name: \n>> ");
        String firstName = input.next();

        System.out.print("Enter Your Last Name: \n>>");
        String lastName = input.next();

        System.out.printf("Hello, %s %s", lastName, firstName);
        input.close();
    }
}
