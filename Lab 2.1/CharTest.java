public class CharTest {
    public static void main(String[] args) {
        int character = (int) '(';
        String characterType;

        // Number 48-57
        if (character >= 48 && character <= 57) {
            characterType = "Number";
        }
        // Uppercase letter 65-90
        else if (character >= 65 && character <= 90) {
            characterType = "Uppercase Letter";
        }
        // Lowercase Letter 97-122
        else if (character >= 97 && character <= 122) {
            characterType = "Lowercase Letter";
        }
        // Other character
        else {
            characterType = "Other";
        }

        System.out.printf("The character's type is %s", characterType);
    }
}
